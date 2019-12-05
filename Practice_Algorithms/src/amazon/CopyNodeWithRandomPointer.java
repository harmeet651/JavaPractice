package amazon;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};

//Recursive with map
// HashMap which holds old nodes as keys and new nodes as its values.
//HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();
//
//public Node copyRandomList(Node head) {
//
//  if (head == null) {
//    return null;
//  }
//
//  // If we have already processed the current node, then we simply return the cloned version of
//  // it.
//  if (this.visitedHash.containsKey(head)) {
//    return this.visitedHash.get(head);
//  }
//
//  // Create a new node with the value same as old node. (i.e. copy the node)
//  Node node = new Node(head.val, null, null);
//
//  // Save this value in the hash map. This is needed since there might be
//  // loops during traversal due to randomness of random pointers and this would help us avoid
//  // them.
//  this.visitedHash.put(head, node);
//
//  // Recursively copy the remaining linked list starting once from the next pointer and then from
//  // the random pointer.
//  // Thus we have two independent recursive calls.
//  // Finally we update the next and random pointers for the new node created.
//  node.next = this.copyRandomList(head.next);
//  node.random = this.copyRandomList(head.random);
//
//  return node;

//public Node copyRandomList(Node head) {
//    if(head==null) return null;
//    Node temp = head;
//    while(temp!=null)
//    {
//        Node clone = new Node(temp.val);
//        clone.next = temp.next;
//        temp.next = clone;
//        temp = clone.next;
//    }
//    
//    temp = head;
//    
//    while(temp!=null)
//    {
//        temp.next.random = (temp.random!=null) ? temp.random.next : null;
//        temp = temp.next.next;
//    }
//    
//    Node old_list = head;
//    Node new_list = head.next;
//    Node head_old = head.next;
//    while(old_list!=null)
//    {
//        old_list.next = old_list.next.next;
//        new_list.next = (new_list.next!=null) ? new_list.next.next : null;
//        old_list = old_list.next;
//        new_list = new_list.next;
//    }
//    return head_old;
//}

public class CopyNodeWithRandomPointer 
{
	 public static Node copyRandomList(Node head) 
	 {

	    if (head == null) 
	    {
	      return null;
	    }

	    // Creating a new weaved list of original and copied nodes.
	    Node ptr = head;
	    while (ptr != null) 
	    {

	      // Cloned node
	      Node newNode = new Node(ptr.val,null, null);

	      // Inserting the cloned node just next to the original node.
	      // If A->B->C is the original linked list,
	      // Linked list after weaving cloned nodes would be A->A'->B->B'->C->C'
	      newNode.next = ptr.next;
	      ptr.next = newNode;
	      ptr = newNode.next;
	    }

	    ptr = head;

	    // Now link the random pointers of the new nodes created.
	    // Iterate the newly created list and use the original nodes' random pointers,
	    // to assign references to random pointers for cloned nodes.
	    while (ptr != null) 
	    {
	      ptr.next.random = (ptr.random != null) ? ptr.random.next : null;
	      ptr = ptr.next.next;
	    }

	    // Unweave the linked list to get back the original linked list and the cloned list.
	    // i.e. A->A'->B->B'->C->C' would be broken to A->B->C and A'->B'->C'
	    Node ptr_old_list = head; // A->B->C
	    Node ptr_new_list = head.next; // A'->B'->C'
	    Node head_old = head.next;
	    while (ptr_old_list != null) 
	    {
	      ptr_old_list.next = ptr_old_list.next.next;
	      ptr_new_list.next = (ptr_new_list.next != null) ? ptr_new_list.next.next : null;
	      ptr_old_list = ptr_old_list.next;
	      ptr_new_list = ptr_new_list.next;
	    }
	    return head_old;
	  }


	public static void main(String[] args) {
		Node b = new Node(11, null, null);
		Node c = new Node(12, null, null);
		Node a = new Node(10, b, c);
		b.next = c;
		b.random = a;
		c.next = null;
		c.random = b;

		Node ans = copyRandomList(a);
		while(ans!=null)
		{
			System.out.println(ans.val);
			System.out.println(ans.next);
			System.out.println(ans.random);
			ans=ans.next;
		}

	}

}
