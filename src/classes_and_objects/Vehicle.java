package classes_and_objects;

public abstract class Vehicle {
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
	
	//final print can't name a print in car and call it now
	public final void print()
	{
		System.out.println("Vehicle color is : "+color);
		System.out.println("Vehicle speed is : "+maxSpeed);
	}
	
	//abstract method, completed in car, due to this we have made the class vehicle abstract, now cannit make object of vehicle
	public abstract boolean isMotorized();

}