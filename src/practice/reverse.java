package practice;
class reverse
{
public static void main(String args[])
{
int rev=0,no=371;
while(no!=0)
{
rev=(rev*10);
rev=(rev+(no%10));
no=(no/10);
}
System.out.println(rev +"is the opposite");
}
}