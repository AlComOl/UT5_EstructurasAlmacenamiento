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
			double media,moda,desviacion,a=0;
			int suma=0,cont=0,mediana;
			int aux;//crear un vector con 10 posiciones
			int v[]= {1,2,1,1,2,1,1,1,1,2};
			int f[]=new int [10];
			int m[]=new int[1];
				aux=v[v.length-1];
				
				 media=obtenerMedia(v,f);
				 moda=obtenerModa(v,f);
				 mediana=obtenerMediana(v);
				 desviacion=desviacionTipica(v,f,a);
//			
				 System.out.println("\n La media aritmetica de los elementos del vector es "+media+
						 "\n La moda de los elementos del del vector es :"+aux+
						 "\n La media del vector es  "+mediana +
						 "\n La desviacion del vector es "+ desviacion+
						 "\n  Hay "+moda+" repeticiones de moda" );
			
			
//			System.out.println("La media aritmetica de los elementos del vector es "+(media=(float)suma/10));
//			System.out.println("La moda de los elementos del del vector es :"+aux);
//			
//			ordenarBurbuja(v);
//			System.out.println("la Media Aritmetica del vector v es:"+obtenerMedia(v,f));	
//			System.out.println("la Moda del vector v es:"+obtenerModa(v,f));
//			System.out.println("la Media Aritmetica del vector v es:"+obtenerMediana(v));
//			System.out.println("la Media Aritmetica del vector v es:"+desviacionTipica(v,f,a));

		}
		
		
		
			public static void ordenarBurbuja(int v[]) {
				
			/***********************************************************
			 * 
			 * Álvaro Comenge
			 * 
			 * Metodo : Ordenacion vector (Burbuja)
			 * 
			 ***********************************************************/
				int aux=0;
				for(int i=0; i<v.length-1;i++) {
					for(int j=v.length-1;j>i;j--) {
						if(v[j-1]>v[j]) {
							aux=v[j-1];
							v[j-1]=v[j];
							v[j]=aux;
							
						}
					}
				}
			}	
			
			
			
			
			public static double obtenerMedia(int v[], int f[]) {
				/*******************************************************
				 * Autor: Álvaro Comenge
				 * 
				 * Método:Media aritmética: cociente entre la suma de 
				 * valores por su frecuencia y la suma de frecuencias. 
				 *
				 * 
				 * Atención el array debe estar orenado o previamente
				 * llamar al método ordenar.
				 * 
				 ******************************************************/
				
				/*Obtener en el vector f un contador de frecuencia de cada valor*/
				
				
				ordenarBurbuja(v);
				int suma=0;
				for( int i=0;i<v.length;i++) {
					
					int valor=v[i];//metiendo el valor de v[i] en valor
					
							f[valor]++;//incremento la posicion de valor en el vector f[] 
											
				}
				
				for( int i=0;i<v.length;i++) {
					
					f[i]=f[i]*i;// Multiplicar cada valor por su frecuencia
					
				}
				
				/*suma producto de las frecuencias */
				for(int i=0;i<f.length;i++) {
					suma+=f[i];
				}
				
				
				
				return suma/10;
				
			}
			
			
			public static int obtenerModa(int f[], int m[]) {
			/**********************************************	
			 * Álvaro Comenge
			 * 
			 * Metodo: Moda: valor de máxima frecuencia (puede haber más de una moda).
			 * 
			 * Meto el valor del contador en el vetor para despues en el main devolverlo
			 * hay que pedir si se desea la cantidad de mosdas que hay
			 * 
			 ***********************************************/
				int aux=0, cont=0;
				int numModas = 0;
			
				for(int i=0;i<f.length;i++) {
					if(f[i]>aux) {
						aux=f[i];
						
					}
					
				}
				// Luego buscamos las modas y las almacenamos en el vector m[]
			    for (int i = 0; i < f.length; i++) {
			        if (f[i] == aux) {
			            m[numModas] = i;
			            numModas++;
			        }
			
			}
				return aux;
			}
			
		
			public static int  obtenerMediana(int v[]) {
				/*******************************************************
				 * Autor: Álvaro Comenge
				 * 
				 * Método Mediana: valor que tiene igual número de valores 
				 * superiores que inferiores.
				 * 
				 * Atención el array debe estar orenado o previamente
				 * llamar al método ordenar.
				 * 
				 ******************************************************/
				int res=0;
				if(v.length%2!=0) {
					
					res=v.length/2;
					
				}else {
					int sum=v[v.length/2]+v[(v.length/2)-1];
					res=sum/2;
				}
				return res;
			}
			
			
			
			public static double desviacionTipica(int v[],int f[],double a) {
				/*******************************************************
				 * Autor: Álvaro Comenge
				 * 
				 * Método:Desviación típica: variación del conjunto de 
				 * valores respecto al valor medio..
				 * 
				 * Atención el array debe estar orenado o previamente
				 * llamar al método ordenar.
				 * 
				 ******************************************************/
				/*llamo a media Aritmetica y la meto en media*/
				double media,suma = 0;
				media=obtenerMedia(v,f);
				/*Resto la media a cada valor del vector*/
				
				for(int i=0;i<v.length;i++) {
					suma+=Math.pow(v[i]-media, 2);
				}
				a=suma;
				
				
				
				return a;
			}
			
			
			
		
	}
	

