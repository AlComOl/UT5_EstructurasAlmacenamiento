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
		int rdo[]=new int[1];
		int m[][]=new int[N][N];
		
		cargarMatriz(m,sc);
		mostrarMatriz(m);
		
//		diagonalPrincipal(m,rdo);
		
		diagonalSecundaria(m,rdo);
		
		for(int i=0;i<rdo.length;i++) {
			System.out.println(rdo[i]);
		}
		
		
		

	}
	
	
	public static boolean diagonalPrincipal(int m[][],int rdo[]) {
		
		boolean aceptada=false;
		int suma=0;
		if(m.length==m[0].length) {
			aceptada=true;
			for(int i=0;i<m.length;i++) {
				for(int j=i;j<i+1;j++) {
					suma+=m[i][j];
					
				}
				
			}
			rdo[0]=suma;
		}else {
			System.out.println("la matriz no es cuadrada");
		}
		return aceptada;	
	}
	
	
public static boolean diagonalSecundaria(int m[][],int rdo[]) {
		
		boolean aceptada=false;
		int suma=0;
		if(m.length==m[0].length) {
			aceptada=true;
			for(int i=m.length;i>m.length-1;i--) {
				for(int j=i;j<i-1;j--) {
					suma+=m[i][j];
					
				}
				
			}
			rdo[0]=suma;
		}else {
			System.out.println("la matriz no es cuadrada");
		}
		return aceptada;	
	}
	
	

	public static void cargarMatriz(int m[][],Scanner sc) {
		System.out.println("Introduce valor");
		for(int i=0;i<m.length;i++) {
			
			for(int j=0;j<m.length;j++) {
				System.out.println("Introduc columna"+i);
				m[i][j]=sc.nextInt();
			}
		}
	
	}
	
	
	
	public static void mostrarMatriz(int m[][]) {
		
		for(int i=0;i<m.length;i++) {
			System.out.print(" [ ");
			for(int j=0;j<m.length;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println(" ] ");
		}
		
		
	}
}
