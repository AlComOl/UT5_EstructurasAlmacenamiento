package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:24/01/24
 * 
 * 	 Escribe un programa que lee una secuencia de calificaciones(números enteros entre 0 y 10).
 *   La secuencia termina cuando se introduce un número menor que 0 o mayor que 10. Se obtiene e 
 *   imprime una lista de frecuencias (número de repeticiones) de cada una de las notas.
 * 
 *****************************************************************************************************************************/
public class Prg5_7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int sec[]=new int [11];
		int n;
		
		System.out.println("Introduce numero");
		 n=sc.nextInt();
		 
		while(n>=0&&n<=10) {//mientras el numero este entre 0 y 10 estara dentro del bucle
			
			sec[n]++;//incrementa en 1 la posicion n que es a su vez el numero que introducimos
			
			System.out.println("Introduce numero");//pide numero de nuevo
			n=sc.nextInt();
		
		}
		
		for(int i=0;i<sec.length;i++) {//salida , frecuencia de números introducidos
			
			System.out.println("Has introducido el valor "+ i +" : "+sec[i]+" veces");
	
			}						
	}
	
}