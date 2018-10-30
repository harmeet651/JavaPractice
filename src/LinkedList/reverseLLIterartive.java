package LinkedList;

public class reverseLLIterartive {

	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		Node<Integer> reversed = RevLLIter(head);
		LinkedListUse.print(reversed);
	}
	public static Node<Integer> RevLLIter(Node<Integer> head)
	{
		if(head==null || head.next== null)
		{
			return head;
		}
		Node<Integer> prev = null;
		Node<Integer> temp;
		Node<Integer> current = head;
		while(current!= null)
		{
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}
}
