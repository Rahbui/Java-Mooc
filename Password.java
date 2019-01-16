package example;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Password: ");
			String password = reader.nextLine();
			
			if (password.equals("carrot")) {
				System.out.println("Right!");
				break; } 
			else {
				System.out.println("Wrong. Try again.");
			}
		}
	
		System.out.println("The secret is Strawberry!");
		
		reader.close();
	}

}
