package EjerciciosGitHub;
import java.util.*;
	/**************************************************************************************************************************
	 * Autor : Álvaro Comenge
	 * 
	 * Fecha 16-01-24
	 * 
	 * 	Programa que lea un vector numérico de 10 elementos y rote todas sus componentes un lugar hacia el final del vector 
	 *  desplazando la última componente al primer lugar.
	  
	 *******************************************************************************************************************************/
	public class Prg5_8 {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			final int T=10;
			int n,primero=0;
			
			int v[]=new int[T];
	
			for(int i=0;i<v.length;i++) {//cargar vector
				n=sc.nextInt();
				v[i]=n;
			}
			  
				primero=v[T-1];//guardar el ultimo numero para pasarlo al primero
			
			for(int i=v.length-1;i>0;i--) {//empujo el vector
				v[i]=v[i-1];
			}
			 	v[0]=primero;//meto el primero anteriormente guardado en la posicion 0 
			 
			for(int i=0;i<v.length;i++) {//saco valores del vector,
				
			System.out.println(v[i]);
			}
			sc.close();
		}
	}