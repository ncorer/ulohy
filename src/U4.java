import java.util.Scanner;
public class U4 {

	public static void main(String[] args) {

		Scanner vstup = new Scanner(System.in);	
		
		System.out.println("Zadaj sumu.");
		
		int suma = vstup.nextInt();
		
	/*	int patsto = suma /500;
		suma = suma % 500;
		int dvesto = suma /200;
		suma = suma  % 200;
		int sto = suma /100;
		suma = suma % 100;
		int patdesiat = suma /50;
		suma = suma % 50;
		int dvadsat = suma /20;
		suma = suma % 20 ;
		int desat = suma / 10;
		suma = suma % 10 ;
		int pat = suma / 5;
		
		System.out.println("Suma " + suma + "obsahuje nasledovny pocet bankoviek: 500: " + patsto + ", 200: " + dvesto +", 100: " + sto + ", 50: " + patdesiat + ", 20: " + dvadsat + ", 10: " + desat + ", 5: " + pat );
		*/
		int[] bankovky={500,200,100,50,20,10,5};
		int[] pocetbankoviek = new int[bankovky.length];
		
		
		for(int i = 0; i<bankovky.length; i++) {
			pocetbankoviek[i] = suma / bankovky[i];
			suma = suma % bankovky[i];
			System.out.println("Pocet bankoviek " + bankovky[i] + " je " + pocetbankoviek[i]);
		}
		
	}

}
