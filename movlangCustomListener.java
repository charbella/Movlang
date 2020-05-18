import java.util.*;

public class movlangCustomListener extends movlangBaseListener{

	private ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(); //2d arraylist to represent adjacency list
	private HashMap<String, Integer> variables = new HashMap<String, Integer>(); //hashmap to map each variable name to an index number
	private int[][] tc; // To store transitive closure
	private ArrayList<String> locations = new ArrayList<>(); //To store all variables that are considered locations

	// Return the index in the adjacency list of a variable	
	private int getIndex (String var){
		int index;
		//Check if var is already in variables, otherwise add it 
		if (variables.containsKey(var)){
			index = variables.get(var);
		} else {
			index = addNode(var);
		}
		return index;
	}

	// Add a node and store in name and adjList index in hashmap, return index
	private int addNode(String name){
		int index = adjList.size();
		variables.put(name, index);
		adjList.add(new ArrayList<Integer>());
		return index;
	}
	
	// add elements in list A to list B so that list A will be a subset of list B 
	private void subsetOf(ArrayList<Integer> listA, ArrayList<Integer> listB){
		if (listA.size() > 0){
			for (int elem : listA){
				listB.add(elem);
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

	// The function to find transitive closure. It uses recursive DFSUtil()
	private void transitiveClosure() {
		int nrOfVertices = this.variables.size();
		this.tc = new int[nrOfVertices][nrOfVertices];
        	for (int i = 0; i < nrOfVertices; i++) {
            		dfsUtil(i, i); 
        	}
        	for (int i = 0; i < nrOfVertices; i++) {
          		System.out.println(Arrays.toString(tc[i])); 
        	}
    	}

   	// A recursive DFS traversal function that finds all reachable vertices for s
	private void dfsUtil(int s, int v) {
        // Mark reachability from s to v as true.
        	tc[s][v] = 1;
	        // Find all the vertices reachable through v
	        for (int adj : adjList.get(v)) {
	            if (tc[s][adj]==0) {
	                dfsUtil(s, adj);
        	    }
        	}
    	}

	/* Override movlangBaseListener methods for custom implementation of ANTLR parser */

	@Override
	public void exitRegToReg(movlangParser.RegToRegContext ctx) {
		String regA = ctx.REG().get(0).getText();
		String regB = ctx.REG().get(1).getText();
		int idxA = getIndex(regA);
		int idxB = getIndex(regB);
		subsetOf(adjList.get(idxB), adjList.get(idxA));
		System.out.println("Copy contents of " + regB + " into " + regA + "\n");
	}

        @Override
        public void exitRegToMem(movlangParser.RegToMemContext ctx) {
		String mem;
		if (ctx.mem().location() != null) {
			mem = ctx.mem().location().getText();
		} else {
			mem = ctx.mem().address().getText();
		}
		String reg = ctx.REG().getText();
		int idxReg = getIndex(reg);
		int idxMem = getIndex(mem);
		subsetOf(adjList.get(idxMem), adjList.get(idxReg));
                System.out.println("Copy contents of " + reg + " to memory location at address " + mem);
	}

        @Override
        public void exitMemToReg(movlangParser.MemToRegContext ctx) {
		String mem;
             	if (ctx.mem().location() != null) {
                        mem = ctx.mem().location().getText();
                } else {
                        mem = ctx.mem().address().getText();
                }

		String reg = ctx.REG().getText();
		int idxMem = getIndex(mem);
		int idxReg = getIndex(reg);
		subsetOf(adjList.get(idxReg), adjList.get(idxMem));
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
			locations.add(con);
                	System.out.println("Store the address " + con + " in " + reg);
		}
	}

        @Override
        public void exitConToMem(movlangParser.ConToMemContext ctx) {
                String mem;
                if (ctx.mem().location() != null) {
                        mem = ctx.mem().location().getText();
                } else {
                        mem = ctx.mem().address().getText();
                }

		String con;
                // For now we assume that decimal numbers are constants and hexadecimal numbers are addresses
                if (ctx.constant().DEC_NUMBER() != null) {
                        con = ctx.constant().DEC_NUMBER().getText();       // context is a decimal number
                        System.out.println("Store constant " + con + " at memory location " + mem);
                } else {
                        con = ctx.constant().HEX_NUMBER().getText(); // constant is of type 0xFFFFFF
                        int idxCon = getIndex(con);
                        int idxMem = getIndex(mem);
                        adjList.get(idxMem).add(idxCon);
                        locations.add(con);
                        System.out.println("Store the address " + con + " at memory location " + mem);
                }
 
	}

	@Override
	public void exitProgram(movlangParser.ProgramContext ctx) {
		System.out.println("There are " + variables.size() + " variables\n");
		printGraph(adjList);
	}

}
