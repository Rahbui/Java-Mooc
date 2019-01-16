import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		
		int first = Integer.parseInt(input.nextLine());
		
		System.out.print("Type another number: ");
		
		int second = Integer.parseInt(input.nextLine());
		
		int result = java.lang.Math.max(first, second);
		
		System.out.println();
		
		if (first != second) {
		System.out.println("The larger of the two numbers is: " + result);}

		if (first > second) {
			System.out.println("The first number is larger.");
		
		}
		if (first < second) {
			System.out.println("The second number is larger.");
		};
		
		if (first == second) {
			System.out.println("The two numbers are the same.");
		}
		
		
		input.close();
	}

}
