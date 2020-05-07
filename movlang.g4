grammar movlang;

program : statement+;

statement : regToReg | regToMem | memToReg | conToReg | conToMem ;

regToReg : 'mov' REG ',' REG;
regToMem : 'mov' mem ',' REG;
memToReg : 'mov' REG ',' mem;
conToReg : 'mov' REG ',' CONST;
conToMem : 'mov' mem ',' CONST;

mem : '[' address ']' | 'BYTE PTR [' address ']' | 'WORD PTR [' address ']' | 'DWORD PTR [' address ']' ;
address : REG | REG '+' CONST | REG '-' CONST | REG '+' REG | REG '-' REG ;

REG : 'eax'| 'ebx' |'ecx' | 'edx' | 'esi' | 'edi' | 'esp' | 'ebp' | 'ax' | 'bx' | 'cx' | 'dx' | 'ah' | 'bh' | 'ch' | 'dh' | 'al' | 'bl' | 'cl' | 'dl' ; 
CONST : [0-9]+;
WS : [ \n\t]+ -> skip;
