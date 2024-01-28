package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:17/01/24
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
		int n,posicion;
		
		System.out.println("Introduce 8 numeros (ordenados de forma creciente)");
		for(int i=0;i<8;i++) {
		 v[i]=sc.nextInt();
		 
		}
		
		System.out.println("introduce numero entero para ordenarlo dentro del vector");
		n=sc.nextInt();
		posicion=0;
		while(posicion<=14&&v[posicion]<n) {//encuentra el lugar del numero(posicion)siendo [j] el valor de la posicion
			
			posicion++;
		
		}
		if(n>v[7]) {//Si el numero es mayor que el valor de la posicion 7 inserta el valor del n en la posicion 8
			v[8]=n;
		
		}else {//Si hay que empujar el vector
			System.out.println(posicion);
			for(int i =13;i>=posicion;i--) {//i= posicion penultima del vector, 
				v[i+1]=v[i];
			}//cada vez que itera empuja el valor a i+1 dejando un hueco
			v[posicion]=n;//al llegar a la posicion metemos n en la posicion.
		}
		
		System.out.println("Ordenado");
		for(int i=0;i<14;i++) { //*Saca valores del vector
		System.out.println(v[i]);
		}
		}
	}

	



