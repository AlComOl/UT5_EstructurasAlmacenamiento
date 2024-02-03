package Matrices;
import java.util.*;
public class Ejemplo {

	public static void main(String[] args) {

		int[][] m = new int [5] [10];
		leerMatriz1(m);

	}
	
//	leer matriz te pide los valore por teclado almacena
//	public static void leerMatriz(int [][]m) {
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<m.length;i++) {
//			System.out.println("Nueva fila");
//			for (int j = 0; j < m[i].length; j++) {
//			System.out.println("Introduce valores de la columna");
//			m[i] [j]=sc.nextInt();
//			
//		}
		public static void leerMatriz1(int [][]m) {
			Scanner sc=new Scanner(System.in);
			for(int fila=0;fila<m.length;fila++) {
				System.out.println("Nueva fila");
				for (int columna = 0; columna < m[fila].length; columna++) {
				System.out.println("Introduce valores de la columna");
				m[fila] [columna]=sc.nextInt();
				}
			}
		
	}
	
	
//	cargar matriz

}
