package LinkedList;

public class ReverseLLRecursive {

	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		Node<Integer> reverseHead = reverseLLhead(head);
		LinkedListUse.print(reverseHead);
	}
	public static Node<Integer> reverseLLhead(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> tail = head.next; 
		Node<Integer> finalHead = reverseLLhead(head.next);
		tail.next = head;
		head.next = null;
		return finalHead;
	}
}
