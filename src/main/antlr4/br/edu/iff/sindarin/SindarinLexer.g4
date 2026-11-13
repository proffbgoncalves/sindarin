lexer grammar SindarinLexer;

// Analisador léxico da linguagem Sindarin 1.0 (Arduino Mega 2560)
// Trabalho prático de Compiladores - IFF - Artur e Amanda
// Etapa 1: especificação léxica 


/// =====================================================================
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
// =====================================================================

// =====================================================================
// 5. IDENTIFICADOR - SEMPRE depois das palavras reservadas
//    1º caractere: letra Unicode ou _; depois: letras, marcas de acento,
//    dígitos ou _. Ex.: contador, calma_1, instanteInicial, corSensor
// =====================================================================


// =====================================================================
// 6. IGNORADOS (reconhecidos e descartados; linha e coluna são mantidas)
// =====================================================================
   
// =====================================================================
// 7. QUALQUER OUTRO CARACTERE (sempre a última regra)
//    Sem ela, o ANTLR junta o caractere ruim com o seguinte na mensagem
//    (ex.: "! " ao tentar formar "!="). Com ela, o erro aponta só o caractere.
// =====================================================================

