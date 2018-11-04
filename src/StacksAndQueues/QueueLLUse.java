package StacksAndQueues;

public class QueueLLUse {
	public static void main(String[] args) {
		QueueWithLinkedList<Integer> queue = new QueueWithLinkedList<>();
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
				e.printStackTrace();
			}
		}
	}
}
