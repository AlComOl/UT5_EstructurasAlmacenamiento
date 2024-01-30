package MetodosDeClasificacion;
//hace como las burbujas del champagne sube el menor
/*------------------------------------------------------------
Método de clasificación: Intercambio directo (Burbuja)
------------------------------------------------------------*/
public class IntercambioDirecto {

	public static void main(String[] args) {
		final int N_EL = 7;
		
		int v[]= {3,1,2,10,5,8,9};
		
		intercambioDirecto(v,7);
		
		mostrar(v);
		

	}
	
	
		public static void intercambioDirecto(int []v,int pos){
			
			int i, j, aux;
		
				for(i = 0; i < pos - 1; i++) {/* Se realizan N_EL-1 pasadas */
					for(j = pos - 1; j > i; j--) { 
						if (v[j-1] > v[j]) {
							aux = v[j-1];
							v[j-1] = v[j];
							v[j] = aux;
						}
					}
				}
					
					}
			
			public static void mostrar(int v3[]) {
				
				for(int i=0;i<v3.length;i++) {
				 System.out.println(v3[i]);
					
				}
	
	}
	
}
