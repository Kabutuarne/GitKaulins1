package gitty;

import java.util.Random;

public class Kaulins {
	static void mesties() {
		int sk;
		Random rng = new Random();
		sk = rng.nextInt(1)+6;
		System.out.print("Tu uzmeti "+sk);
	}
	public static void main(String[] args) {
		mesties();
	}

}
