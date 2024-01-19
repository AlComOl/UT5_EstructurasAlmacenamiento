package EjerciciosGitHub;
import java.util.*;
	/**************************************************************************************************************************
	 * Autor : Álvaro Comenge
	 * 
	 * Fecha 19-01-24
	 * 
	 * Programa que lea un vector numérico de 10 elementos y rote todas sus componentes un lugar hacia el principio del vector 
	 * desplazando la última componente al último lugar.
	  
	 *******************************************************************************************************************************/
	public class Prg5_9 {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			final int T=10;
			int primero;
			int v[]=new int[T];
			
			for(int i=0;i<v.length;i++) {//introducir valore en el  vector
				v[i]=sc.nextInt();
			}
			primero=v[0];//el numero que machaco lo meto en primero
			
			for(int i=1;i<10;i++) {//desplazar vector hasta el principio
				v[i-1]=v[i];
			}
			v[9]=primero;//pongo primero en el vector que queda libre
			System.out.println("**************************");
			for(int i=0;i<v.length;i++) {//sacar valores del vector
				System.out.print(v[i]+",");
			}
			
		sc.close();	
	}

}
