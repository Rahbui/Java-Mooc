package example;

public class PrintingLikeaBoss {
	
	public static void printstars(int size) {
		while (size > 0) {
			System.out.print("*");
			size--;
		}
		System.out.println();
	}
	
	public static void printspace(int size) {
		while (size > 0) {
			System.out.print(" ");
			size--;
		}
	}
	
	public static void printtriangle(int size) {
		int i = 1;
		while (size > 0) {
			printspace(size);
			printstars(i);
			size--;
			i++;
		}
	}
	
	public static void xmasTree(int height) {
		int i = 1;
		int j = 1;
		while (j <= height) {
			printspace(height-j);
			j++;
			printstars(i);
			i += 2;
		}
		printspace((i /2) - 2);
		printstars(3);
		printspace((i /2) - 2);
		printstars(3);
	}

	public static void main(String[] args) {
		
		xmasTree(10);
		
	}

}
