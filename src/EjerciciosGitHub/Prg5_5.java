package EjerciciosGitHub;
import java.util.*;
/**************************************************************************************************************************
 * Autor : Álvaro Comenge
 * 
 * Fecha 16-01-24
 * 
 * 	Realiza un programa que lee 20 números reales y saca por pantalla aquellos que sean mayores que la media. .
  
 *******************************************************************************************************************************/
public class Prg5_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		pongo double porque un numero real es del infinito hasta menos infinito y double tiene mayor precision.
		final int  T=5;
		double n,aux=0, media=0;
		double r []=new double[T];
	
	
		for(int i=0;i<T;i++) {
			System.out.println("Introduce numeros reales");
				n=sc.nextDouble();
				r[i]=n;
				aux+=n;
		}

		media=aux/T;
		
		System.out.println("Numeros mayores a la media son :");
			for(int i=0;i<T;i++) {
				
				if(r[i]>media)
					
		System.out.println(r[i]);
		
	}
		sc.close();
	}
}