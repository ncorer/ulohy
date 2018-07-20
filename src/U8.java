
public class U8 {

	public static void main(String[] args) {
		// 1,3,5,7,9,11
		// 0,2,4,6,8,10
		// 1,2,4,8,16,32
		//* 0,1,1,2,3,5,8,13,21,34 fibonacciho postupnost

/*		for(int i=1; i<12; i+=2)
			System.out.println(i);
		
		for(int i=0; i<11; i+=2)
			System.out.println(i);
		
		for(int i=1; i<33; i*=2)
			System.out.println(i);*/
		
		//fibonacci original
		int a=0;
		int b=1;
		int c;

		System.out.println(a + "\n"+ b );
		for(int i=0; i<10;i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}

		
		//fibonacci alternativa
		for(int k=0,l=1; k<35; k=k+l,l=k+l) {
			System.out.println(k);
			System.out.println(l);
		}
		
		
		for(int i=0, j = 10; i<10; i++,j--) {
			System.out.println(i + ":" + j);
		}
		

		
		
	}

}
