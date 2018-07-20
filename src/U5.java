import java.util.Scanner;
public class U5 {

	public static void main(String[] args) {
	//vypocet BMI
		//nacitat vstup
		//vypocitat bmi
		//zobrazit hodnotu bmi a hlasku ci je zdravy

		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Zadaj vysku v centimetroch :");
		
	//	String vyska = vstup.nextLine();
		double vyskad = Double.parseDouble(vstup.nextLine())/100;
		
		System.out.println("Zadajte vahu v kilogramoch : ");
		
	//	String vaha = vstup.nextLine();
		int vahad = Integer.parseInt(vstup.nextLine());
		
		double bmi = vahad / (vyskad*vyskad);
		
		if (bmi < 18.5) {
			System.out.printf("Vase BMI je %.2f ste podvyzyveny.",bmi);
		}else if (bmi < 25) {
			System.out.printf("Vase BMI je %.2f ste zdravy.",bmi);
		}else if (bmi < 30) {
			System.out.printf("Vase BMI je %.2f mate miernu nadvahu.",bmi);
		}else if (bmi < 40) {
			System.out.printf("Vase BMI je %.2f ste obezny",bmi);
		}else if (bmi > 40) {
			System.out.printf("Vase BMI je %.2f ste super obezny",bmi);
		}
		
		
	}

}
