import java.util.*;

public class movlangCustomListener extends movlangBaseListener{

	private List<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
	private HashMap<String, Integer> variables = new HashMap<String, Integer>();

	// Add a node and store in name and adjList index in hashmap, return index
	public int addNode(String name){
		int index = adjList.size();
		variables.put(name, index);
		adjList.add(new ArrayList<Integer>());
		return index;
	}

	public <K, V> K getKey(HashMap<K, V> map, V value) {
    		for (HashMap.Entry<K, V> entry : map.entrySet()) {
	        	if (entry.getValue().equals(value)) {
	       			return entry.getKey();
       			 }
   		 }
    		return null;
	}

   	// A utility function to print the adjacency list representation of graph
	void printGraph(List<ArrayList<Integer> > adj) {
        	for (int i = 0; i < adj.size(); i++) {
           		System.out.println("\nAdjacency list of vertex " + getKey(variables, i));
           		for (int j = 0; j < adj.get(i).size(); j++) {
               			 System.out.print(" -> "+ getKey(variables, adj.get(i).get(j)));
			}
		}
           	System.out.println();
        }

	@Override
	public void exitRegToReg(movlangParser.RegToRegContext ctx) {
		String regA = ctx.REG().get(0).getText();
		String regB = ctx.REG().get(1).getText();
		int idxA;
		int idxB;
		// check if regA is already in variables, otherwise add it
		if (variables.containsKey(regA)){
			idxA = variables.get(regA);
		} else {
			idxA = addNode(regA);
		}
		// check if regB is already in variables, otherwise add is
		if (variables.containsKey(regB)){
			idxB = variables.get(regB);
		} else {
			idxB = addNode(regB);
		}
		adjList.get(idxA).add(idxB);
		System.out.println("Move " + regB + " to " + regA + "\n");
		System.out.println("There are " + variables.size() + " variables\n");
		printGraph(adjList);
	}

        @Override
        public void exitRegToMem(movlangParser.RegToMemContext ctx) {
                System.out.println("Move " + ctx.REG().getText() + " to " + ctx.mem().address().getText());
	}

}
