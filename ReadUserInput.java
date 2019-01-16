import java.util.Scanner;

public class ReadUserInput {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Who are you?");
		String name = reader.nextLine();
		
		System.out.println("Hello " + name + "!");
		
		System.out.println("How old are you?");
		int age = Integer.parseInt(reader.nextLine());
		
		System.out.println("Wow! " + age + " years young!");

		int birthYear = (2018 - age);
		
		System.out.println();
		System.out.println("You were born in the year: " + birthYear);
		reader.close();
	}

}
