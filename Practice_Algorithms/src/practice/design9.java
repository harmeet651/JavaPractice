package practice;
class design9
{
public static void main(String args[])
 {
int i,j,l;
    for(i=5;i>0;i-=2)
   {
    for(j=i-1;j>0;j--)
   {	
        System.out.print(" ");
   }
	for(l=5;l>=i;l--)
	   {
		System.out.print(" *"); 
	   }
	    System.out.println();
	   } 
	for(i=7;i>3;i-=2)
   {
    for(j=8;j>=i;j--)
   {	
        System.out.print(" ");
   }
	for(l=5;l<=i;l++)
	   {		System.out.print(" *"); 
	   }
	    System.out.println();
	   } 
 }
}