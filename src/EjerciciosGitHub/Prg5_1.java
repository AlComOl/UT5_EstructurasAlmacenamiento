package EjerciciosGitHub;
import java.util.*;
/*  Autor:Álvaro Comenge 
 * 
 *  Fecha 15-01-2024
 * 
 *  Realiza un programa en el que se solicita un nº entero por teclado y muestra por pantalla los 
 *  elementos de un vector de enteros que sean iguales o superiores.
 * 
 */
public class Prg5_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int v []={2,4,6,7,8,9,6,7,8,0};
		
		System.out.println("Introduce numero entero");
		int n=sc.nextInt();
		System.out.println("Los numeros mayores o iguales al numero introducido son :");
		for(int i=0;i<v.length;i++) {
			if(v[i]>=n) {
				System.out.print( v[i]+",");
			}	
		}
	}
}
