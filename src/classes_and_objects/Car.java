package classes_and_objects;

public class Car extends Vehicle {
	
	public int noOfGears;
	public int modelYear;
	
	public void print()
	{
		System.out.println("Car color is : "+color);
		System.out.println("Car speed is : "+getMaxSpeed());
		System.out.println("Car has these many gears : "+noOfGears);
		System.out.println("Car model is : "+modelYear);
	}
	
}
