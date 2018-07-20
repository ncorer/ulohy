
public class U3 {

	public static void main(String[] args) {
		//zobrazenie aktualneho casu
long aktualnyCas = System.currentTimeMillis();

System.out.println(aktualnyCas);

long celkoveS = aktualnyCas / 1000;
long aktualneS = celkoveS % 60;

long celkoveM = celkoveS/60;
long aktualneM = celkoveM % 60;

int celkoveH =(int) celkoveM/60;
int aktualneH = (celkoveH % 24)+2;

System.out.println("Aktualny cas je " + aktualneH + ":" + aktualneM + ":" + aktualneS);

	}

}
