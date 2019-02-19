package classes_and_objects;

public class Car extends Vehicle {
	
	public int noOfGears;
	public int modelYear;
	
	public void printCar()
	{
		System.out.println("Car color is : "+color);
		System.out.println("Car speed is : "+getMaxSpeed());
		System.out.println("Car has these many gears : "+noOfGears);
		System.out.println("Car model is : "+modelYear);
	}

	@Override
	//override -Use it every time you override a method for two benefits. Do it so that you can take advantage of the compiler checking
	//to make sure you actually are overriding a method when you think you are. This way, if you make a common mistake of misspelling a
	//method name or not correctly matching the parameters, you will be warned that your method does not actually override as you think 
	//it does. Secondly, it makes your code easier to understand because it is more obvious when methods are overwritten.
	public boolean isMotorized() 
	{	
		return false;
	}
	
}
