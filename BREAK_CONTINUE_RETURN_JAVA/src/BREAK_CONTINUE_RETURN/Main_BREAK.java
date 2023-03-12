package BREAK_CONTINUE_RETURN;

public class Main_BREAK {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				if  (i<4)
					break;
				System.out.println(i + " x " + j + "=" + (i * j));
			}
			System.out.println("---");
		}
		
		outer: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				if  (i<4)
					break outer;
				System.out.println(i + " x " + j + "=" + (i * j));
			}
			System.out.println("---");
		}
	}
}