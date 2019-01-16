import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		
		int num = Integer.parseInt(input.nextLine());
		
		if(num >= 0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The Number is negative");
		}

		
		input.close();
	}

}
