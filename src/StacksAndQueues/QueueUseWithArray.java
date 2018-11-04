package StacksAndQueues;

public class QueueUseWithArray {

	public static void main(String[] args) {
		QueueWithArray queue = new QueueWithArray();
		for(int i=1;i<=10;i++)
		{
			queue.enqueue(i);
		}
		while(!queue.isEmpty())
		{
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}

}
