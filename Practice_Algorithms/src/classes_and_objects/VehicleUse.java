package classes_and_objects;

public class VehicleUse {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
//		v.color = "Red";
//		v.setMaxSpeed(10);
//		v.print();
		//vehicle class is abstract now so can't make object
		Car c = new Car();
		c.color="Yellow";
		c.setMaxSpeed(50);
		c.noOfGears=10;
		c.modelYear=2010;
		c.isMotorized();
		c.printCar();
		}

}
