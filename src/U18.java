
public class U18 {

	public static void main(String[] args) {
		// e-mail analyzer

		String email = "zmudaova@elct.sk";

		System.out.println(schranka(email)); // zmuda
		System.out.println(server(email)); // elct.sk
		System.out.println(validny(email)); // ak sa nachadza v adrese jeden zavinac a v druhej casti aspon jedna bodka
		System.out.println(jeZena(email)); // ak schranka konci na ova vrati true

	}

	static boolean jeZena(String email) {
		String schran = schranka(email);
		// char[] prva = new char[schran.length()];
		// for (int i = 0; i < schran.length(); i++) {
		// prva[i] = schran.charAt(i);
		// }

		if (schran.substring(schran.length()-3,schran.length()).equals("ova")) {

			//schran.charAt(schran.length() - 1) == 'a' && schran.charAt(schran.length() - 2) == 'v'
		//	&& schran.charAt(schran.length() - 3) == 'o'
			
			return true;
		} else {
			return false;
		}

	}

	static boolean validny(String email) {
		// char[] prva = new char[email.length()];
		// for (int i = 0; i < email.length(); i++) {
		// prva[i] = email.charAt(i);
		// }

		int zavinac = 0;
		int bodka = 0;
		for (int j = 0; j < email.length(); j++) {
			if (email.charAt(j) == '@') {
				zavinac++;
			}
			for (int k = email.indexOf("@"); k < email.length(); k++) {
				if (email.charAt(k) == '.') {
					bodka++;
				}
			}
		}
		if (zavinac == 1 && bodka >= 1)
			return true;
		else
			return false;

	}

	static String server(String email) {
		int zavinac = email.indexOf('@');
		return email.substring((zavinac + 1), email.length());
	}

	static String schranka(String email) {
		int zavinac = email.indexOf('@');
		return email.substring(0, zavinac);
	}

}
