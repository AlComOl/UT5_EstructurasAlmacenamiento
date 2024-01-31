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
			int aux;//crear un vector con 10 posiciones
			int v[]= {1,1,1,1,1,1,1,2,2,2};
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
				
			for(int i=0;i<v.length;i++) {
				int temp=v[i];
			
				switch (temp) {
				case 0: 
					f[i++]=temp;
					
					break;	
				case 1:
					f[i]=temp;
					
					break;
				case 2:
					f[i]=temp;
					
					break;
				case 3:
					f[i]=temp;
				
					break;
				case 4:
					f[i]=temp;
				
					break;
				case 5:
					f[i]=temp;
				
					break;
				case 6:
					f[i]=temp;
					
					break;
				case 7:
					f[i]=temp;
				
					break;
				case 8:
					f[i]=temp;
				
					break;
				case 9:
					f[i]=temp;
				
					break;
				case 10:
					f[i]=temp;
				
					break;
				
				default:
					break;
				}	
			}
			
			System.out.println("***************VECTOR CON FRECUENCIAS***************");
		
			
			
			
		}
	}


