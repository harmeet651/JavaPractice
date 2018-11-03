package StacksAndQueues;
import LinkedList.StackLLNodeClass;

public final class StackUsingLinkedList<T> {

	private int size;
	private StackLLNodeClass<T> head;
	
	public StackUsingLinkedList() {
		size = 0;
		head = null;
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public int getSize()
    {
        return size;
    } 
	
	public void push(T data)
	{
		StackLLNodeClass<T> newPointer = new StackLLNodeClass<T>(data);
		size++;
		if(head == null)
		{
			head = newPointer;
			return;
		}
			newPointer.setNext(head);
			head = newPointer;
	}
	
	public T pop() throws StackEmptyException
	{
		if(isEmpty())
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T ptr = head.getData();
		head = head.getNext();
		size--;
		return ptr;
	}
	
	public T peek() throws StackEmptyException
    {
        if (isEmpty() )
        {
        	StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return head.getData();
    }    
 
    public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        StackLLNodeClass<T> ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getNext();
        }
        System.out.println();        
    }
}
