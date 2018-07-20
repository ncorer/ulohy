import java.util.Scanner;

public class U9 {

	public static void main(String[] args) {


		Scanner vstup = new Scanner(System.in);
		System.out.println("Zadajte kolko cisel budete zadavat:");
		int a = vstup.nextInt();
		double b = 0;
		for(int i=0; i<a; i++) {
			System.out.println("Zadajte cislo");
			 b = b+ vstup.nextDouble();
							
			}
		
		System.out.println("Priemer je : " + b/a);
		
		
		

	}

}
