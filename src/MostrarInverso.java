
public class MostrarInverso {
	
	

	public static void main(String[] args) {
		
		int v[]= {2,4,6,8,10,12,14,15,16,18,0,0,0,0,0,0};
		
		int a[]=new int[16];
	
		int n=10;//posicion elementos del vetor(ocupados)
		
//		mostrarInverso(v,n);
		mostrarInverso1(v,a,n);
		mostrar(a);
//		mostrar(v);
	}
	
	public static void mostrarInverso(int v[],int n) {
		/******************************************************************
		 * Funcion mostrarInverso muestra por pantalla el vector invertido 
		 * pasando el vector y la posicion
		 * @param n es la posicion
		 ******************************************************************/
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(v[i]+", ");
			
		
		}
		if(n>0) {
			System.out.println(v[0]);
			}
	}
	
	public static void mostrarInverso1(int v[],int a[],int n ) {
		/******************************************************************************
		 * Función mostrarInverso1 invierte el vector y lo mete dentro de otro 
		 * 
			Necita la funcion mostrar para ver el interior del vector.
		 * 
		 ********************************************************************************/
		int j=0;
		for(int i=n-1;i>=0;i--) {
			a[j]=v[i];
			 j++;
		}
	}
	
		public static void mostrar(int a[]) {
			
			for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ,");
				
			}
		}
}
