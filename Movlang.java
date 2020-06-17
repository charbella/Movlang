/* java -jar antlr-4.7.1-complete.jar movlang.g4 to generate parser */
import org.antlr.v4.runtime.*;
import java.io.*;
public class Movlang {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {		
        	try {
	            CharStream input = (CharStream) new ANTLRFileStream("input.movlang");
        	    movlangLexer lexer = new movlangLexer(input);
	            movlangParser parser = new movlangParser(new CommonTokenStream(lexer));
	            parser.addParseListener(new movlangCustomListener());
	            parser.program();
	        } catch (IOException ex) {
	            System.out.println(ex.getMessage());
	        }
   	 }
}
