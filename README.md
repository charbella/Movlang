# Movlang
This project is a java implementation of pointer analysis for Movlang, a language consisting of the x86 mov instruction only. 

We used ANTLR to parse the code. 

movlang.g4 contains the grammar of Movlang.

test.movlang contains the movlang code to run the pointer analysis on

Movlang.java contains the main 

Run the code with: java -cp .:antlr-4.7.1-complete.jar Movlang

