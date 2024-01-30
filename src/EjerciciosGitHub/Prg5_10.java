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
			int aux,v0=0,v1=0,v2=0,v3=0,v4=0,v5=0,v6=0,v7=0,v8=0,v9=0,v10=0;
			int v[]= {1,2,3,1,2,6,7,2,6,10};
				aux=v[v.length-1];
				System.out.println(aux);
			for(int i=v.length-1;i>0;i--) {
				v[i]=v[i-1];
			}
				v[0]=aux;
				
				for(int i=0;i<v.length;i++) {
				System.out.println(v[i]);	
				}
				
			for(int i=0;i<v.length;i++) {
				int temp=v[i];
			
				switch (temp) {
				case 0: 
					v0++;
					break;	
				case 1:
					v1++;
					break;
				case 2:
					v2++;
					break;
				case 3:
					v3++;
					break;
				case 4:
					v4++;
					break;
				case 5:
					v5++;
					break;
				case 6:
					v6++;
					break;
				case 7:
					v7++;
					break;
				case 8:
					v8++;
					break;
				case 9:
					v3++;
					break;
				case 10:
					v10++;
					break;
				
				default:
					break;
				}	
			}	
			System.out.println("frecuencia del 1 valor es :"+v0 +
					"\n frecuencia del 1 valor es :"+v1);
		}
	}


