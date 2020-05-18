grammar movlang;

program : statement+;
statement : constant ':' instruction | instruction;

instruction : regToReg | regToMem | memToReg | conToReg | conToMem ;

regToReg : 'mov' REG ',' REG;
regToMem : 'mov' mem ',' REG;
memToReg : 'mov' REG ',' mem;
conToReg : 'mov' REG ',' constant;
conToMem : 'mov' mem ',' constant;

mem : '[' location ']' | 'BYTE PTR [' location ']' | 'WORD PTR [' location ']' | 'DWORD PTR [' location ']' | address | 'BYTE PTR ' address | 'WORD PTR ' address | 'DWORD PTR ' address ;
location : REG | REG '+' constant | REG '-' constant | REG '+' REG | REG '-' REG | REG '+' REG '*' constant | REG '*' constant '+' constant;
address : 'ds:' HEX_NUMBER ;
constant : HEX_NUMBER | DEC_NUMBER ;

REG : 'eax'| 'ebx' |'ecx' | 'edx' | 'esi' | 'edi' | 'esp' | 'ebp' | 'ax' | 'bx' | 'cx' | 'dx' | 'ah' | 'bh' | 'ch' | 'dh' | 'al' | 'bl' | 'cl' | 'dl' ; 
DEC_NUMBER : DIGIT+ ;
HEX_NUMBER : '0x' HEX_DIGIT+ | HEX_DIGIT+;
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
DIGIT : ('0'..'9') ;
WS : [ \n\t]+ -> skip ;
