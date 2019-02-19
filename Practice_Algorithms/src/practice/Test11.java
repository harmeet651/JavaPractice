package practice;

class Bike
{
	public void speed()
	{
		System.out.println("200");
	}
}

class Pulsar extends Bike
{
	public void speed() // Cannot write static here bcoz static function cannot be override.. rsn - object ni banta clases se hi call hti h 
	{
		System.out.println(300);
	}
}
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar p1 = new Pulsar();
		p1.speed();
	//	Pulsar p2 = new Bike();  (cannot write dis )
		Bike b1 = new Pulsar();
		b1.speed();
	}

}
