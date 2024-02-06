package Matrices;
import java.util.*;

public class EjecicioConsolidacion4Triangulo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int matriz[][]=new int [5][5];
		
		
		System.out.println("************************************");
		MatrizTriangular(matriz);
		mostrarMatriz(matriz);
		System.out.println("************************************");
		mostrarMatrizJulia(matriz);
	
		
		
		
		
	}

	

	
	public static void MatrizTriangular(int matriz [][]) {
		/*************************************************
		 * @author acome    
		 * ***********************************************/
			
			for(int i=0;i<matriz.length;i++) {//maneja las filas
				
				for(int j=0;j<i+1;j++) {//maneja las columnas
					matriz[i][j]=i;
				
				}
				
			}
		}
	
	public static void mostrarMatrizJulia(int[][]triangular){
		/***********************************************
		 * @julia
		 * 
		 * Pasa la matriz como tamaño
		 **********************************************/
	    //recorremos y mostramos la matriz triangular
	      System.out.println("La matriz triangular es esta: ");
	        
	        for(int i=0;i<triangular.length;i++){
	        
	            for(int j=0;j<triangular[i].length;j++){
	            
	                System.out.print(triangular[i][j]+" ");
	                
	            }
	            System.out.println();
	        }
	    
	    }
	
	
	public static void mostrarMatriz(int matriz[][]) {
		for(int i=0;i<matriz.length;i++) {//maneja las filas
			System.out.print(" [ ");
			for(int j=0;j<matriz[i].length;j++) {//maneja columnas
				
				System.out.print(matriz[i][j]);
			}
			System.out.println(" ] ");
		
		}
}
}