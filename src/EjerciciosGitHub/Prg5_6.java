package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:21/01/24
 * 
 * 	Programa que lea un número positivo de 10 cifras y compruebe si es capicua utilizando un vector de números enteros de 10 
 * componentes. Valida la entrada.
 * 
 *****************************************************************************************************************************/
public class Prg5_6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long capicua[]=new long [10];
		long n=0,m,aux=0;
		do {
		System.out.println("Introduce un numero de 10 cifras");
		n=sc.nextLong();
		}while(n<1000000000L||n>9999999999L) ;
		
		m=n;
		for(int i=0;i<10;i++) {
			aux=m%10;
			m=m/10;
			capicua[i]=aux;	
		}
		
		if(capicua[0]==capicua[9]) 
			System.out.println("El numero es capicua");
		else
			System.out.println("El numero no es capicua");
				 
		}
		
	}
