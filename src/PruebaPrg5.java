import java.util.*;

public class PruebaPrg5 {
/********************************************************
 *       Programa que lea un número positivo de 10 cifras 
 *       y compruebe si es capicua utilizando un vector de números enteros de 10 componentes.
 *        Valida la entrada
 * 
 * 
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long v[]=new long [10];
		long n,res=0,aux=0;
		do {
		System.out.println("Introduce numero");
			n=sc.nextLong();
		}while(n<=999999999&&n<=9999999999L);
				
				for(int i=0;i<v.length;i++) {
					
					res=n%10;
					v[i]=res;
					n=n/10;		
				}
			
				for(int i=0;i<v.length;i++) {
					System.out.print(v[i]);
				}
				if(v[0]==v[9])
					System.out.println("\n capicua");
				else
					System.out.println("\n No es capicua");
		
	}
}
