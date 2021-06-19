package practice;
import java.util.Scanner;
class CircleC
{
	private float rad = 0.0f;
	private double areaC = 0.0f;
	public void radius()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius");
	    rad = s.nextInt();
	}
	public double area()
	{
	    areaC = Math.PI*rad*rad;
	    return areaC;
	}
}

public class AreaPerimeterClasses {

	public static void main(String[] args) {
		CircleC a = new CircleC();
		a.radius();
		System.out.println(a.area());
	}
}