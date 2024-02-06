package Matrices;
import java.util.*;

/***********************************************************************
 * 	@author acome
 * 
 *  Escriba un programa que permita calcular el número de elementos positivos,
 *	negativos y ceros de una matriz 3 x 6.
 *
 * **********************************************************************/
public class Ejercicio4Consolidacion {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m[] []= {{1,2,3,4},{-1,-2,-3,-4},{10,20,30,40},{-20,-30,-40,-50}};
		int[] positivos=new int [4];
		int[] negativos=new int [4];
		
		numerosPositivosYNegativos(m,positivos,negativos);
		System.out.println("\n ************Positivos********************\n");
		obtenerArray(positivos);
		System.out.println("\n ************Negativos********************\n");
		obtenerArray(negativos);
		
	}
	
	
	
	public static void numerosPositivosYNegativos(int m[][],int positivos[], int negativos[]) {
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(m[i][j]>=0) {
					positivos[j]=m[i][j];
				}else if(m[i][j]<0){
					negativos[j]=m[i][j];
				}
			}
		}
		
	}
	
	public static void obtenerArray(int positivos[]) {
		/**************************************
		 * @author acome
		 * @param array con em mismo tamaño 
		 * que las columnas de la matriz
		 * 
		 * Muestra valores del array
		 ****************************************/
	   
	    for (int i = 0; i < positivos.length; i++) {
	    	 
	    	System.out.print(positivos[i]+" ,");
	    	  
	       }
	      
	    }
}
