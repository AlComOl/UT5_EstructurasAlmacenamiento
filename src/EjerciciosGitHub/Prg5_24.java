package EjerciciosGitHub;

import java.util.Scanner;

public class Prg5_24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int N=5;
		
		int m1[][]=new int [N][N];
		int m2[][]=new int [N][N];
		int suma[][]=new int [N][N];
		
		leerMatriz();
		
		
		
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
			
			
			public static boolean multiplicaMatriz(int [][]m1,int [][]m2,int [][]mult) {
				/******************************************************************
				 * @author acome
				 * 
				 * @param m1 matrices para sumar
				 * 
				 * @multiplica matriz con los resultado de sumar las 2
				 * 
				 * ****************************************************************/
					boolean ok=false;
					
					if(m1.length==m2.length&&m1[0].length==m2[0].length) {
						ok=true;
						
						for(int i=0;i<m1.length;i++) {
							for(int j=0;i<m1.length;j++) {
								for(int k=0;k<mult.length;k++) {
									mult[i][j]=m1[i][j]+m2[i][k];
								}
								
							}
						}
					}else {
						
						System.out.println("El tamaño de las matrices es diferente");
					}
					
				
					return ok;
					
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