import java.util.Scanner;
public class U16 {

	static Scanner vstup = new Scanner(System.in);
	
	public static void main(String[] args) {
		// program ktory nacita vetu od uzivatela a vypise ju odzadu
//nacitajVstup();
System.out.println("Otocena veta je : " + otoc(nacitajVstup()));

	}

	static String nacitajVstup() {
		System.out.print("Zadajte vetu ktoru chcete vypisat odzadu:");
		String veta = vstup.nextLine();
		return veta;
	}
	
	static String otoc(String veta) {
		char[] otocka = new char[veta.length()];
		for(int i=0;i<veta.length();i++) {
			otocka[veta.length()-i-1]=veta.charAt(i);
		}
		String otocene = new String(otocka);
		return otocene;
/*
 * String V ="";
 * for(int i = veta.lenght() -1; i >=0;i--){
 * v+=veta.charAt(i);
 * }
	return v;
	*/

	}
	
}
