package EjerciciosGitHub;
import java.util.*;
/*********************************************
 * @author Álvaro Comenge
 * @Fecha 9/02/24
 *  Aceptar una matriz cuadrada de números enteros,
 *  de dimensión 3 (3 filas y 3 columnas) y calcula 
 *  la suma de los elementos de la diagonal principal()
 *  y de la secundaria(/). 
 * 
 * 
 *********************************************/
public class Prg5_17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int N=3;
		
		int m[][]=new int[N][N];
		
		cargarMatriz(m,sc);
		
		

		
		if(compruebaMartiz(m)==true) {
			
		System.out.println("Diagonal principal "+diagonalPrincipal(m));
		}
		
		if(compruebaMartiz(m)==true) {
			
			System.out.println("Diagonal secundiaria "+diagonalSecundaria(m));
			}
		
		mostrarMatriz(m);
		
		
		
		
		

	}
	
	public static int diagonalPrincipal(int m[][]) {
		/****************************************************
		 * @author acome
		 *  @param matriz
		 * @param vector con el resultado
		 * Metodo que suma la diagonal Principal con 1 solo bucle
		 *****************************************************/
		
			int suma=0;
				for(int i=0;i<m.length;i++) {
						suma+=m[i][i];	
				}
				
		return suma;
	}
	
	
	public static int diagonalPrincipal1(int m[][]) {
		/****************************************************
		 * @author acome
		 *  @param matriz
		 * @param vector con el resultado
		 * Metodo que suma la diagonal Principal con 2 bucles
		 *****************************************************/
		
			int suma=0;
			
				for(int i=0;i<m.length;i++) {
					for(int j=i;j<i+1;j++) {
						suma+=m[i][j];
				}
					}
				
			
		return suma;	
	}
	
	
	public static int   diagonalSecundaria(int m[][]) {
	/***********************************************************
	 * @author acome
	 * @param matriz
	 * @param vector con el resultado
	 * Metodo que suma la diagonal inversa con 1 solo bucle
	 * *********************************************************/
			
			int suma=0;
			
			for(int i=0;i<=m.length-1;i++) {//filas y columnas
				suma+=m[i][2-i];
			}	
		return suma;	
		}
	
	

	public static void cargarMatriz(int m[][],Scanner sc) {
	/******************************************************
	 * 	@author acome
	 * @param matriz
	 * @Sacaner 
	 * Metodo carga matriz
	 * ****************************************************/
		System.out.println("Introduce valor");
		for(int i=0;i<m.length;i++) {
			
			for(int j=0;j<m.length;j++) {
				System.out.println("Introduc columna"+i);
				m[i][j]=sc.nextInt();
			}
		}
	
	}
	
	public static boolean compruebaMartiz(int m[][]) {
	/**************************************************	
	 * @author acome
	 * @param matriz
	 * Metodo:comprueba si la matriz es cuadrada o regular
	 * 
	 **************************************************/
		
		boolean aceptada=false;
		if(m.length==m[0].length) {
			aceptada=true;
		}else {
			System.out.println("la matriz no es cuadrada");
		}
		return aceptada;
	}
	
	
	
	public static void mostrarMatriz(int m[][]) {
	/*******************************************
	 * @author acome
	 * @param matriz
	 * Metodo que muestra la matriz
	 *******************************************/
		
		for(int i=0;i<m.length;i++) {
			System.out.print(" [ ");
			for(int j=0;j<m.length;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println(" ] ");
		}
		
		
	}
}
	
	
