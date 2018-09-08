package practice;

public class ThreadJoint extends Thread {

	public void run()
	{
		for(int i = 0 ; i <= 5 ; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println((e));
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoint t1 = new ThreadJoint();
		ThreadJoint t2 = new ThreadJoint();
		ThreadJoint t3 = new ThreadJoint();
		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t3.start();
	}

}
