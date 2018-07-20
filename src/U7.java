import java.util.Scanner;

public class U7 {

	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Zadajte rok :");
		
		int rok = vstup.nextInt();
		
		if (((rok%4 == 0) && (rok%100 !=0)) || rok%400 == 0)
			System.out.println("Rok " + rok + " je priestupny.");
		else
			System.out.println("Rok " + rok + " je nepriestupny.");

	}

}
