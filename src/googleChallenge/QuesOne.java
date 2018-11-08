package googleChallenge;

public class QuesOne {
	/**
	 * Assume you are given a tree Of N nodes. The nodes are numbered from 0 to N-1
	 * and their parents are represented in an array such that A[i] denotes the
	 * number of the parent of the i-th node. Node 0 is the root node and it will
	 * not have a parent, so the corresponding value in array A will be -1.
	 * 
	 * We define the distance between two nodes to be the length of the shortest
	 * path between them, and we define an ancestor of the i-th node as any node
	 * lying on the shortest path between the i-th node and the root. Your goal is
	 * to find the ancestor at distance D of every node of the tree.
	 * 
	 * Write a function that, given an integer D and array A Of N integers, returns
	 * an array Of N integers representing the ancestors at distance D to the
	 * consecutive nodes. If a node doesn't have an ancestor at distance D its field
	 * should contain -1.
	 * 
	 * Write an efficient algorithm for the following assumptions:
	 * 
	 * - N and O are integers within the range [1..1,000];
	 * 
	 * - the first element of array A equals -1;
	 * 
	 * - each element Of array A, besides the first one, is an integer Within the
	 * range [0..N-1];
	 * 
	 * - array A represents a valid tree.
	 * 
	 */
	public static void main(String[] args) {
		int a[] = { -1, 0, 4, 2, 1 };
		int D = 3;
		int arr[] = ancestor(D, a);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] ancestor(int d, int a[]) {
		int dthParent[] = new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			int current = i;
			for (int j = 0; j < d; j++) 
			{
				if (a[current] == -1) 
				{
					current = -1;
					break;
				}
				current = a[current];
			}	
			dthParent[i] = current;
		}		
		return dthParent;
	}
}
