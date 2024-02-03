package EjerciciosGitHub;
import java.util.*;

/*	********************************************************************************************
 * 	@author Álvaro Comenge
 * 
 * 	Fecha 3/02/24
 * 
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
			int mediana;
			int v[]= {5,5,5,5,3,6,3,8,9,10};
			int f[]=new int [11];
//			
			
				
				 media=obtenerMedia(v);
				 moda=obtenerModa(v,f);
				 mediana=obtenerMediana(v);
				 desviacion=desviacionTipica(v,a);
				 
				 System.out.println("\n La media aritmetica de los elementos del vector es "+media+
						 "\n La moda de los elementos del del vector es :"+moda+
						 "\n La media del vector es  "+mediana +
						 "\n La desviacion del vector es "+ desviacion);
				 mostrarRepModa(f);
				 sc.close();
		}
		
		
		
			public static void ordenarBurbuja(int v[]) {
				
			/***********************************************************
			 * 
			 * @author Álvaro Comenge
			 * @param v[] vector de elementos 
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
			
			
			
			
			public static double obtenerMedia(int v[]) {
				/*******************************************************
				 * @author Álvaro Comenge
				 * 
				 * Método:Media aritmética: cociente entre la suma de 
				 * valores por su frecuencia y la suma de frecuencias. 
				 * 
				 * @param v[] vector de elementos puede estar ordenado y desordenado
				 * dentro tenemos la llamada a un metodo de ordenacion 
				 * 
				 ******************************************************/
				
				int suma=0;
				for(int i=0;i<v.length;i++) {
					
					suma=suma+v[i];
					
				}
				
				return suma/v.length;
				
			}
			

			public static int obtenerModa(int v[],int f []) {
			/**********************************************	
			 * @author acome
			 * 
			 * Metodo: Moda: valor de máxima frecuencia (puede haber más de una moda).
			 * 
			 * @param v[] vector de elementos 
			 * @param f[] vector de frecuencias  
			 * 
			 ***********************************************/
			int valor,aux=0,moda=0,max=0;
		
			ordenarBurbuja(v);
			
			for(int i=0;i<v.length;i++) {
				valor=v[i];//pos de i dentro de valor
				
				f[valor]++;// cada vez que sale un valor de v lo incremento en f
			System.out.println();
			}
			for (int i=0;i<f.length;i++) {
				if(f[i]>max) {
					moda=i;
				}
			}
			
			return moda;	
			}
			
			
			public static void mostrarRepModa(int f[]) {
				/********************************************
				 * @Alvaro
				 * 
				 * @param f para mostrar si hay mas modas  
				 * 
				 * 
				 * ******************************************/
				int i=0;
				System.out.println(" \n  Las frecuencias de cada elementos son");
				for( i=0;i<f.length;i++) {
				
				System.out.println("\n   El numero "+i+" se repite "+f[i]);
				
						
				
					
					}
			}
			
			public static int  obtenerMediana(int v[]) {
				/*******************************************************
				 * @author Álvaro Comenge
				 * 
				 * Método Mediana: valor que tiene igual número de valores 
				 * superiores que inferiores.
				 * 
				 * @param v el array de elementos 
				 * 
				 * El array debe estar ordenado llamamos al metodo ordenarBurbuja 
				 * para ordenar el array.
				 * 
				 ******************************************************/
				ordenarBurbuja(v);
				
				int res=0;
				if(v.length%2!=0) {
					
					res=v.length/2;
					
				}else {
					int sum=v[v.length/2]+v[(v.length/2)+1];
					res=sum/2;
				}
				return res;
			}
			
			
			
			public static double desviacionTipica(int v[],double a) {
				/*******************************************************
				 * @author Álvaro Comenge
				 * 
				 * Método:Desviación típica: variación del conjunto de 
				 * valores respecto al valor medio..
				 * 
				 * Atención el array debe estar orenado o previamente
				 * llamar al método ordenar.
				 * 
				 ******************************************************/
				
				double suma=0;
				/*Resto la media a cada valor del vector*/
				
				for(int i=0;i<v.length;i++) {
//					 se encarga de calcular el cuadrado de la diferencia entre el valor de v[i] 
//					 y la media  de todo el conjunto de datos obtenerMedia(v)
					suma+=Math.pow(v[i]-obtenerMedia(v), 2);
				}
				
				return suma;
			}	
	}
	

