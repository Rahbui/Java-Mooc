package example;

import java.util.Scanner;

public class PrintingText {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How Many?");
		
		int num = Integer.parseInt(reader.nextLine());
		
		int start = 0;
		
		while (start < num) {
			printtext();
			start++;
		}
		
		

	}
	
	
	public static void printtext() {
		System.out.println("In the beginning there were the swamp, the hoe, and Java.");
	}
	

}
