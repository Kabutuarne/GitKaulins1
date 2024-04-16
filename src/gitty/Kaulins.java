package gitty;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		int sk, reizes;
		Random rng = new Random();
		Scanner dati = new Scanner(System.in);
		System.out.print("Cik reizes metīsi kauliņu?: ");
		reizes = dati.nextInt();
		for(int i=0;i<reizes;i++) {
		sk = rng.nextInt(6)+1;
		System.out.println("Tu uzmeti "+sk);
		}
	}

}
