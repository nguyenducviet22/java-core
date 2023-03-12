package Pro_fun;

public class Multiplication {
	static int result; // focus!!!

	public static void main(String args[]) {
		int num1 = 3, num2 = 5, num3 = 7;
		result = Docalculation.multiCalcOfThree(num1, num2, num3);
		System.out.println("Multiplication of num1*num2*num3 = " + result);
//		System.out.println(multiCalcOfThree(num1, num2, num3));
	}
//	public static int multiCalcOfThree(int n1, int n2, int n3) {
//		result = n1 * n2 * n3;
//		return result;
//	}
}

class Docalculation {
	public static int multiCalcOfThree(int n1, int n2, int n3) {
		int result = n1 * n2 * n3;
		return result;
	}
}