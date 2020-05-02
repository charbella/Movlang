grammar movlang;

program : statement+;

statement : regToReg | regToMem | memToReg | conToReg | conToMem ;

regToReg : 'mov' REG ',' REG;
regToMem : 'mov' MEM ',' REG;
memToReg : 'mov' REG ',' MEM;
conToReg : 'mov' REG ',' CONST;
conToMem : 'mov' MEM ',' CONST;

REG : 'rax'| 'rbx' |'rcx' | 'rdx'; 
MEM : 'lv' NUM;
NUM : [0-9]+;
CONST : [0-9]+;
WS : [ \n\t]+ -> skip;
