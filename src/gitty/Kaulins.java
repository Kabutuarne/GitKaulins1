package gitty;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {
static void mesties(int reizes) {
	int sk, lielakais=0;
	for(int i=0;i<reizes;i++) {
	Random rng = new Random();
	sk = rng.nextInt(6)+1;
	System.out.println("Tu uzmeti "+sk);
		if(lielakais< sk)
			lielakais=sk;
	}
	System.out.println("Lielakais ir "+lielakais);
}
	public static void main(String[] args) {
		int reizes;
		Random rng = new Random();
		Scanner dati = new Scanner(System.in);
		do {
		System.out.print("Cik reizes metīsi kauliņu?: ");
		reizes = dati.nextInt();
		}while(reizes<1);
		mesties(reizes);
	}

}
