package practice;
class palindrome
{
public static void main(String args[])
{
int rev=0,no=171,n=no;
while(no!=0)
{
rev=(rev*10);
rev=(rev+(no%10));
no=(no/10);
}
if(n==rev)
System.out.println(n +"is palindrome");
else
System.out.println(n +"is not palindrome");	
}
}