import java.util.Scanner;

public class U15Keno {

	static Scanner vstup = new Scanner(System.in);

	public static void main(String[] args) {
		int[] tip = nacitajTip();
		double stavka = nacitajStavku();
		int[] zrebovanie = zrebuj();
		int pocetUhadnutych = porovnaj(tip, zrebovanie);
		zobrazVysledok(tip, zrebovanie, pocetUhadnutych);
		

if (pocetUhadnutych>=4) {
	System.out.println("Vasa stavka bola: " + stavka + ". \nVyhrali ste: "  + stavka*100);
}
else if(pocetUhadnutych==3) {
	System.out.println("Vasa stavka bola: " + stavka + ". \nVyhrali ste: "  + stavka*70);
}
else if(pocetUhadnutych==2) {
	System.out.println("Vasa stavka bola: " + stavka + ". \nVyhrali ste: "  + stavka*2);
}
else if(pocetUhadnutych==1) {
	System.out.println("Vasa stavka bola: " + stavka + ". \nVyhrali ste: "  + stavka);
}
else {
	System.out.println("Smola nevyhravate ,netrafili ste ani jedno cislo, skuste stastie nabuduce.");
}
		


	}

	static void zobrazVysledok(int[] tip, int[] zrebovanie, int pocetUhadnutych) {

		System.out.print("Tip : ");
		vypis(tip);
		System.out.print("Zrebovanie : ");
		vypis(zrebovanie);
		System.out.println("Pocet uhadnutych cisel : " + pocetUhadnutych);
		

	}

	static void vypis(int[] pole) {
		for (int i = 0; i < pole.length; i++) {
			if (i < pole.length - 1) {
				System.out.print(pole[i] + ", ");
			} else {
				System.out.print(pole[i]);
			}
		}
		System.out.println();

	}

	static int porovnaj(int[] tip, int[] zrebovanie) {
		int temp;
		int zhoda = 0;
		for (int i = 0; i < tip.length; i++) {
			temp = tip[i];
			for (int j = 0; j < zrebovanie.length; j++) {
				if (temp == zrebovanie[j]) {
					zhoda++;
				}
			}
		}

		return zhoda;
	}

	static int[] zrebuj() {
		int[] pole = new int[10];
		for (int i = 0; i < pole.length; i++) {
			int nahoda = (int) (Math.random() * 20) + 1;
			pole[i] = nahoda;
		}

		return pole;
	}

	static double nacitajStavku() {
		double s = 0;
		System.out.print("Kolko chcete stavit na vyhru: ");
		s = vstup.nextDouble();
		return s;
	}

	static int[] nacitajTip() {
		int[] tt = new int[4];

		for (int i = 0; i < tt.length; i++) {
			System.out.print("Zadaj " + (i + 1) + ". cislo (1-20): ");
			tt[i] = vstup.nextInt();
			System.out.println();
		}

		System.out.println("");
		return tt;
	}

}
