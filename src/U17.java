import java.util.Scanner;

public class U17 {

	static Scanner vstup = new Scanner(System.in);

	public static void main(String[] args) {
		// program testuje ci uzivatel na vstupe zadal palindrom

		// System.out.println("Otocena veta je : " + otoc(nacitajVstup()));
		String slovo = nacitajVstup();

		if (slovo.equals(otoc(slovo))) {
			System.out.println("Zadali ste palindrom !");
		} else {
			System.out.println("Nezadali ste palindrom.");
		}

	}

	static String nacitajVstup() {
		System.out.print("Zadajte slovo ktore chcete zistit ci je palindrom");
		String veta = vstup.nextLine();
		return veta;
	}

	static String otoc(String veta) {
		char[] otocka = new char[veta.length()];
		for (int i = 0; i < veta.length(); i++) {
			otocka[veta.length() - i - 1] = veta.charAt(i);
		}
		String otocene = new String(otocka);
		return otocene;
	}

}
