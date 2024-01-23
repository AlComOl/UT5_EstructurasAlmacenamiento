package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:21/01/24
 * 
 * 	 Escribe un programa que lee una secuencia de calificaciones(números enteros entre 0 y 10).
 *   La secuencia termina cuando se introduce un número menor que 0 o mayor que 10. Se obtiene e 
 *   imprime una lista de frecuencias (número de repeticiones) de cada una de las notas.
 * 
 *****************************************************************************************************************************/
public class Prg5_7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sec[]= {4,2,4,4,4,5,6,7,8,9};
		int contador[]=new int[10];
		int n;
		
//					cada vez que encuentro un numero incremento el "incremento" cada posicion del contador es un vector
					for(int i=0;i<sec.length;i++) {
				
							contador[sec[i]]++;
						
					}
					
						for(int i=0;i<contador.length;i++) {
					
						System.out.println("Valores por cada posicion valor"+ i +" "+ contador[i]);
				
						}
				
					
		
	}
	
}