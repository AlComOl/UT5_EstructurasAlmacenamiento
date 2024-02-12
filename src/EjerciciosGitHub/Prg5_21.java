package EjerciciosGitHub;
import java.util.*;
/**************************************************
 * @author Álvaro Comenge
 * 
 * fecha 11/02/24
 * 
 * Aceptar una matriz de números enteros 3 x 3,
 *  permutando la fila 0 por la 1.
 * 
 * **************************************************/
public class Prg5_21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v[][]=new int[3][3];
		
		cargarMatriz(v,sc);
		permuta1x3(v);
		mostrarMatriz(v);
		
	}

	public static void permuta1x3(int v[][]) {
	/*****************************************
	 * @author @author acome
	 * @param v[][] matriz regular
	 * 
	 * permuta fila 1 por la 3 
	 *****************************************/
		int temp[]=v[0];
		
		v[0]=v[1];
		v[1]=temp;
		
		}
		
	
	public static void cargarMatriz(int v[][],Scanner sc) {
		System.out.println("Introduce valores");
		for (int i=0;i<v.length;i++) {
			System.out.println("Introduce fila "+i);
			for (int j=0;j<v.length;j++) {
				v[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void mostrarMatriz(int v[][]) {
		
		for(int i=0; i<v.length;i++) {
			System.out.print("[ ");
			for(int j=0;j<v.length;j++) {
				System.out.print(v[i][j]);
			}
			System.out.println(" ]");
		}
	}
	
	
}
