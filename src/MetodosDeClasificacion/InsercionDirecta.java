package MetodosDeClasificacion;

public class InsercionDirecta {

	public static void main(String[] args) {
	
		int pos=5;
		int v[]= {2,5,7,4,9,8};
		 
//		insercionDirecta(v,5);
		insercionDirectaBinaria(v,5);
		
		mostrar(v);
	}
	
	public static void insercionDirecta (int v[], int pos) {
		/*------------------------------------------------------------
		Metodo de clasificacion: Insercion directa
		------------------------------------------------------------*/
		int aux,j,i;
		
		for(i=1;i<pos;i++) {//Siempre empieza en el segundo elemento
			
			aux=v[i];
			j=i;
			
			while(j>0&&aux<v[j-1]) {
				
				v[j]=v[j-1];
				j--;
			}
			
			v[j]=aux;
		}
	}
	public static void insercionDirectaBinaria(int v[],int pos) {
		/*------------------------------------------------------------
		Método de clasificación: Inserción Binaria
		------------------------------------------------------------*/
		
		int i,j,z,der,centro,x;
		
		for(i=0;i<pos;i++) {
			x=v[i];
			int izq=0;
			der=i;
			while(izq<der) {
				centro=(izq+der)/2;
				
				if(v[centro]<x) {
					
					izq=centro+1;
					
				}else { 
					
					der=centro;
				}
			
				for(j=1;i<der;j--) {
					
					v[j]=v[j-1];
					v[der]=x;
				}
			}
			
		}
	}
	
	public static void mostrar(int v[]) {
		/*------------------------------------------------------------
		Metodo de clasificacion: Mostrar
		------------------------------------------------------------*/
		
		for(int i = 0;i<v.length;i++) {
			System.out.println(v[i]);
		}
	}

}
