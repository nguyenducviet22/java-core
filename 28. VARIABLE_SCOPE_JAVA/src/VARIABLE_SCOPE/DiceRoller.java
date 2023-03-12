package VARIABLE_SCOPE;

import java.util.Random;

public class DiceRoller {
	Random rd;
	int num;

	DiceRoller() {
		rd = new Random();
		roll(rd, num);
	}

	public void roll(Random rd, int num) {
		num = rd.nextInt(6) + 1;
		System.out.println(num);
	}
}