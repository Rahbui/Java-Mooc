package example;

public class PrintingStars {
	
	public static void printstars( int amount) {
		while (amount > 0) {
			System.out.print("*");
			amount--;
		}
		System.out.println();
		
	}
	public static void printsquare(int i) {
			while (i > 0) {
			printstars(4);
			i--;
		}
		
	}
	
	public static void printrectangle(int width, int height) {
		
		while (height > 0) {
			printstars(width);
			height--;
		}
	}
	
	public static void printtriangle(int size) {
		int i = 1;
		while (i <= size) {
			printstars(i);
			i++;
		}
	}

	public static void main(String[] args) {
		/*printstars(5);
		printstars(3);
		printstars(9);*/
		
		//printsquare(4);
		
		//printrectangle(17,3);
		
		printtriangle(4);
		

	}

}
