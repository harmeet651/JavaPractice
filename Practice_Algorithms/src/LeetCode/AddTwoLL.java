package LeetCode;
import LinkedList.Node;

public class AddTwoLL {

	public static void main(String[] args) {
		Node<Integer> l1 = new Node<Integer>(2);
		l1.next = new Node<Integer>(4);
		l1.next.next = new Node<Integer>(3);
		
		Node<Integer> l2 = new Node<Integer>(5);
		l2.next = new Node<Integer>(6);
		l2.next.next = new Node<Integer>(4);
		
		Node<Integer> head = addTwoNumbers(l1, l2);
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	 public static Node addTwoNumbers(Node l1, Node l2) {
	       
            Node<Integer> head = new Node<Integer>(0);  
            Node<Integer> curr = head;
        	int carry =0;   	
	        while(l1!=null || l2 != null)
	        {
	        	int x = (l1!=null) ? (int) l1.data : 0;
	        	int y = (l2!=null) ? (int) l2.data : 0;
	        	int sum = carry+x+y;
	        	carry = sum/10;
	            curr.next = new Node<Integer>(sum%10);
	            curr = curr.next;
	            if(l1!=null) l1=l1.next;
	            if(l2!=null) l2=l2.next;
	            
	        }
	        if (carry > 0) {
	            curr.next = new Node(carry);
	        }
	        return head.next;
	    }
}
