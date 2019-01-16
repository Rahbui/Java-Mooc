import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type the points: ");
		
		int num = Integer.parseInt(input.nextLine());
		
		if (num <= 29) {
			System.out.println("FAILED");
			
		}else if (num >= 30 && num <= 34) {
			System.out.println();
			System.out.println("Grade: 1");
		}else if (num >=35 && num <= 39) {
			System.out.println();
			System.out.println("Grade: 2");
		}else if (num >=40 && num <= 44) {
			System.out.println();
			System.out.println("Grade: 3");
		}else if (num >=45 && num <= 49) {
			System.out.println();
			System.out.println("Grade: 4");
		}else if (num >=50 && num <= 60) {
			System.out.println();
			System.out.println("Grade: 5");
		}

		input.close();
	}

}
