package EjerciciosGitHub;
/******************************************************************************************
 * @author Álvaro Comenge 
 * 
 * Fecha:12/02/24
 *
 *Aceptar una matriz de 10 x 5 de enteros y calcular la suma de cada una de las filas,
 * y de sus columnas por separado, dejando los resultados en 2 vectores, uno con la suma 
 * de las filas y otro con la suma de las columnas. Mostrando posteriormente los resultados. 
 * Sólo se puede recorrer una vez la matriz entera.
 * 
 **********************************************************************************************/

public class Prg5_22 {

	public static void main(String[] args) {
		
		   int v[][]= {{1,2,3,4,7},{1,6,3,4,7},{1,2,6,4,7},{1,2,3,4,7},{1,60,3,4,7},{1,2,-3,4,7},{1,2,3,4,-7},{1,2,3,4,7},{1,2,3,4,7},{1,2,3,4,7}};
		   int sumaFila[]=new int [10];
		   int sumaColumna[]=new int [5];
		   
		   
		   mostrarMatriz(v);
		   sumaFilaYColumnas(v,sumaFila,sumaColumna);
		  System.out.println("\nLa suma de las filas es :");  
		  mostrar(sumaFila);
		
		 System.out.println("\nLa suma de las columnas es :");  
		   mostrar(sumaColumna);


		   
		   
	}

	public static void sumaFilaYColumnas(int v[][],int sumaFila[],int sumaColumna[] ) {
	/*********************************************************************************
	 * @author acome
	 * @param  v[][] vector
	 * @param sumaFila[] vector suma de filas 
	 * @param sumaColumna[] vector suma de columnas 
	 * 
	 * La funcion suma las cada columna y la mete en el vector de sumafilas igual 
	 * con las columnas
	 * ********************** *********************************************************/
		
		 
		if(v.length==10&&v[0].length==5) {
			
			for(int i=0;i<v.length;i++) {
				for(int j=0;j<v[0].length;j++) {//[0] matriz iregular
					sumaFila[i]+=v[i][j];//suma valores de cada valor de la fila y guarda en cada posicion del vector 
					sumaColumna[j]+=v[i][j];//igual con las columnas	
					
					}	
				}
			}else {
			System.out.println("Matriz difente a la ");
		}
		
	
}
		public static void   mostrar(int a[]) {
			
			for(int i=0;i<a.length;i++) {
			 System.out.print("posicion :"+i+" valor suma: "+a[i]+"\n");
			 
			}
		}
		
		
		public static void mostrarMatriz(int v[][]) {
			/*********************************************
			 * @author acome
			 * @matriz iregular
			 * 
			 * Carga los valores de una matriz irregular
			 * 
			 * 
			 * 	
			 *********************************************/
				for(int i=0; i<v.length;i++) {
					System.out.print("[ ");
					for(int j=0;j<v[0].length;j++) {//int j=0;j<v[0].length;i++
						System.out.print(v[i][j]);
					}
					System.out.println(" ]");
				}
			}
}
