package amazon;
import java.util.*;

class PairInt{
	int first;
	int second;
	PairInt(int first,int second){
		this.first=first;
		this.second=second;
	}
}
class CriticalConnections {
    public static List<PairInt> criticalConnections(int l, int n, List<PairInt> connections) 
    {
    	HashMap<Integer,List<Integer>> graph=new HashMap<>();
	
    	for (int i = 0; i < n; i++) graph.put(i, new ArrayList<>());
    	for(PairInt curr: connections) 
    	{
			int x=curr.first;
			int y=curr.second;
			graph.get(x).add(y);
			graph.get(y).add(x);		
    	}
		boolean[] visited = new boolean[n];
		int[] order = new int[n];
		List<List<Integer>> results = new ArrayList<>();
		
		int[] uuid = new int[1]; // a global unique counter that assigns traversal order to each node
		dfs(graph, -1, 0, visited, order, uuid, results);
		List<PairInt> res=new ArrayList<>();
		for(List<Integer> curr : results) 
		{
			int x=curr.get(0);
			int y=curr.get(1);
			res.add(new PairInt(x,y));	
		}
		return res;
    }

    public static void dfs(HashMap<Integer,List<Integer>> graph, int pre, int src, boolean[] visited, int[] order, int[] uuid, List<List<Integer>> results) {
	visited[src] = true;
	order[src] = uuid[0]++;
	int orig_order = order[src];
	for (Integer neighbour : graph.get(src)) 
	{
		if (neighbour == pre) continue; // pre: guarantee no backward traversal
		if (!visited[neighbour]) dfs(graph, src, neighbour, visited, order, uuid, results);
		// order[src] keeps the earliest point that src can reach without passing src->pre
		order[src] = Math.min(order[src], order[neighbour]); // used by its predecessor to tell if pre->src is critical.
		if (orig_order < order[neighbour]) results.add(Arrays.asList(src, neighbour));
	}
}
	public static void main(String[] args) {
	//	n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
		int n=4;
		int l=4;
		List<PairInt> connections=new ArrayList<PairInt>();
		connections.add(new PairInt(0,1));
		connections.add(new PairInt(1,2));
		connections.add(new PairInt(2,0));
		connections.add(new PairInt(1,3));
		List<PairInt> ans=criticalConnections(l,n,connections);
		for(PairInt curr: ans  )
		{
			System.out.print(curr.first+" "+curr.second);	
		}
	}
}