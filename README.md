# Movlang
This project is a java implementation of pointer analysis for Movlang, a language consisting of the x86 mov instruction only. 
We use ANTLR lexer and parser to parse the code. 
movlang.g4 contains the grammar of Movlang.

# How to use

Generate parser for grammar (run this command when changes are made to the grammar):
java -jar antlr-4.7.1-complete.jar movlang.g4

Compile code:
javac -cp ./antlr-4.7.1-complete.jar *.java

Save assembly program in file called test.movlang 

Execute parser GUI:
java -cp .:antlr-4.7.1-complete.jar org.antlr.v4.gui.TestRig movlang program -gui test.movlang

Execute pointer analysis:
java -cp .:antlr-4.7.1-complete.jar Movlang

# Examples

Example 1
input:
mov DWORD PTR ds:0x4008, 0x4000 

output:
Points-to set of 0x4008 is 
 -> 0x4000

Example 2:
input:
mov ds:0x4002, 0x1000	
mov eax, DWORD PTR ds:0x4002	
mov ds:0x4008, eax

output:
Points-to set of 0x4002 is 
 -> 0x1000
Points-to set of eax is 
 -> 0x1000
Points-to set of 0x4008 is 
 -> 0x1000




 
