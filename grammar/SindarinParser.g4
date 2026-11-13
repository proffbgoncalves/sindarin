parser grammar SindarinParser;

// Analisador sintático da linguagem Sindarin 1.0 (Arduino Mega 2560)
// Trabalho prático de Compiladores - IFF
// Etapa 2: especificação sintática
//
// O parser verifica apenas a ESTRUTURA do programa. Nomes declarados, tipos,
// larguras permitidas, pinos do Mega, constância, retornos, uso de methed/cor_minui
// fora de laço etc. são regras SEMÂNTICAS (etapa 4) e não são checadas aqui.

options { tokenVocab = SindarinLexer; }

// =====================================================================
// 1. PROGRAMA
//    gwaith mi { recursos } globais funções minui mi { ... } cor mi { ... } EOF
//    Exatamente um bloco de cada tipo, nessa ordem, e o arquivo TEM de acabar
//    em cor (EOF obrigatório: não basta reconhecer um prefixo válido).
// =====================================================================
programa
    : blocoRecursos declaracaoGlobal* declaracaoFuncao* blocoSetup blocoLoop EOF
    ;

blocoRecursos : HARDWARE IN LBRACE declaracaoRecurso* RBRACE ;
blocoSetup    : SETUP IN bloco ;
blocoLoop     : LOOP IN bloco ;

// =====================================================================
// 2. RECURSOS DA PLACA (somente dentro de gwaith)
//    ceber_caro led = ceber(13) : gwath;
//    O ': valor inicial' é opcional na sintaxe; exigi-lo (ou proibi-lo) para cada
//    tipo de recurso, e checar pinos/canais do Mega, é verificação semântica.
// =====================================================================
declaracaoRecurso
    : tipoRecurso ID ASSIGN construtorPino (COLON expressao)? SEMI
    ;

tipoRecurso
    : OUTPUT          // ceber_caro   - saída digital
    | INPUT           // ceber_cen    - entrada digital
    | INPUT_PULLUP    // ceber_calad  - entrada digital com pull-up
    | ANALOG_INPUT    // nen_cen      - entrada analógica
    | PWM_OUTPUT      // nen_caro     - saída PWM
    ;

// Número de pino/canal é NUMERAL inteiro, nunca uma expressão.
construtorPino
    : DIGITAL_PIN LPAREN INT_LITERAL RPAREN    // ceber(13)
    | ANALOG_PIN  LPAREN INT_LITERAL RPAREN    // ceber_nen(0)
    ;

// =====================================================================
// 3. DECLARAÇÕES: constantes, variáveis globais e locais
//    - constante:  sador tipo nome = expressão;          (global ou local)
//    - global:     tipo nome [= expressão];              (inicializador opcional)
//    - local:      tipo nome = expressão;                (inicializador OBRIGATÓRIO)
// =====================================================================
declaracaoGlobal
    : declaracaoConstante
    | declaracaoVariavelGlobal
    ;

declaracaoConstante      : CONST tipo ID ASSIGN expressao SEMI ;
declaracaoVariavelGlobal : tipo ID (ASSIGN expressao)? SEMI ;
declaracaoVariavelLocal  : tipo ID ASSIGN expressao SEMI ;

// =====================================================================
// 4. TIPOS
//    As FORMAS dos tipos são reconhecidas aqui; restringir onde cada uma pode
//    aparecer (ex.: pen só como retorno; largura só 8/16/32) é semântica.
//    A única qualificação não numérica de tipo é aur<hí>.
//    Vetor: [tipo; tamanho]. Não há vetor aninhado (elemento é tipo escalar).
// =====================================================================
tipo
    : tipoEscalar
    | tipoVetor
    ;

tipoEscalar
    : (INT_TYPE | BYTE_TYPE) larguraInteira?    // nedia, nedia<16>, nedia_min, nedia_min<32>
    | TIME_TYPE qualificadorInstante?           // aur (duração)  ou  aur<hí> (instante)
    | BOOL_TYPE                                 // maer_peth
    | LEVEL_TYPE                                // calad_gwath
    | TEXT_TYPE                                 // peth
    | OPTIONAL_BYTE_TYPE                        // cen_min
    | FLOAT                                     // nen
    | VOID                                      // pen
    ;

larguraInteira         : LT INT_LITERAL GT ;
qualificadorInstante   : LT MILLIS GT ;
tipoVetor              : LBRACK tipoEscalar SEMI INT_LITERAL RBRACK ;

