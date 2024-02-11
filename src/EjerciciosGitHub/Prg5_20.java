package EjerciciosGitHub;
import java.util.*;
/**************************************************
 * @author Álvaro Comenge
 * 
 * fecha 11/02/24
 * 
 * Aceptar una matriz de números enteros 3 x 7, mostrando 
 * por pantalla la fila y la columna del elemento con 
 * mayor valor.
 * 
 * **************************************************/
public class Prg5_20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v[][]=new int[3][7];
		
		cargarMatriz(v,sc);
		mostrarMatriz(v);
		System.out.println(mayor(v));
		
	}

	public static int  mayor(int v[][]) {
	/*****************************************
	 * @author @author acome
	 * @param v[][] matriz regular
	 * 
	 * Encuentra el valor mayor de dentro del array
	 *****************************************/
		int max=v[0][0];
		for(int i=0;i<v.length;i++) {
			for(int j=0;j<v[0].length;j++) {
				if(v[i][j]>max) {
				max=v[i][j];
				}
				
			}
		}
		return max;
	}
	public static void cargarMatriz(int v[][],Scanner sc) {
	/****************************************************
	 * @author acome
	 * @param matriz iregular
	 * @param Scanner
	 * 
	 * Carga los velores de una matriz iregular
	 * 
	 * 
	 ***************************************************/
		int i,j;
		System.out.println("Introduce valores");
		for (i=0;i<v.length;i++) {
			System.out.println("Introduce fila "+i);
			for (j=0;j<v[0].length;j++) {
				v[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void mostrarMatriz(int v[][]) {
	/*********************************************
	 * @author acome
	 * @matriz iregular
	 * 
	 * Carga los valores de una matriz irregular
	 * 
	 * 
	 * 	
	 *********************************************/
		for(int i=0; i<v.length;i++) {
			System.out.print("[ ");
			for(int j=0;j<v[0].length;j++) {//int j=0;j<v[0].length;i++
				System.out.print(v[i][j]);
			}
			System.out.println(" ]");
		}
	}
}
