
public class U14 {

	public static void main(String[] args) {
		//

		System.out.println(najmensie(1, 2, 3));// 1
		System.out.println(priemer(1, 2, 3, 4, 5, 6));// 3,5
		System.out.println(rovnake(1, 1, 1));// true
		System.out.println(sum(1, 4));// 10
		int[] pole = vygenerujPole(1, 10, 4);// {1,8,7,5}
		vypisPole(pole);
		System.out.println(fact(5));

	}

	static int fact(int f) {
		if (f == 0)
			return 1;
		if (f < 0)
			return -1;

		int sum = 1;

		for (int i = 1; i <= f; i++) {
			sum *= i;

		}
		return sum;
	}

	static void vypisPole(int[] pole) {
		for (int i = 0; i < pole.length; i++) {
			if(i<pole.length-1) {System.out.print(pole[i] + ", ");}
			else {System.out.print(pole[i]);}
		}
		System.out.println();
	}

	static int[] vygenerujPole(int a, int b, int pocet) {
		int[] cisla = new int[pocet];
		for (int i = 0; i < pocet; i++) {
			cisla[i] = (int) (Math.random() * (b-a)) + a;
		}
		return cisla;
	}

	static int sum(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

	static boolean rovnake(int i, int j, int k) {
		if (i == j && j == k) {
			return true;
		} else {
			return false;
		}
	}

	static double priemer(int... cisla) {
		int sum = 0;
		for (int i = 0; i < cisla.length; i++) {
			sum += cisla[i];
		}
		return (double) sum / cisla.length;
	}

	static int najmensie(int i, int j, int k) {
		int min = i;
		if (j < i) {
			min = j;
		}
		if (k < j) {
			min = k;
		}

		return min;
	}

}