// =====================================================================
// 5. FUNÇÕES E PROCEDIMENTOS (declarados antes de minui)
//    curu tipo nome(tipo nome, ...) mi { ... }      procedimento = tipo pen
//    Parâmetro também pode ser de CAPACIDADE (nen_caro saida).
// =====================================================================
declaracaoFuncao
    : FUNCTION tipo ID LPAREN parametros? RPAREN IN bloco
    ;

parametros : parametro (COMMA parametro)* ;
parametro  : (tipo | tipoRecurso) ID ;

// =====================================================================
// 6. BLOCOS E COMANDOS
//    bloco: zero ou mais declarações locais e comandos, intercalados.
//    Não existe comando vazio ';' nem bloco solto.
// =====================================================================
bloco : LBRACE itemBloco* RBRACE ;

itemBloco
    : declaracaoConstante
    | declaracaoVariavelLocal
    | comando
    ;

comando
    : atribuicao SEMI                         # ComandoAtribuicao
    | acao                                    # ComandoAcao
    | inicializacaoSerial                     # ComandoSerialBegin
    | condicional                             # ComandoCondicional
    | selecao                                 # ComandoSelecao
    | lacoEnquanto                            # ComandoEnquanto
    | lacoPara                                # ComandoPara
    | repeticaoContada                        # ComandoRepeticao
    | lacoFacaEnquanto                        # ComandoFacaEnquanto
    | BREAK SEMI                              # ComandoInterromper
    | CONTINUE SEMI                           # ComandoContinuar
    | RETURN expressao? SEMI                  # ComandoRetorno
    ;

// Atribuição é COMANDO (não expressão): x = y = 1; é erro sintático.
// Só existe '=' simples, para identificador ou elemento de vetor.
atribuicao : ID indiceVetor? ASSIGN expressao ;
indiceVetor : LBRACK expressao RBRACK ;

// minui_peth 9600;  (sem 'caro'). Posição exigida (1º item de minui) = semântica.
inicializacaoSerial : SERIAL_BEGIN INT_LITERAL SEMI ;

// ---------------------------------------------------------------------
// Ações: sempre introduzidas por 'caro' e terminadas por ';'
//   caro pedo expr;        caro pedo_meth expr;     caro pedo_min expr;
//   caro aur_dîn duração;  caro an recurso (caro_calad|caro_nen) expr;
//   caro nome(args);
// 'caro' NÃO aparece em declaração, atribuição, condição, laço nem retorno.
// ---------------------------------------------------------------------
acao : ACTION corpoAcao SEMI ;

corpoAcao
    : SERIAL_PRINT   expressao                          # AcaoImprimir
    | SERIAL_PRINTLN expressao                          # AcaoImprimirLinha
    | SERIAL_WRITE   expressao                          # AcaoEnviarByte
    | DELAY          expressao                          # AcaoEsperar
    | TO ID (DIGITAL_WRITE | ANALOG_WRITE) expressao    # AcaoEscreverPlaca
    | chamada                                           # AcaoChamar
    ;

// caro nome(args)   - também usada nos cabeçalhos de cor_pad, sem o ';' final
chamadaAcao : ACTION chamada ;

// ---------------------------------------------------------------------
// Condicional. maer_an cond mi { } [egor_mi mi { }]
// Forma de presença: maer_an expressãoOpcional an nome mi { } [egor_mi mi { }]
// Não existe 'else if': usa-se um novo maer_an dentro de egor_mi mi { ... }
// ---------------------------------------------------------------------
condicional
    : IF expressao vinculoPresenca? IN bloco senao?
    ;

// Forma de presença: 'an nome' liga o byte lido ao nome visível só no 1º bloco.
vinculoPresenca : TO ID ;

senao : ELSE IN bloco ;

// ---------------------------------------------------------------------
// Seleção. curu_egor expr mi { curu_min expr mi { } ... [egor_mi mi { }] }
// Pelo menos um caso; egor_mi é opcional, único e último.
// ---------------------------------------------------------------------
selecao
    : SWITCH expressao IN LBRACE casoSelecao+ casoPadrao? RBRACE
    ;

casoSelecao : CASE expressao IN bloco ;
casoPadrao  : ELSE IN bloco ;

// ---------------------------------------------------------------------
// Laços
// ---------------------------------------------------------------------
lacoEnquanto      : WHILE expressao IN bloco ;                          // cor_maer cond mi { }
repeticaoContada  : REPEAT expressao IN bloco ;                         // cor_nedia n mi { }
lacoFacaEnquanto  : DO IN bloco WHILE expressao SEMI ;                  // cor_caro mi { } cor_maer cond;

