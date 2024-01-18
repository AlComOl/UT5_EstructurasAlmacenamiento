package EjerciciosGitHub;
import java.util.*;
/**************************************************************************************************************************
 * Autor : Álvaro Comenge
 * 
 * Fecha 16-01-24
 * 
 * 	Escribe un programa que lee secuencias de 50 números almacenándolos en un vector Numeros y los imprime en orden inverso.
  
 *******************************************************************************************************************************/
public class Prg5_4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	final int TAMAÑO=5;
	int inicio=0;
	String Numeros[]=new String[TAMAÑO];
	
	
	System.out.println("Introduce secuencias de numeros");
	
	for(int i=0;i<Numeros.length;i++) {
		
		Numeros[i]=sc.next();
	
	}
	//los índices de un array comienzan en 0, por lo que en este caso, el array Numeros tendrá índices desde 0 hasta 49.
	//lo que suma un total de 50 espacios para almacenar valores.
	
	System.out.println("Posiciones del Vector Imvertido");
	
	for(int i=TAMAÑO-1;i>=inicio;i--) {
	
		System.out.print(Numeros[i]+" , ");	
	}
	
	sc.close();
	}
}