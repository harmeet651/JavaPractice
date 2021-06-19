package StacksAndQueues;

public class QueueWithLinkedList<T> {

	private NodeQueue<T> front;
	private NodeQueue<T> rear;
	int size;
	
	public QueueWithLinkedList() {
		front = null;
		rear = null;
		size =0;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size==0);
	}
	
	public T front() throws QueueEmptyException 
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public void enqueue(T element)
	{
		NodeQueue<T> newNode = new NodeQueue<T>(element);
		if(rear==null)
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
			rear.next= newNode;
			rear = newNode;
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyException
	{
		if(rear==null) 
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		T temp = front.data;
		front = front.next;
		if(size==1)
		{
			rear = null;
		}
		size--;
		return temp;
	}
}
