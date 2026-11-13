lexer grammar SindarinLexer;

// Analisador léxico da linguagem Sindarin 1.0 (Arduino Mega 2560)
// Trabalho prático de Compiladores - IFF - Artur e Amanda
// Etapa 1: especificação léxica (completada: literais, ID, comentários, espaços e erros)


// =====================================================================
// 1. PALAVRAS RESERVADAS (59) - sempre ANTES de ID
// =====================================================================

// ----- Blocos e estrutura -----
HARDWARE : 'gwaith';
SETUP    : 'minui';
LOOP     : 'cor';
IN       : 'mi';
TO       : 'an';
ACTION   : 'caro';

// ----- Declarações -----
CONST    : 'sador';
FUNCTION : 'curu';
RETURN   : 'dandol';

// ----- Tipos -----
INT_TYPE           : 'nedia';
BYTE_TYPE          : 'nedia_min';
BOOL_TYPE          : 'maer_peth';
LEVEL_TYPE         : 'calad_gwath';
TIME_TYPE          : 'aur';
TEXT_TYPE          : 'peth';
OPTIONAL_BYTE_TYPE : 'cen_min';
FLOAT              : 'nen';
VOID               : 'pen';

// ----- Valores lógicos e níveis digitais -----
TRUE  : 'maer';
FALSE : 'û_maer';
HIGH  : 'calad';
LOW   : 'gwath';

// ----- Controle de fluxo -----
IF       : 'maer_an';
ELSE     : 'egor_mi';     // também é o "default" do curu_egor (quem distingue é o parser)
SWITCH   : 'curu_egor';
CASE     : 'curu_min';
WHILE    : 'cor_maer';
REPEAT   : 'cor_nedia';
DO       : 'cor_caro';
FOR      : 'cor_pad';
BREAK    : 'methed';
CONTINUE : 'cor_minui';

// ----- Operadores lógicos (palavras) -----
AND : 'a';
OR  : 'egor';
NOT : 'û';

// ----- Operações sobre bits -----
BIT_AND     : 'a_min';
BIT_OR      : 'egor_min';
BIT_XOR     : 'egor_pen';
BIT_NOT     : 'û_min';
SHIFT_LEFT  : 'dûn_min';
SHIFT_RIGHT : 'rhûn_min';

// ----- Ações na placa e relógio -----
DIGITAL_WRITE : 'caro_calad';
ANALOG_WRITE  : 'caro_nen';
DELAY         : 'aur_dîn';
DIGITAL_READ  : 'cen_calad';
ANALOG_READ   : 'cen_nen';
MILLIS        : 'hí';

// ----- Comunicação serial -----
SERIAL_PRINT   : 'pedo';
SERIAL_PRINTLN : 'pedo_meth';
SERIAL_WRITE   : 'pedo_min';
SERIAL_BEGIN   : 'minui_peth';
SERIAL_READ    : 'cen';

// ----- Pinos e modos -----
DIGITAL_PIN  : 'ceber';
ANALOG_PIN   : 'ceber_nen';
INPUT        : 'ceber_cen';
INPUT_PULLUP : 'ceber_calad';
OUTPUT       : 'ceber_caro';
ANALOG_INPUT : 'nen_cen';
PWM_OUTPUT   : 'nen_caro';

// =====================================================================
// 2. OPERADORES (um token para cada; a precedência fica no parser)
// =====================================================================

// ----- Relacionais e igualdade -----
EQ  : '==';
NEQ : '!=';
LE  : '<=';
GE  : '>=';
LT  : '<';     
GT  : '>';

// ----- Atribuição (só simples; não existe +=) -----
ASSIGN : '=';

// ----- Aritméticos -----
PLUS    : '+';
MINUS   : '-';     
STAR    : '*';
SLASH   : '/';
PERCENT : '%';

// =====================================================================
// 3. DELIMITADORES
// =====================================================================
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';
SEMI   : ';';
COMMA  : ',';
COLON  : ':';      

// =====================================================================
// 4. LITERAIS (expressões regulares)
//
//    Regra geral (seção 5.2 do enunciado): o lexer reconhece o CANDIDATO
//    COMPLETO antes de aceitar um número. Por isso existe INVALID_NUMBER:
//    ele casa o candidato inteiro (ex.: 0b102, 007, 1.2.3, 2contador, 1e+)
//    e, como o ANTLR escolhe sempre o MAIOR casamento, ele vence as regras
//    válidas sempre que o candidato for mais longo que o numeral válido.
//    Em empate (numeral válido), vale a regra declarada primeiro.
// =====================================================================

