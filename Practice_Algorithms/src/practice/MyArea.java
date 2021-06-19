package practice;

import java.util.Scanner;
abstract class area
{
	abstract double area1(double a);
}

class Square extends area
{
	double area1(double a)
	{
		//System.out.println("Area of rectangle is : "+(a*a));
		double ar = a*a;
		return ar ;
	}
}

class Circle extends area
{
	double area1(double r)
	{
		//System.out.println("Area of Square is : "+(3.14*(r*r)));
		double ar = 3.14*(r*r);
		return ar ;
	}
}

public class MyArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice , a ;
		double sd , r , a1 , a2 ;
		Square s = new Square(); 
		Circle c = new Circle();
		do
		{
			System.out.println("Enter your choice \n1.Square \n2.Circle");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 :System.out.println("Enter the side of the square");
				sd = sc.nextInt();
				a1 = s.area1(sd);
				System.out.println("Area of Square is : "+a1);
				break ;
				
				case 2 :System.out.println("Enter the radius of the circle");
				r = sc.nextInt();
				a2 = c.area1(r);
				System.out.println("Area of Circle is :"+a2);
				break ;
				
				default :System.out.println("You have entered a wrong choice");
			}
		System.out.println("Press 0 for exit or any other number to continue");
		a = sc.nextInt();
		}while( a != 0);
		sc.close();
	}
}
