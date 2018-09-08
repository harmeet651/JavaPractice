package practice;
class box
{
	double width;
	double height;
	double length;
box(double w, double h, double l)
{
	width=w;
	height=h;
	length=l;
}
double volume()
{
	return width*height*length;
}
}
class boxfinal
{
	public static void main(String args[])
	{
	box o1= new box(1,1,1);
	box o2= new box(1,2,3);

	System.out.println("Volume of Box 1 is "+ o1.volume());
	System.out.println("Volume of Box 1 is "+ o2.volume());
	}
}
