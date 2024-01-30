package EjerciciosGitHub;
import java.util.*;
/*
 * Autor : Álvaro Comenge
 * 
 * Fecha 16-01-24
 * 
 *  A partir del vector anterior, cargado y ordenado, solicitar dos números por teclado
 *  y mostrar los elementos del vector que estén comprendidos entre dos valores introducidos,
 *  que deberán ser validados.
 */
public class Prg5_2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int v[]=new int[10];
	int n1=0,n2=0;
	
	System.out.println("Cargar vector con enteros");
		for(int i=0;i<v.length;i++) {
			v[i]= sc.nextInt();
		}
		do {
			System.out.println("Introduce numero donde empieza la secuencia");
				n1=sc.nextInt();	
			System.out.println("Introduce numero donde termina la secuencia");
				n2=sc.nextInt();
				if(/*n1==n2-1||*/n2<n1||n2>v.length) {
					System.out.println("Los numeros de secuencia son incorrectos");
				}
		}while(/*n1==n2-1||*/n2<n1||n2>v.length);
			
				for(int i=n1;i<n2-1;i++) {
					System.out.print(v[i]+", ");
				
				}
		
		}	
	}

