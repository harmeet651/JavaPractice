package practice;

class Reserve implements Runnable
{
	int avl = 1 , wanted ;
	Reserve (int i)
	{
		wanted = i ;
	}
	public void run()
	{
		//synchronized(this)
		//{
			System.out.println("No of berts available :"+ avl);
			if(avl >= wanted)
			{
				String name = Thread.currentThread().getName();
				System.out.println(wanted+" Berths alloted to "+name);
				try
				{
					Thread.sleep(1000);
					avl = avl - wanted;
				}
				catch(InterruptedException ie)
				{
					//ie.printStackTrace();
				}
		}	else
			{
				System.out.println("No berths available ");
			}
	//	}
		
	}
}

public class Synchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve obj = new Reserve(1);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
	}

}
