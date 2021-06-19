package practice;
import java.util.Scanner;
public class bank

{
 public static void main(String[] args)
 { 
  String choice;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter accountno.");
  int accountno = in.nextInt(); 
  bankaccount b1 = new bankaccount(1000,accountno); 
  System.out.println("MENU");
  System.out.println("1.Deposit");
  System.out.println("2.Withdraw");
  System.out.println("3.Calculate tax");
  System.out.println("4.Get Balance");
  do
{
  System.out.println("Enter your choice:");
  int temp = in.nextInt();
  switch(temp)
  { 
    case 1:  System.out.println("Enter the value to be deposited");
             double amt1 = in.nextDouble();
             b1.deposit(amt1);
             break;
    case 2:  System.out.println("Enter the value to be withdrawn");
             double amt2 = in.nextDouble();
             b1.withdraw(amt2);
             break;
    case 3:  b1.calculatetax();
             break;
    case 4:  System.out.println("Current balance for account number " + accountno + " is:");
             System.out.println(""+b1.getbalance()+"");
             break;
    default: System.out.println("Invalid choice");
             break;
  }
System.out.print("Do you want to continue?(Y/N) : ");
choice = in.next();
System.out.println(choice);
}
while(choice.equalsIgnoreCase("Y"));
}
}
