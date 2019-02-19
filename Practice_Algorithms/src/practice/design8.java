package practice;
class design8
{
public static void main(String args[])
 {
int i,j,l;
    for(i=1;i<5;i++)
   {
    for(j=4;j>i;j--)
   {	
        System.out.print(" ");
   }
	for(l=1;l<=i;l++)
	   {
		System.out.print(" *"); 
	   }
	    System.out.println();
	   } 
	for(i=1;i<4;i++)
   {
    for(j=1;j<=i;j++)
   {	
        System.out.print(" ");
   }
	for(l=3;l>=i;l--)
	   {
		System.out.print(" *"); 
	   }
	    System.out.println();
	   } 
 }
}