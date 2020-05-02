import java.text.*;
import java.util.*;

public class movlangCustomListener extends movlangBaseListener{

	HashMap<String, List<String>> variableMap = new HashMap();
	
	@Override
	public void exitRegToReg(movlangParser.RegToRegContext ctx) {
      		System.out.println("Move " + ctx.REG().get(1).getText() + " to " + ctx.REG().get(0).getText());
	}

        @Override
        public void exitRegToMem(movlangParser.RegToMemContext ctx) {
                System.out.println("Move " + ctx.REG().getText() + " to " + ctx.MEM().getText());
        }

}
