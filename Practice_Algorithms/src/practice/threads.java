package practice;
//Runnable interface implement
class threadcall implements Runnable
{
	Thread t;
	String name;
	threadcall(String threadname)
	{
		name=threadname;
		t = new Thread(this,name);
		System.out.println("child/second"+t);
		t.start();
	}
	public void run() 
	{
		try
		{
		for(int i=5;i>0;i--)
		{
			System.out.println("loop thread:"+i);
			Thread.sleep(1500);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interupted");
		}
		System.out.println("exiting child/second thread");
	}


}
class threads
{
	public static void main(String args[])
	{
		new threadcall("gaurav");
		new threadcall("harmeet");
		try{
		for(int i=10;i>0;i-=2)
		{
			System.out.println("loop thread:"+i);
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("main Interupted");
		}
	
		System.out.println("exiting main thread");
	}
}