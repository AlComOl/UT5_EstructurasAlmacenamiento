package Vectores_Ordenados;

public class Dicotomica2_5_2 {

	public static void main(String[] args) {
		final int NUM_ALUM=9;
		int izq=0;
		double alum_nota=0;
		boolean encontrado = false;
		int der;
		der = NUM_ALUM-1;
		double notas[]= {4.5, 3.5, 3, 1.5, 6.0, 7.9, 8.3, 8.5 , 9.5};
		double nota_bus=3.5;
		while (izq <= der && encontrado == false) {
			int centro = (izq + der) / 2; /* posición central */
			if (nota_bus == notas[centro]) { /* encuentra un alumno con la nota */
					encontrado = true; /* terminar búsqueda, podría hacerse con un break */
					alum_nota = centro; /* guardo el alumno que la tiene */
			}else if(nota_bus > notas[centro]) {
				
				izq = centro+1; /* mitad derecha */
				
			}else {
				
				der = centro - 1; /* mitad izquierda */
			}
			
			}
			
		
		if (encontrado == true) {
			System.out.println ("El alumno con nota "+ nota_bus+ " esta en la posicion "+ alum_nota);
		}else {
			System.out.println ( "NO EXISTE ALUMNO CON LA NOTA "+ nota_bus);
		}

	}

}
