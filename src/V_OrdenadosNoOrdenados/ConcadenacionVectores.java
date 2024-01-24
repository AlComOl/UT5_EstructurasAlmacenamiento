package V_OrdenadosNoOrdenados;
import java.util.*;
public class ConcadenacionVectores {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int v1[]= {10,20,30,400};
		int v2[]= {100,200,300,40,500};
		int v3[]=new int[v1.length+v2.length];
//	
    		concadenar(v1,v2,v3);
			
			mostrar(v3);	
	}	
	
//	OJO!!!  hay que pasar el vector 3 por referencia para que se pueda mostrar
		public static void concadenar(int v1[],int v2[], int v3[]) {
			
			for(int i=0;i<v1.length;i++) {
				
				v3[i]=v1[i];
			}
			for(int i=v1.length;i<v3.length;i++) {
				
				v3[i]=v2[i-v1.length];
			}
		
		}
		
		public static void mostrar(int v3[]) {
			
			for(int i=0;i<v3.length;i++) {
			 System.out.println(v3[i]);
				
			}
		}
		
	}
