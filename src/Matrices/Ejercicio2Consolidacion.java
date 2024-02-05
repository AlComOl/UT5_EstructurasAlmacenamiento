package Matrices;

import java.util.Scanner;

public class Ejercicio2Consolidacion {

	public static void main(String[] args) {

//		int m[][]=new int [4][4];
		
		int m [][] ={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		
		Scanner sc=new Scanner(System.in);
		
//		for(int fila=0;fila<m.length;fila++) {
//			
//			System.out.println("Nueva fila");
//			
//			for (int columna = 0; columna < m[fila].length; columna++) {
//				
//			System.out.println("Introduce valores de la columna");
//			
//				m[fila] [columna]=sc.nextInt();
//			}
//			
//		}
		System.out.println("*****************************************");
			System.out.println(intercambiaFilas(m,4,4,0,1));
		System.out.println("******************************************");
			mostrarMatriz(m);
		System.out.println("******************************************");
			muestraEsquinas(m,4,4);
		System.out.println("******************************************");
		muestraEsquinas1(m,4,4);
		
		
	}
	
	
		public static boolean intercambiaFilas(int matrix[][],int m,int n,int f1, int f2) {
			/*****************************************************************************
			 * @author acome
			 * 
			 * lñ
			 * 
			 * 
			 *****************************************************************************/
			int aux=0;
			boolean rdo=true;
			if(f1<m&&f2<m) {
			
				for(int i=0;i<n;i++) {
			
					aux=matrix[f1][i];
				
					matrix[f1][i]=matrix[f2][i];
				
					matrix[f2][i]=aux;
					
				}
				
			}else {
				rdo=false;
			}
			
		return rdo;
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
		       System.out.println("]  ");
		    }
		}
		
		public static void muestraEsquinas(int matrix[][], int m,int n) {
		/******************************************************************
		 * @author acome
		 * 
		 * Muestra los numeros de las esquinas los demas pone un Arterisco
		 * 
		 ******************************************************************/
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 && j==0||i==3 && j==n-1  ) {  /*	No se si es la manera que hemos visto en la piarra	*/
						System.out.print(matrix[i][j]+"");
						
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
			
		}	
		
		
		public static void muestraEsquinas1(int matrix[][], int m,int n) {
			/******************************************************************
			 * @author acome
			 * 
			 * Muestra los numeros de las esquinas los demas pone un Arterisco
			 * 
			 ******************************************************************/
				
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) {
						if(i==0 && j==0||i==0 && j==n-1 || i==m-1 && j==0 || i==m-1 && j==n-1){
							System.out.print(matrix[i][j]+"");
							
						}else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				
				
			}	
}