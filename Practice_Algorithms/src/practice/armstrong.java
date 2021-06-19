package practice;
class armstrong
{
public static void main(String args[])
{
int r,no=371,sum=0,n=no;
while(no>0)
{
r=no%10;
sum=sum+(r*r*r);
no=no/10;
}
if(n==sum)
System.out.println(n+"is armstrong no");
else
System.out.println(n+"is not armstrong no");
}
}