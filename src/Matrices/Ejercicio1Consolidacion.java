package Matrices;
import java.util.*;
/*************************************************************************
 * @author acome
 * 
 * 
 * Ejercicio viernes 2/febrero/24 Apuntes 
 
 * ************************************************************************/


public class Ejercicio1Consolidacion {

	public static void main(String[] args) {

		int[][] m = new int [5] [3];//previamente creamos la matriz de 5x10
	
//		int m [][] ={ {15,2,3},{5,-6,7},{9,10,11},{13,14,30}};
		
		leerMatriz(m);
		
		mostrarMatriz(m);
		
		System.out.println("Numero Mayor "+ObtenerMayor(m)+" Numero Menor"+ObtenerMenor(m));
		

	
	

	}
	

//		}
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
			
			
			public static int ObtenerMayor(int m[] []) {
				/**************************************
				 * @author acome
				 * @param m[] matriz
				 * 
				 * Muestra el numero mayor de la matriz
				 ****************************************/
				
				int myr=m[0][0];
				
				for(int fila=0;fila<m.length;fila++) {
					
					for(int columna=0;columna<m[0].length;columna++) {
						
						if(m[fila][columna]>myr) {
							
							myr=m[fila][columna];
						}
					}
				}
				return myr;
			}
	
			
			public static int  ObtenerMenor(int m[] []) {
				/**************************************
				 * @author acome
				 * @param m[] matriz
				 * 
				 * Muestra el numero menor de la matriz
				 * 
				 * 
				 ****************************************/
				int mnr =m[0][0];
				
				
			
								
				for(int fila=0;fila<m.length;fila++) {
					
					for(int columna=0;columna<m[0].length;columna++) {
						
						if(m[fila][columna]<mnr) {
							
							mnr=m[fila][columna];
							
						}
					}
				}
				
				return mnr;
			}


}
