import java.util.Scanner;

public class U10 {

	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Vyberte typ hry:\n1.mala nasobilka\n2.velka nasobilka");

		int typHry = vstup.nextInt();
		
		
			while(!(typHry ==1 || typHry ==2)) {
				System.out.println("Zadali ste nespravnu volbu, prosim opakujte volbu:");
				typHry = vstup.nextInt();
				//if(typHry == 1 || typHry ==2)
					//break;
				};
		
				int pocetOpakovani=0;
				int uspesne = 0;
				long zaciatokCas = System.currentTimeMillis();		
				
		switch(typHry){
		
		case 1:
			System.out.println("Vybrali ste malu nasobilku.");
			for (pocetOpakovani=0;pocetOpakovani<5;pocetOpakovani++) {
				int nahoda = (int) (Math.random() * 10)+1;
				int nahoda1 = (int) (Math.random() * 10)+1;
				
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
			break;
		
		case 2:
			System.out.println("Vybrali ste velku nasobilku.");
			for (pocetOpakovani=0;pocetOpakovani<5;pocetOpakovani++) {
				int nahoda = (int) (Math.random() * 20)+1;
				int nahoda1 = (int) (Math.random() * 20)+1;
				
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
					
		}
		long konecCas = System.currentTimeMillis();
		long rozdielCas = (konecCas - zaciatokCas)/1000;
		System.out.println("*******************************************\n");
		System.out.println("Vasa uspesnost je " + uspesne + " z " + pocetOpakovani + " prikladov, co je " + ((double)uspesne/pocetOpakovani)*100 + " % uspesnost. " + "\nTrvalo vam to: " + rozdielCas + " sekund.");
		
		
	}

}
