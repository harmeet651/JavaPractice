package LinkedList;

public class StackLLNodeClass<T> {
	
	T data;
    StackLLNodeClass<T> next;
	
	public StackLLNodeClass(T data)
	{
		this.data = data;
		setNext(null);
	}

	public StackLLNodeClass<T> getNext() {
		return next;
	}

	public void setNext(StackLLNodeClass<T> next) {
		this.next = next;
	}
	
	public StackLLNodeClass(T d, StackLLNodeClass<T> n)
	{
		data = d;
		next = n;
	}
	
	public void setData(T d)
	{
		data = d;
	}
	
	public T getData()
	{
		return data;
	}
}
