package practice;
import java.util.Scanner;
public class TryArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length , breadth ,side , area , radius;
		int  inp ;
		int choice;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice \n1.Area of Circle \n2.Area of Square \n3.Area of Rectangle");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 : try 
					{
						System.out.println("Enter the radius of the Circle ");
						 radius = sc.nextInt();
						 area =  3.14 * (radius * radius);
						 System.out.println("Area of circle is : "+area);
						 break ;
					}
					catch(ArithmeticException e)
				{
						System.out.println("Error");
				}
				case 2 : System.out.println("Enter the side of the Square ");
				 		 side = sc.nextDouble();
				 		 area =  side * side ;
				 	   	 System.out.println("Area of Square is : "+area);
				 		 break ;
				
				case 3 : System.out.println("Enter the length nd breadth of the Rectangle ");
		 		 		 length = sc.nextDouble();
		 		 		 breadth = sc.nextDouble();
		 		 		 area =  length * breadth ;
		 		 		 System.out.println("Area of Rectangle is : "+area);
		 		 		 break ;
			}
			System.out.println("\n\nPress 0 to exit or any other number to continue ");
			inp = sc.nextInt();
		}while(inp != 0);
		sc.close();
	}

}
