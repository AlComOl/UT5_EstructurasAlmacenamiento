package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:
 * 
 *  Se dispone de un vector de enteros de 15 elementos, de los cuales solo están con datos las 8 primeras posiciones. 
 *  Los datos almacenados en el vector están ordenados de forma creciente. Se pide solicitar un número entero al usuario y 
 *  colocarlo en el lugar que le corresponda del vector, para que se mantenga el orden y sin quitar ningún elemento anterior.
 * 
 * 
 * 
 * 
 *****************************************************************************************************************************/
public class Prg5_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		int v[]=new int[15];
		System.out.println("introduce un valor");
		for(int i=0;i<8;i++) {
		 v[i]=sc.nextInt();
		 
		}
		
		for(int i=0;i<15;i++) {
			System.out.println(v[i]);
		}
	}

}
