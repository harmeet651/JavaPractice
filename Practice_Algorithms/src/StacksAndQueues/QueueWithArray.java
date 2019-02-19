package StacksAndQueues;

public class QueueWithArray {
	private int[] data;
	private int front;
	private int rear;
	private int size;
	
	public QueueWithArray() {
		data = new int[10];
		front = -1;
		rear=-1;
		size=0;
	}
	
	public QueueWithArray(int cap) {
		data = new int[cap];
		front = -1;
		rear=-1;
		size=0;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else return false;
		
	}
	int front() throws QueueEmptyException 
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public void enqueue(int element)
	{
		if(size == data.length)
		{
			DoubleCapacity();
		}
		if(size==0)
		{
			front =0;
		}
		rear++;
		if(rear == data.length)
		{
			rear = 0;
		}
		size++;
		data[rear] = element;
	}
	
	public void DoubleCapacity()
	{
		int temp[] = data;
		data = new int[2*temp.length];
		int index = 0;
		for(int i=front;i<temp.length;i++)
		{
			data[index]= temp[i];
			index++;
		}
		for(int i=0;i<=front-1;i++)
		{
			data[index] = temp[i];
			index++;
		}
		front = 0;
		rear = temp.length-1; 
	}
	
	int dequeue() throws QueueEmptyException
	{
		if(size==0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		int temp = data[front];
		front ++;
		if(front ==data.length)
		{
			front =0;
		}
		size--;
		if(size==0)
		{
			front =-1;
			rear=-1;
		}
		return temp;
	}
	
}

