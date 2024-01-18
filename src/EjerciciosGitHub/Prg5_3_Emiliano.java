package EjerciciosGitHub;

import java.util.Scanner;

public class Prg5_3_Emiliano {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v[]=new int[15];
		int ndados=8,posicion=0,nordenar;
		//n = posiciones dadas. x = numero a ordenar
		
		
		System.out.println("Introduce 8 numeros (ordenados de forma creciente)");
		
		for(int i=0;i<8;i++) {
		 v[i]=sc.nextInt();
		 
		}
		
		System.out.println("introduce numero entero para ordenarlo dentro del vector");
		 nordenar=sc.nextInt();
		
		while(posicion<ndados&&v[posicion]<nordenar) {//encuentra el lugar del numero(posicion)
//		ndados menor que la posicion , valor posicion menor que nordenar:	
			posicion++;
		
		}
			for(int i=ndados;i>posicion;i--) {//ndados menor que la posicion 
				v[i]=v[i-1];
//metemos i-1 en i que es 1 posicion mas, de manera que empujamos todos los valores 1 posicion
			}
			v[posicion]=nordenar;//metemos el numero

		System.out.println("Ordenado");
		for(int i=0;i<14;i++) { //*Saca valores del vector
		System.out.println(v[i]);
		}
	}
}

	





