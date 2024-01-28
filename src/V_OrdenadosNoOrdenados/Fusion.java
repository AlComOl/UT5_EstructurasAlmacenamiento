package V_OrdenadosNoOrdenados;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:26/01/24
 * 
 * 	 2.6. Fusión de vectores ordenados.
 *			Consiste en obtener un vector también ordenado a partir de dos vectores ordenados.
 *			En la posición 0 del vector resultante se almacena el menor de los dos elementos que se encuentran en la posición 0.
 *			En general
 * 
 *****************************************************************************************************************************/

import java.util.*;

public class Fusion {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v1[]= {10,20,30,400};
		int v2[]= {100,200,300,350,500};
		int v3[]=new int[v1.length+v2.length];
		

//		hay que meter el numero de valores del vector , no el numero de posiciones
			concadenar(v1,v2,v3,4,5);
			
			mostrar(v3);
	}
	
	public static void concadenar(int v1[],int v2[], int v3[],int n1,int n2) {
		
		int pos_n1 = 0; /* Elemento a comparar de notas1 */
		int pos_n2 = 0; /* Elemento a comparar de notas2 */
		int pos_nf = 0; /* Elemento a comparar de notasf */
		
		while (pos_n1 < n1 && pos_n2 < n2) {
			if (v1[pos_n1] < v2[pos_n2]) { /* Menor en notas1 */
				
				v3[pos_nf] = v1[pos_n1];
				pos_n1++; /* Avanzando en el vector 1º */
			}else { /* Menor en notas2 */
				v3[pos_nf] = v2[pos_n2];
				pos_n2++; /* Avanzando en el vector 2º */
			}
			
			pos_nf++; /* Avanzando en el vector final */
		}
		
		while(pos_n1 <n1) { /* Trata el resto de notas1 */
			v3[pos_nf] = v1[pos_n1];
			pos_n1++;
			pos_nf++;
		}
		while(pos_n2 < n2) { /* Trata el resto de notas2 */
			v3[pos_nf] = v2[pos_n2];
			pos_n2++;
			pos_nf++;
		}
		
	

	
	}
	public static void mostrar(int v3[]) {
		
		for(int i=0;i<v3.length;i++) {
		 System.out.print(v3[i]+" ");	
		 
		}
	
	}

}
