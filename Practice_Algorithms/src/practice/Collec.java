package practice;
import java.util.*;
public class Collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Shekhar");
		a1.add("Bikram");
		a1.add("Arsh ");
		a1.add("Bhandari");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Masti");
		a2.add("Abhay");
		a2.add("Vari Bhai");
		a2.add("Bengali");
		a1.addAll(a2);
		
		a1.retainAll(a2);
		System.out.println(a2);
		
		Collections.sort(a2);
		System.out.println(a2);
		
		Iterator<String> i1 = a2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
