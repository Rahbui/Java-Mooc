package example;

import java.util.Scanner;

public class OnehunderedtoOne {

	public static void main(String[] args) {
		// Down from one hundered

		/*int num = 100;
		
		while(num >= 0) {
			System.out.println(num);
			num = num - 1;
		}
		
		//Up to one hundered
		int num = 0;
		
		while(num <= 100) {
			System.out.println(num);
			num++;
		}
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Up to what number? ");
		
		int upto= Integer.parseInt(reader.nextLine());
		
		int num = 0;
		
		while (num <= upto) {
			System.out.println(num);
			num++;
		}
		
		
	int num = 0;
		
		while(num <= 100) {
			System.out.println(num);
			num = num + 2;
		}*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("From what number? ");
		
		int low= Integer.parseInt(reader.nextLine());
		
		System.out.print("Up to what number? ");
		
		int high= Integer.parseInt(reader.nextLine());
		
		int num = 0;
		
		while (low <= high) {
			System.out.println(low);
			low++;
		}
	}

}
