package example;

import java.util.Scanner;

public class LoopsEndingRemembering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		double sumofall = 0;
		int count = 0;
		int even = 0;
		int odd = 0;
		
		System.out.println("Type numbers: ");
		
		
		while (true) {
			
		 
			int num = Integer.parseInt(reader.nextLine());
			if (num == -1) {
				break;}
			else {
			sumofall = sumofall + num;
			count++;
			if (num % 2 == 0) {
				even++;
			} 
			else {
				odd++;
			}
			
		}
		}
		
		double ave = (sumofall / count);
		int total = 0;
		total = (total += sumofall);
			
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is " + total);
		System.out.println("How Many numbers: " + count);
		System.out.println("The Average is: " + ave);
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + odd);
		
		reader.close();

	}

}
