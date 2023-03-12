package BREAK_CONTINUE_RETURN;

public class Main_CONTINUE {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i>5)
					continue;
				System.out.println(i+ "x" +j+ "="+ (i*j));
			}
			System.out.println("---");
		}
	}
}