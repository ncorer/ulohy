
public class U12 {

	public static void main(String[] args) {
int[] cisla = {1,-5,78,789,-587,12,16,99,327,555};

//vypisat pole odzadu
//vypis kladnych cisel
//pocet zapornych cisel
//suma parnych cisel


for(int i=cisla.length;i>0;i--) {
	System.out.print(cisla[i - 1] + ", ");
}

System.out.println();
System.out.println("--------------------------");

for(int i:cisla) {
	if(i>0) {
		System.out.print(i+", ");
	}
}
System.out.println();
System.out.println("--------------------------");

int suma=0;
for(int i:cisla) {
	if(i<0) {		
	suma++;	
	}
	
	}
System.out.println(suma);


System.out.println("--------------------------");

suma=0;
for(int i:cisla) {
	if(i%2==0) {		
	suma+=i;	
	}

}

System.out.println(suma);


	

	}
}
