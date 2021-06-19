package classes_and_objects;

public class Bank {
	private String customerName;
	private String accoutNo;
	private int funds = 1000;;
	
	public Bank (String name)
	{
		this.customerName = name;
	}
	public void verifyFunds()
	{
		if(funds<1000)
		{
			System.out.println("INSUFFICIENT FUNDS");
		}
		else
		{
			System.out.println("FUNDS are sufficient");	
		}
	}
}
