import java.util.Scanner;

public class U10a {

	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Vyberte typ hry:\n1.mala nasobilka\n2.velka nasobilka");

		int typHry;
		int nasobilka;
		
		
		while(true) {
			typHry = vstup.nextInt();
			
			if (typHry == 1) {
				nasobilka = 10;
				System.out.println("Zvolili ste malu nasobilku.");
				break;}
				
			if (typHry == 2) {
				nasobilka = 20;
				System.out.println("Zvolili ste velku nasobilku.");
				break;}
			
			System.out.println("Zvolte prosim 1. pre malu nasobilku alebo 2. pre velku nasobilku.");			
		}

		int pocetOpakovani=0;
		int uspesne = 0;
		long zaciatokCas = System.currentTimeMillis();		
		
		for (pocetOpakovani=0;pocetOpakovani<5;pocetOpakovani++) {
			int nahoda = (int) (Math.random() * nasobilka)+1;
			int nahoda1 = (int) (Math.random() * nasobilka)+1;
			
			System.out.println("Vypocitaj tento priklad \n " + nahoda + " x " + nahoda1 + " = ");
			
			int vysledok = vstup.nextInt();
			
			int spravnyVysledok = nahoda * nahoda1;
			
			if(vysledok == spravnyVysledok) {
				System.out.println("Spravny vysledok !\n");
				uspesne++;
				}
			else
				System.out.println("Nespravny vysledok !\n");
		}
		
		long konecCas = System.currentTimeMillis();
		long rozdielCas = (konecCas - zaciatokCas)/1000;
		System.out.println("*******************************************\nKoniec hry!");
		System.out.println("Vase skore je " + uspesne + " z " + pocetOpakovani + " prikladov, co je " + ((double)uspesne/pocetOpakovani)*100 + " % uspesnost. " + "\nTrvalo vam to: " + rozdielCas + " sekund.");
		
	}

}
