package MetodosDeClasificacion;
/*------------------------------------------------------------
Método de clasificación: Selección directa
------------------------------------------------------------*/
public class SeleccionDirecta {

	public static void main(String[] args) {
		
		
		int v[]= {10,2,3,4,9};
		int pos=5;//tamaño del vector
		
		seleccionDirecta(v,pos);
		mostrar(v);
	}
	
	public static void seleccionDirecta(int []v,int pos){
		/*------------------------------------------------------------
		Método de clasificación: Selección directa
		------------------------------------------------------------*/
		
		
		int i, j, k, aux;
		
		for(i = 0; i < pos-1; i++){ /* Hasta el ultimo penúltimo */
			aux = v[i];
			k = i;
			
			for (j = i+1; j < pos; j++) /* obtener el menor */
				if (v[j] < aux) {
				aux = v[j];
				k = j;
				}
			v[k] = v[i]; /*intercambiarlos */
			v[i] = aux;
		} /* Final del for */
		}
	
	public static void mostrar(int v3[]) {
		
		for(int i=0;i<v3.length;i++) {
		 System.out.println(v3[i]);
			
		}
	}
}
