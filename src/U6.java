import java.util.Scanner;
public class U6 {

	public static void main(String[] args) {
		// 

		int nahoda = (int) (Math.random() * 10)+1;
		int nahoda1 = (int) (Math.random() * 10)+1;
		int nahoda2 = (int) (Math.random() * 10)+1;
		int nahoda3 = (int) (Math.random() * 10)+1;
		
		System.out.println("Vypocitaj tento priklad \n " + nahoda + " x " + nahoda1 + " = ");
		Scanner vstup = new Scanner(System.in);
		
		int vysledok = vstup.nextInt();
		
		int spravnyVysledok = nahoda * nahoda1;
		
		if(vysledok == spravnyVysledok)
			System.out.println("Spravny vysledok !");
		else
			System.out.println("Nespravny vysledok !");
		
		System.out.println("\nDruha uloha\nVypocitaj tento priklad \n " + nahoda2 + " x " + nahoda3 + " = ");
		
		int vysledok1 = vstup.nextInt();
		int spravnyVysledok1 = nahoda2 * nahoda3;
		
		if(vysledok1 == spravnyVysledok1)
			System.out.println("Spravny vysledok !");
		else
			System.out.println("Nespravny vysledok !");
	}

}
