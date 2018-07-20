import java.util.Scanner;

public class U19kreditka {

	public static void main(String[] args) {
		// na vstupe nacita cislo karty a na konci vyupluje ci je validna alebo nie

		String cisloKarty = "";
		int[] cislo = new int[16];

		Scanner vstup = new Scanner(System.in);

		System.out.println("Zadaj cislo karty: ");
		cisloKarty = vstup.nextLine();

		// prevod cisla na string do pola

		for (int i = 0; i < cisloKarty.length(); i++) {
			cislo[i] = Integer.parseInt(cisloKarty.substring(i, i + 1));
		}

		//suma neparnych cisel od konca
		
		int sumaNeparne = 0;
		for (int i= cislo.length-1; i>0; i-=2) {
			sumaNeparne += cislo[i];
		}
		
			
		//vytvorenie retazca z dvojnasobku zvysnych cisel v poli
		String temp = "";
		for(int i =0; i<cislo.length;i+=2)
		{temp+=cislo[i]*2;
			
		}
		
		
		int cifSucet =0;
		
		for (int i =0;i<temp.length();i++) {
			cifSucet += Integer.parseInt(temp.substring(i, i+1));
		}
		
		int kontrolnaSuma = cifSucet + sumaNeparne;
		
		if(kontrolnaSuma%10==0) {
			System.out.println("Platna Karta !");
		}
		else {
			System.out.println("Neplatna karta !");
		}
	}

}
