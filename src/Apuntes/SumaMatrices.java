package Apuntes;
import java.util.*;
/********************************************************
 * @author Álvaro Comenge
 * 
 * Fecha:7/2/24
 * 
 * Suma dos matrices de la misma dimensión. C(i, j) = A(i, j) + B(i, j)
 * 
 * 
 * *******************************************************/

public class SumaMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int N=5;
		
		int m1[][]=new int [N][N];
		int m2[][]=new int [N][N];
		int suma[][]=new int [N][N];
		

		leerMatriz(m1);
		leerMatriz(m2);
		
		sumaMatriz(m1,m2,suma);
		mostrarMatriz(suma);
		
	}
	
	
	
				public static void leerMatriz(int [][]m) {
				/**************************************
				 * @author acome
				 * @param m[] matriz
				 * 
				 * Introduce valores a la matriz que 
				 * pasamos por parametro
				 * 
				 ****************************************/
					
					Scanner sc=new Scanner(System.in);
					int columna=0;
					
					for(int fila=0;fila<m.length;fila++) {
						
						System.out.println("Nueva fila "+ fila);
						
						for ( columna = 0; columna < m[fila].length; columna++) {
							
						System.out.println("Introduce valores de la columna "+ columna);
						
							m[fila] [columna]=sc.nextInt();
						}
					}
					
				}
				
				public static void sumaMatriz(int [][]m1,int [][]m2,int [][]suma) {
				/******************************************************************
				 * @author acome
				 * 
				 * @param m1 matrices para sumar
				 * 
				 * @suma matriz con los resultado de sumar las 2
				 * 
				 * ****************************************************************/
					boolean ok=false;
					
					if(m1.length==m2.length&&m1[0].length==m2[0].length) {
						ok=true;
					}else {
						
						System.out.println("El tamaño de las matrices es diferente");
					}
					
					if(ok) {
						
						for(int i=0;i<m1.length;i++) {
							for(int j=0;j<m1.length;j++) {
								suma[i][j]=m1[i][j]+m2[i][j];
							}
						}
					}
					
				}
	
				
				public static void mostrarMatriz(int m[] []) {
					/**************************************
					 * @author acome
					 * @param m[] matriz
					 * 
					 * Muestra valores a la matriz que 
					 * pasamos por parametro
					 ****************************************/
				   
				    for (int fila = 0; fila < m.length; fila++) {
				    	 System.out.print(" [");
				       for(int columna=0;columna<m[fila].length;columna++) {
				    	  System.out.print(m[fila][columna]+" ");
				    	  
				       }
				       System.out.print("]  \n");
				    }
				}

}
