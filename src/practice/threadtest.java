package practice;

public class threadtest implements Runnable { 
	public void run(){
		for (int x=0;x<=3;x++){
			try {
				Thread.sleep(1000);
				} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();// 
				}
			
			
			System.out.println("Run by "+Thread.currentThread().getName()+" "+x);
			
		}
	}

	public static void main(String[] args) 
	{
		threadtest t1= new threadtest();
		Thread t2 = new Thread(t1);
		Thread t3 = new Thread(t1);
		t2.setName("Bikram");
		t3.setName("Arsh");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t3.start();
	
	}

}
