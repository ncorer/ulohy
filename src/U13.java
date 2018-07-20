import java.util.Scanner;
public class U13 {

	public static void main(String[] args) {

		Scanner vstup = new Scanner(System.in);
		
		
		char[] znaky= new char[40];
		
		//pismena
		int c = 65;
		for(int i =0;i<26;i++) {
			znaky[i]=(char)c;
			c++;
		}
		
		//cisla
		c=48;
		for(int i =26;i<36;i++) {
			znaky[i]=(char)c;
			c++;
		}
		//znaky
		znaky[36]=(char)42;
		znaky[37]=(char)43;
		znaky[38]=(char)45;
		znaky[39]=(char)64;
		
		int dlzkaHesla = 0;
		String heslo = "";
		
		System.out.println("Zadaj dlzku hesla: ");
		dlzkaHesla=vstup.nextInt();
		
		System.out.println("Zadaj silu hesla: ");
		System.out.println("1. slabe");
		System.out.println("2. silne");
		
		int sila = vstup.nextInt();
		
		if (sila==1) {
			for(int i = 0; i < dlzkaHesla; i++) {
				int nahoda = (int) (Math.random() * 27);
				heslo +=znaky[nahoda];
			}
		}
		else if(sila==2) {
			for(int i = 0; i < dlzkaHesla; i++) {
				int nahoda = (int) (Math.random() * znaky.length);
				heslo +=znaky[nahoda];
			}
			}
		else {
			System.out.println("Nespravna hodnota sily.");
		}
		
		
System.out.println("Heslo je : " + heslo);
		
	}

}
