import java.util.Scanner;

public class U9a {

	public static void main(String[] args) {
		// Program vypocita priemer z uzivatelom zadanych cisel
		// vstup je 1,2,-7,9,0
		// vystup 1.25
		
		Scanner vstup = new Scanner(System.in);
		
		
		int pocet = 0;
		double vstupnaHodnota;
		double suma =0;
		
		do{
			System.out.println("Zadajte cislo:");
			pocet++;
			vstupnaHodnota = vstup.nextDouble();
			suma = suma + vstupnaHodnota;
			
		}while(vstupnaHodnota!=0);
		
		if(vstupnaHodnota==0 && pocet!=0)
		System.out.println("Priemer je : " + suma/(pocet-1));
		else
			System.out.println("Musite zadat aspon jedno cislo");
		
		
	}

}