// cor_pad (init; cond; atualização) mi { }  - qualquer das três partes pode ser vazia.
// Dentro do cabeçalho, declaração/atribuição/chamada OMITEM o ';' final.
lacoPara
    : FOR LPAREN inicializacaoPara? SEMI expressao? SEMI atualizacaoPara? RPAREN IN bloco
    ;

inicializacaoPara
    : tipo ID ASSIGN expressao      # InicializacaoDeclaracao
    | atribuicao                    # InicializacaoAtribuicao
    | chamadaAcao                   # InicializacaoChamada
    ;

atualizacaoPara
    : atribuicao                    # AtualizacaoAtribuicao
    | chamadaAcao                   # AtualizacaoChamada
    ;

// =====================================================================
// 7. EXPRESSÕES
//    Precedência (da MAIOR para a MENOR):
//      1. primários, chamadas, acesso a vetor, parênteses
//      2. unários  û  e  -                     (associam à direita)
//      3. *  /  %                               (esquerda)
//      4. +  -                                  (esquerda)
//      5. ==  !=  <  <=  >  >=  (mesmo nível; NÃO encadeiam: a < b < c é erro)
//      6. a   (e lógico)                        (esquerda)
//      7. egor (ou lógico)                      (esquerda)
//    Cada nível é uma regra; o nível mais baixo chama o mais alto.
// =====================================================================
expressao : expressaoOu ;

expressaoOu            : expressaoE (OR expressaoE)* ;
expressaoE             : expressaoRelacional (AND expressaoRelacional)* ;

// '?' (e não '*') é o que impede o encadeamento de comparações.
expressaoRelacional    : expressaoAditiva (operadorRelacional expressaoAditiva)? ;
operadorRelacional     : EQ | NEQ | LT | LE | GT | GE ;

expressaoAditiva       : expressaoMultiplicativa ((PLUS | MINUS) expressaoMultiplicativa)* ;
expressaoMultiplicativa: expressaoUnaria ((STAR | SLASH | PERCENT) expressaoUnaria)* ;

// Não existe '+' unário. O '-' é operador separado do numeral (-2.5 = MINUS 2.5).
expressaoUnaria
    : (NOT | MINUS) expressaoUnaria
    | primario
    ;

primario
    : literal                                              # PrimarioLiteral
    | listaVetorial                                        # PrimarioLista
    | LPAREN expressao RPAREN                              # PrimarioParenteses
    | chamada                                              # PrimarioChamada
    | ID LBRACK expressao RBRACK                           # PrimarioAcessoVetor
    | ID                                                   # PrimarioIdentificador
    | SERIAL_READ                                          # PrimarioLeituraSerial
    | MILLIS                                               # PrimarioRelogio
    | DIGITAL_READ ID                                      # PrimarioLeituraDigital
    | ANALOG_READ ID                                       # PrimarioLeituraAnalogica
    | conversao                                            # PrimarioConversao
    | construtorDuracao                                    # PrimarioDuracao
    | operacaoBits                                         # PrimarioBits
    ;

literal
    : INT_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | TRUE | FALSE
    | HIGH | LOW
    ;

// Chamada em expressão (sem 'caro'). Parênteses são obrigatórios, mesmo vazios.
chamada    : ID LPAREN argumentos? RPAREN ;

// Zero ou mais expressões separadas por vírgula, sem vírgula final.
argumentos : expressao (COMMA expressao)* ;

// [1, 2, 3]  - '[]' é aceito aqui e rejeitado na semântica (vetor tem tamanho >= 1)
listaVetorial : LBRACK argumentos? RBRACK ;

// Conversões explícitas: nen(x), nedia(x), nedia_min<16>(x)
conversao
    : (INT_TYPE | BYTE_TYPE) larguraInteira? LPAREN expressao RPAREN
    | FLOAT LPAREN expressao RPAREN
    ;

// aur(n, d): exatamente dois numerais inteiros
construtorDuracao : TIME_TYPE LPAREN INT_LITERAL COMMA INT_LITERAL RPAREN ;

// Operações sobre bits: largura OBRIGATÓRIA; complemento tem 1 argumento, as demais 2.
operacaoBits
    : (BIT_AND | BIT_OR | BIT_XOR | SHIFT_LEFT | SHIFT_RIGHT)
          larguraInteira LPAREN expressao COMMA expressao RPAREN
    | BIT_NOT larguraInteira LPAREN expressao RPAREN
    ;
