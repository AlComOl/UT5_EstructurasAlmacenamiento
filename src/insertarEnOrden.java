import java.util.Scanner;

public class insertarEnOrden {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v[]= {2,4,6,8,10,0,0,0,0,0,0,0};
		int n=5;//elementos del vector
		int n1[]= {5};
		
		System.out.println("Introduce el elemento para insertarlo en orden");
			int dato=sc.nextInt();
			
//		insertarEnOrden(v,n,dato);
//		mostrar(v);
			
		n=insertarEnOrden1(v,n1,dato);
		mostrar(v,n);
		
	}
	
	public static void  insertarEnOrden(int v[],int n, int dato) {
		
		/*****************************************************************************
		 * Metodo VOID insertarEnOrden:insertarOrdenado inserta el elemento en el vector en su
		 *         lugar en un vector ordenado
		 *      	@param n son los elementos del vector
		 *      	@param dato es el elemento a insertar
		 * 
		 *****************************************************************************/
			
		
		int i;
		for(i=0;i<n&&v[i]<dato;i++);//buscamos 
			for(int j=n;j>i;j--)//mover 
				v[j]=v[j-1];
		v[i]=dato;
		n++;
		

		
	}
	
	
	public static int  insertarEnOrden1(int v[],int n[], int dato) {
			
			/*****************************************************************************
			 * Metodo INT insertarEnOrden1:insertarOrdenado inserta el elemento en el vector en su
			 *         lugar en un vector ordenado
			 *      	@param n[0] son los elementos del vector *Lo pasamos como vector
			 *      	@param dato es el elemento a insertar
			 * 
			 *****************************************************************************/
				
			
			int i;
			for(i=0;i<n[0]&&v[i]<dato;i++);//buscamos 
				for(int j=n[0];j>i;j--)//mover 
					v[j]=v[j-1];
			v[i]=dato;
			
			
	
			return n[0];
		}
	
		public static void mostrar1(int v[]) {
				
				for (int i=0;i<v.length;i++) {
					System.out.println(v[i]);
				}
			}
	
	
	public static void mostrar(int v[],int n) {
		
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i]+", ");
		}
		System.out.println("El vector tiene "+ (n+1)+" elementos");
	}

}
