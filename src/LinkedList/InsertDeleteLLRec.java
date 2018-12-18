package LinkedList;

public class InsertDeleteLLRec {

	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		int pos =1;
		int element = 30;
		//Node<Integer> newList = InsertRec(head, pos, element);
		//LinkedListUse.print(newList);
		//Node<Integer> newList2 = DeleteRec(head, pos);
		int val = 6;
		Node<Integer >newList = removeElementsLL(head, val);
		System.out.println("after");
		LinkedListUse.print(newList);
	}

	public static Node<Integer> InsertRec(Node<Integer> head, int pos, int element)
	{
		if(pos==0)
		{
			Node<Integer> newNode = new Node<>(element);
			newNode.next=head;
			return newNode;
		}
		if(head == null)
		{
			return head;
		}
		head.next = InsertRec(head.next, pos-1, element);
		return head;
	}
	public static Node<Integer> DeleteRec(Node<Integer> head, int pos)
	{
		if(pos == 0)
		{
			return head.next;
		}
		if(head == null)
		{
			return head;
		}
		head.next = DeleteRec(head.next, pos-1);
		return head;
	}
	private static Node<Integer> removeElementsLL(Node<Integer> head, int val) {

		Node<Integer> dummy = new Node<Integer>(0);
        dummy.next = head;
        Node<Integer> pre = dummy;
        while (pre.next != null) {
            if (pre.next.data == val) pre.next = pre.next.next;
            else pre = pre.next;
        }
        return dummy.next;
	}
}
