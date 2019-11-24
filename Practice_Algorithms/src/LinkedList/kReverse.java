package LinkedList;

public class kReverse {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		//head.next.next.next.next.next = new Node(6);
		Node ans = reverseKGroup(head, 3);
		while(ans!=null)
		{
			System.out.println(ans.data);
			ans=ans.next;
		}

	}
	public static Node reverseKGroup(Node head, int k) 
    {
		Node curr = head;
        int count = 0;
        while (curr != null && count != k) 
        { 
            curr = curr.next;
            count++;
            System.out.println("count");
        }
        if (count == k) { 
            curr = reverseKGroup(curr, k);
            System.out.println("reverse");
            while (count-- > 0) 
            { 
            	Node tmp = head.next; 
                head.next = curr; 
                curr = head;
                head = tmp; 
            }
            head = curr;
        }
        System.out.println("return");
    return head;
    }
}
