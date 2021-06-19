package practice;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b)
		{
			try
			{
				System.out.println("Wainting for b to complete...");
				b.wait();
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("Total is : "+b.total);
			
		}
	}

}

class ThreadB extends Thread
{
	int total ;
	public void run()
	{
		synchronized(this)
		{
			for(int i = 0 ; i <= 15 ; i++)
			{
				total += i;
			}
			notify();
		}
	}
}