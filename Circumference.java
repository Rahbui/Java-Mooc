import java.util.Scanner;

import java.math.*;

import java.math.*;

public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//float pi = 3.1415926f;
		
		Scanner person = new Scanner(System.in);
		
		System.out.print("Type the radius: ");
		
		float radius = Integer.parseInt(person.nextLine());
		
		System.out.println();
		
		double circ = (2 * java.lang.Math.PI * radius);
		
		System.out.printf("Circumference of the Circle: " + "%.14f",circ);
		
		
		person.close();

	}

}
