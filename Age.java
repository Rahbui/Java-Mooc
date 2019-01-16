import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		
		int age = Integer.parseInt(input.nextLine());
		
		if (age > 0 &&
				age < 100) {
			System.out.println("OK");
		}else {
			System.out.println("Impossible!");
		}
		
		input.close();
	}

}
