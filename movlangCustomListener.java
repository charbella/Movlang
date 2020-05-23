import java.util.*;
/* 
Graph is stored as adjacencylist
*/

public class movlangCustomListener extends movlangBaseListener{

	private ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(); 	// 2d arraylist to represent adjacency list
	private HashMap<String, Integer> variables = new HashMap<String, Integer>(); 		// hashmap to map each variable name to an adjacency list index
	private ArrayList<String[]> subsetConstraints = new ArrayList<>(); 			// Store subset constraints as list of arrays [a,b] where a is subset of b

	// Add a node and store name and adjList index in hashmap, return index
	private int addNode(String name){
		int index = adjList.size();
		variables.put(name, index);
		adjList.add(new ArrayList<Integer>());
		return index;
	}
		
	// Return the adjacency list index of a variable	
	private int getIndex (String var){
		int index;
		// check if var is already in variables, otherwise add it 
		if (variables.containsKey(var)){
			index = variables.get(var);
		} else {
			index = addNode(var);
		}
		return index;
	}

	// Ad an edge from one nodes index to another
	private void addEdge(int from, int to){
		adjList.get(from).add(to);
	}

	// Store subset constraint as array [a,b] where a is subset of b
	private String[] storeSubsetConstraint (String a, String b){
		String[] subset = new String[]{a,b};
		subsetConstraints.add(subset);	
		return subset;	
	}

	// Solve subset constraint 
	private void solveSubsetConstraint(String[] subsetConstraint){
		int idxA = getIndex(subsetConstraint[0]);
		int idxB = getIndex(subsetConstraint[1]);
		subsetOf(adjList.get(idxA), adjList.get(idxB));		
	};
	
	// add elements in list A to list B so that list A will be a subset of list B 
	private void subsetOf(ArrayList<Integer> listA, ArrayList<Integer> listB){
		if (listA.size() > 0){
			for(Iterator<Integer> listIterator = listA.iterator(); listIterator.hasNext();){			
				int elem = listIterator.next();	
				if (!listB.contains(elem)){			
					listB.add(elem);
				}
			}
		}
	}

	// Reverse use the hashmap to get the key (index) based on variable name
	private <K, V> K getKey(HashMap<K, V> map, V value) {
    		for (HashMap.Entry<K, V> entry : map.entrySet()) {
	        	if (entry.getValue().equals(value)) {
	       			return entry.getKey();
       			 }
   		 }
    		return null;
	}

   	// A utility function to print the adjacency list representation of graph
	private void printGraph(List<ArrayList<Integer> > adj) {
        	for (int i = 0; i < adj.size(); i++) {
			if (adj.get(i).size()>0){
           			System.out.println("\nPoints-to set of " + getKey(variables, i) + " is ");
           			for (int j = 0; j < adj.get(i).size(); j++) {
               			 	System.out.print(" -> "+ getKey(variables, adj.get(i).get(j)));
				}
			}
		}
           	System.out.println();
        }


	/* Override movlangBaseListener methods for custom implementation of ANTLR parser */

	@Override
	public void exitRegToReg(movlangParser.RegToRegContext ctx) {
		String regA = ctx.REG().get(0).getText();
		String regB = ctx.REG().get(1).getText();
		String[] subsetConstraint = storeSubsetConstraint(regB, regA); // pts(regB) is a subset of pts(regA)
		solveSubsetConstraint(subsetConstraint); 
		System.out.println("Copy contents of " + regB + " into " + regA + "\n");
	}

        @Override
        public void exitRegToMem(movlangParser.RegToMemContext ctx) {
		String mem;
		if (ctx.mem().location() != null) {
			mem = ctx.mem().location().getText();
		} else {
			mem = ctx.mem().address().HEX_NUMBER().getText();
		}
		String reg = ctx.REG().getText();
		String[] subsetConstraint = storeSubsetConstraint(reg, mem); // pts(reg) is a subset of pts(mem)
		solveSubsetConstraint(subsetConstraint); 
                System.out.println("Copy contents of " + reg + " to memory location at address " + mem);
	}

        @Override
        public void exitMemToReg(movlangParser.MemToRegContext ctx) {
		String mem;
             	if (ctx.mem().location() != null) {
                        mem = ctx.mem().location().getText();
                } else {
                        mem = ctx.mem().address().HEX_NUMBER().getText();
                }

		String reg = ctx.REG().getText();
		int idxMem = getIndex(mem);
		int idxReg = getIndex(reg);
		subsetOf(adjList.get(idxMem), adjList.get(idxReg));
                System.out.println("Copy contents at memory location with address " + mem + " into " + reg);
	}

        @Override
        public void exitConToReg(movlangParser.ConToRegContext ctx) {
		String reg = ctx.REG().getText();
		String con;
		// For now we assume that decimal numbers are constants and hexadecimal numbers are addresses
		if (ctx.constant().DEC_NUMBER() != null) {
			con = ctx.constant().DEC_NUMBER().getText();	// context is a decimal number
			System.out.println("Store constant " + con + " in " + reg);
		} else {
			con = ctx.constant().HEX_NUMBER().getText(); // constant is of type 0xFFFFFF
			int idxCon = getIndex(con);
			int idxReg = getIndex(reg);
			adjList.get(idxReg).add(idxCon);
                	System.out.println("Store the address " + con + " in " + reg);
		}
	}

        @Override
        public void exitConToMem(movlangParser.ConToMemContext ctx) {
                String mem;
                if (ctx.mem().location() != null) {
                        mem = ctx.mem().location().getText();
                } else {
                        mem = ctx.mem().address().HEX_NUMBER().getText();
                }

		String con;
                // For now we assume that decimal numbers are constants and hexadecimal numbers are addresses
                if (ctx.constant().DEC_NUMBER() != null) {
                        con = ctx.constant().DEC_NUMBER().getText();       // context is a decimal number
                        //System.out.println("Store constant " + con + " at memory location " + mem);
                } else {
                        con = ctx.constant().HEX_NUMBER().getText(); // constant is of type 0xFFFFFF
                        int idxCon = getIndex(con);
                        int idxMem = getIndex(mem);
                        adjList.get(idxMem).add(idxCon);
                        System.out.println("Store the address " + con + " at memory location " + mem);
                }
 
	}

	@Override
	@SuppressWarnings("unchecked")
	public void exitProgram(movlangParser.ProgramContext ctx) {
		boolean completed = false;
		// Iteratively solve subset constraints until graph doesn't change anymore
		while (completed == false ){
			ArrayList<ArrayList<Integer>> initialGraph = new ArrayList<ArrayList<Integer>>(); //2d arraylist to represent adjacency list
			// copy graph to initialgraph
			for (int i = 0; i < adjList.size(); i++) {
				ArrayList<Integer> row = (ArrayList<Integer>) adjList.get(i).clone();
				initialGraph.add(row);
			}
			for (String[] subset : subsetConstraints){
				solveSubsetConstraint(subset);
			}
			if (initialGraph.equals(adjList)){
				completed = true;
			}
		}
		System.out.println("There are " + variables.size() + " variables\n");
		printGraph(adjList);
	}

}
