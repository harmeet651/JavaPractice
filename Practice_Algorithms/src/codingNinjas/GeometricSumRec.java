package codingNinjas;

public class GeometricSumRec {

	public static void main(String[] args) {
		int k=3;
		double a = GSR(k);
		System.out.println(a);
	}
	public static double GSR(int k)
	{
		if(k==0)
		{
			return 1;
		}
		double p = Math.pow(2, k);
	    return 1/p + GSR(k-1);
	}
}
