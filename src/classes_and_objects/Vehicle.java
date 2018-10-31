package classes_and_objects;

public class Vehicle {
	public String color;
	private int maxSpeed;
	
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	
	public void print()
	{
		System.out.println("Vehicle color is : "+color);
		System.out.println("Vehicle speed is : "+maxSpeed);
	}

}