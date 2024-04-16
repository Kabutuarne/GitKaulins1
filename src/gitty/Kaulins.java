package gitty;

import java.util.Random;

public class Kaulins {
	static void mesties(int reizes) {
		int sk;
		for(int i=0;i<reizes;i++) {
		Random rng = new Random();
		sk = rng.nextInt(6)+1;
		System.out.println("Tu uzmeti "+sk);
		}
	}
	public static void main(String[] args) {
		mesties(4);
	}

}
