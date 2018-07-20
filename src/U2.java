import java.util.Scanner;
public class U2 {

	public static void main(String[] args) {
        //program na vypocet obvodu a obsahu kruhu
		//o = 2* pi *r
		//s = pi * r* r

		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Zadajte pozadovany polomer.");
		
		int r = vstup.nextInt();
		//TODO toto musi dorobit
		
		
		System.out.println("S = " + Math.PI * r * r );
		System.out.println("o = " + 2 * Math.PI * r);

		
		//FIXME toto nefunguje
	}

}
