package StacksAndQueues;


public class ReverseStack {

	public static <T> void main(String[] args) throws StackEmptyException {
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
		StackUsingLinkedList<Integer> stack2 = new StackUsingLinkedList<>();
		for(int i=1;i<=5;i++)
		{
			stack.push(i);
		}
		System.out.println(stack.peek());
		StackUsingLinkedList<Integer> obj = reverseStack(stack,stack2);
		obj.display();
		System.out.println(obj.peek());
		
	}

	private static StackUsingLinkedList<Integer> reverseStack(StackUsingLinkedList<Integer> s1, StackUsingLinkedList<Integer> s2) throws StackEmptyException {
		StackUsingLinkedList<Integer> s = reverseStackMethod(s1,s2);
		return s1;
	}
		
	
		
	private static StackUsingLinkedList<Integer> reverseStackMethod(StackUsingLinkedList<Integer> s1, StackUsingLinkedList<Integer> s2) throws StackEmptyException 
	{		
		if(s1.getSize()==1)
	           return null;
		
		int x=s1.pop();
        System.out.println("x is "+x);
        reverseStack(s1,s2);
         while(!s1.isEmpty())
         {
           s2.push(s1.pop());
         }  
         s1.push(x);
         while(!s2.isEmpty())
         {
           s1.push(s2.pop());
         }
        return s1;

	}			

}
