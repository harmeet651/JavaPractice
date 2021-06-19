package classes_and_objects;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student s1 = new Student("Harry", 1);
		Student s2 = new Student("Siddhesh", 2);
		Student s3 = new  Student("Akashdeep", 3);
		s1.print();
		s2.print();
		s3.print();
	}

}
