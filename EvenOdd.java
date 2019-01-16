import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a Number: ");
		
		int num = Integer.parseInt(input.nextLine());
		
		//int odds = (num % 2 == 0);
		
		if (num % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	
		input.close();
	}
	


}