// Inteiros: decimal sem zeros à esquerda, binário 0b e hexadecimal 0x.
// Os prefixos são MINÚSCULOS (0XFF e 0B1 são inválidos).
INT_LITERAL
    : DEC
    | '0b' [01]+
    | '0x' [0-9a-fA-F]+
    ;

// Ponto flutuante (nen): D.dígitos[expoente]  ou  D expoente.
// Não existem .5, 5., 01.5, 1e, sufixo f nem hexadecimal flutuante.
FLOAT_LITERAL
    : DEC '.' [0-9]+ EXPOENTE?
    | DEC EXPOENTE
    ;

// Strings: aspas duplas, sem CR/LF/U+0000 e só com os escapes \n \r \t \" \\
STRING_LITERAL
    : '"' ( ~["\\\r\n\u0000] | '\\' [nrt"\\] )* '"'
    ;

// ----- Fragmentos dos literais -----
fragment DEC      : '0' | [1-9] [0-9]* ;
fragment EXPOENTE : [eE] [+-]? [0-9]+ ;
// Caracteres que "grudam" num candidato numérico: letras, marcas, dígitos, _ e .
fragment NUMCH    : [\p{L}\p{M}\p{Nd}_.] ;

// ----- Candidatos inválidos (erros léxicos que preservam o candidato inteiro) -----
// 1a alternativa: candidato decimal com sinal de expoente logo após e/E (1e+, 2.5e-x...).
//                 O sinal NUNCA é absorvido por candidatos iniciados em 0x/0b, pois
//                 'x' e 'b' não pertencem a [0-9.] antes do e/E (0xE+1 = 3 tokens).
// 2a alternativa: qualquer sequência contígua iniciada por dígito ASCII.
INVALID_NUMBER
    : [0-9] [0-9.]* [eE] [+-] NUMCH*
    | [0-9] NUMCH*
    ;

// String inválida: casa até o fim da linha. O motivo (sem aspas finais, escape
// inexistente, U+0000) é explicado pelo código Java que gera a mensagem.
INVALID_STRING
    : '"' ( ~["\\\r\n] | '\\' ~[\r\n] | '\\' )* '"'?
    ;

// =====================================================================
// 5. IDENTIFICADOR - SEMPRE depois das palavras reservadas
//    1º caractere: letra Unicode ou _; depois: letras, marcas de acento,
//    dígitos ou _. Ex.: contador, calma_1, instanteInicial, corSensor
//
//    Palavra reservada x identificador: quando os dois casam o mesmo texto
//    (ex.: 'maer_an'), vale a regra declarada primeiro, ou seja, a reservada.
//    Texto em NFD (letra + acento combinante) cai aqui como ID; a classe
//    SindarinLexerNfc (Java) normaliza para NFC e reclassifica as reservadas.
// =====================================================================

// Nomes iniciados por dois sublinhados são reservados para a implementação.
// Declarado ANTES de ID para vencer o empate.
RESERVED_IDENTIFIER
    : '__' [\p{L}\p{M}\p{Nd}_]*
    ;

ID
    : [\p{L}_] [\p{L}\p{M}\p{Nd}_]*
    ;

// =====================================================================
// 6. IGNORADOS (reconhecidos e descartados; linha e coluna são mantidas)
//    Espaços ignoráveis: espaço ASCII, tabulação, CR e LF. Qualquer outro
//    espaço Unicode (ex.: U+00A0) cai em ERROR_CHAR.
//    O comentário de bloco NÃO aninha e termina no primeiro '*/'.
// =====================================================================
WS
    : [ \t\r\n]+ -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

// Comentário de bloco sem fechamento. A expressão só casa texto que NÃO contém '*/',
// então um comentário bem fechado continua sendo reconhecido por BLOCK_COMMENT.
UNTERMINATED_COMMENT
    : '/*' ( ~'*' | '*'+ ~[*/] )* '*'*
    ;

// =====================================================================
// 7. QUALQUER OUTRO CARACTERE (sempre a última regra)
//    Sem ela, o ANTLR junta o caractere ruim com o seguinte na mensagem
//    (ex.: "! " ao tentar formar "!="). Com ela, o erro aponta só o caractere.
// =====================================================================
ERROR_CHAR
    : .
    ;
