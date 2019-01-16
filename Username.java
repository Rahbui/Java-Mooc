package example;

import java.util.Scanner;


public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type your Username: ");
		
		String username = input.nextLine();
		
		System.out.print("Type your Password: ");
		
		String password = input.nextLine();
		
		if (username.equals("emily") && password.equals("cat") || username.equals("alex") && password.equals("mightyducks")){
			  {
				System.out.println("You are now logged in.");
			}
		}else {
			System.out.println("Your username or password is invalid.");
		}
		
		input.close();
	}

	
}
