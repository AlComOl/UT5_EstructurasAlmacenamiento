package EjerciciosGitHub;
import java.util.*;
/*	********************************************************************************************
 * 	Autor:Álvaro Comenge .
 * Fecha 30/01/24
 *  Sobre el mismo programa anterior hacer que imprima los siguientes datos estadísticos: media aritmética, moda, mediana y desviación típica.
	Media aritmética: cociente entre la suma de valores por su frecuencia y la suma de frecuencias.
	Moda: valor de máxima frecuencia (puede haber más de una moda).
	Mediana: valor que tiene igual número de valores superiores que inferiores.
	Desviación típica: variación del conjunto de valores respecto al valor medio.
	****************************************************************************************/
	public class Prg5_10 {
		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			float media = 0;
			int suma=0;
			int aux;//crear un vector con 10 posiciones
			int v[]= {1,1,1,1,1,1,1,1,1,2};
			int f[]=new int [10];
				aux=v[v.length-1];
				System.out.println(aux);
			for(int i=v.length-1;i>0;i--) {
				v[i]=v[i-1];
			}
				v[0]=aux;
				
				System.out.println("***************Ejercicio Anterior*******************");
				
				for(int i=0;i<v.length;i++) {
				System.out.println(v[i]);	
				}
//				******************************************************************/
			for(int i=0;i<v.length;i++) {
				int temp=v[i];
			
			}
			
			System.out.println("***************VECTOR CON FRECUENCIAS***************");
	
			for( int i=0;i<v.length;i++) {
				
				int valor=v[i];
				
						f[valor]++;
						
								
						
			}
			System.out.println("***************VECTOR CON FRECUENCIAS***************");	
			for( int i=0;i<v.length;i++) {
				f[i]=f[i]*i;
				System.out.println(f[i]);
			}
			
			for(int i=0;i<f.length;i++) {
				suma+=f[i];
			}
//		voy por calcular la moda
			System.out.println("La media aritmetica de los elementos del vector es "+(media=(float)suma/10));
//			System.out.println("La moda de los elementos del del vector es :");
		}
	
	}

