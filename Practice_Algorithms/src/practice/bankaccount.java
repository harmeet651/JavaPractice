package practice;
public class bankaccount
{
  private double balance ;
  private int accountno ;
  bankaccount(int acc)
  { balance = 0;
    accountno=acc;
  }
  public bankaccount(double initialBalance,int acc)
    {   
       
        balance = initialBalance;
        accountno=acc;
        
    }

  
  public void deposit(double amount)
  {
   double newbalance;
   newbalance = balance + amount;
   balance = newbalance;
  }
   public void withdraw(double amount)
  { 
   double newbalance;
   if(amount > balance)
   {
    System.out.println("The amount you are trying to withdraw is more than the current balance");    
   }
   else
   {
   newbalance = balance - amount;
   balance = newbalance;
  }
}
   public double getbalance()
  {return balance;
   }
  public void calculatetax()
  { final double taxrate = 0.1 ;
  double newbalance;
  newbalance=balance-(taxrate*balance);
  balance=newbalance;
System.out.println("Your current balance is " + balance +"");
 }  
} 
 