package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:20/01/24
 * 
 *  Escribe un programa que lee una secuencia de 50 números cargándolos en un vector
 *  y a continuación encuentra la posición que ocupa el primer número negativo en 
 *  caso de existir. Si no hay números negativos se escribirá un mensaje indicándolo.
 * 
 * 
 * 
 * 
 *****************************************************************************************************************************/
public class Prg5_14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int T=10;
		int pos = 0;
		int v[]=new int[T];
		boolean negativo=false;
		
		for(int i=0;i<v.length;i++) {//cargar vector
			
			v[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<v.length;i++) {//recorro y encuentro el negativo en la posicion del incremento
			
			if(v[i]<0) {
				negativo=true;
				if(negativo) 
					pos=i;
			}
		}
		if(negativo==true) {
			 System.out.println("El numero negativo esta en la posicion: "+pos+ " del vector");
		}else {
			System.out.println("No hay numeros negativos");
		}
		sc.close();
	}
}
