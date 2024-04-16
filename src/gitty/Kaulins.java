package gitty;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {
<<<<<<< HEAD

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
=======
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
>>>>>>> idejuZARS
	}

}
