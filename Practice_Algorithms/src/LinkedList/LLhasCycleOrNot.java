package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LLhasCycleOrNot {

	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		//making loop
		head.next.next.next = head.next;
		boolean a = cycleFinderLL(head);
		System.out.println(a);
	}
	public static boolean cycleFinderLL(Node<Integer> head)
	{
		Set<Node<Integer>> set = new HashSet<Node<Integer>>();
		while(head!=null)
		{
			if(set.contains(head))
			{
				return true;
			}
			set.add(head);
			head=head.next;
		}
		return false;
	}
}
