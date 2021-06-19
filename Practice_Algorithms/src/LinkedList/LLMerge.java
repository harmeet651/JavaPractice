package LinkedList;

public class LLMerge {

	public static void main(String[] args) {
		Node<Integer> head1 = LinkedListUse.takeInput();
		//Node<Integer> head2 = takeInput();
		Node<Integer> sorted = mergeSort(head1);
		LinkedListUse.print(sorted);
	}

	public static Node<Integer> mergeSort(Node<Integer> head) 
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> middle = midOfLL(head);
		Node<Integer> nextOfMiddle = middle.next;
		middle.next = null;
		Node<Integer> left = mergeSort(head);
		Node<Integer> right = mergeSort(nextOfMiddle);
		Node<Integer> sortedList = mergeLL(left, right);
		return sortedList;
	}
	public static Node<Integer> midOfLL(Node<Integer> head)
	{
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!= null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static Node<Integer> mergeLL(Node<Integer>headA, Node<Integer> headB)
	{
		 /* a dummy first node to  
	       hang the result on */
	    Node<Integer> dummyNode = new Node<Integer>(0); 
	      
	    /* tail points to the  
	    last result node */
	    Node<Integer> tail = dummyNode; 
	    while(true)  
	    { 
	          
	        /* if either list runs out,  
	        use the other list */
	        if(headA == null) 
	        { 
	            tail.next = headB; 
	            break; 
	        } 
	        if(headB == null) 
	        { 
	            tail.next = headA; 
	            break; 
	        } 
	          
	        /* Compare the data of the two 
	        lists whichever lists' data is  
	        smaller, append it into tail and 
	        advance the head to the next Node 
	        */
	        if(headA.data <= headB.data) 
	        { 
	            tail.next = headA; 
	            headA = headA.next; 
	        }  
	        else
	        { 
	            tail.next = headB; 
	            headB = headB.next; 
	        } 
	          
	        /* Advance the tail */
	        tail = tail.next; 
	    } 
	    return dummyNode.next; 
	}

}
