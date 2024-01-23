package V_OrdenadosNoOrdenados;
import java.util.*;

//1) Búsqueda secuencial en vectores no ordenados.
public class SecuencialNoOrdenados {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int NUM_ALUM=5;
		boolean	encontrado = false;
		int alum=0;
		double alum_nota=0;
		double notas[]= {4.5,3.5,7.9,8.5,2.5};
		System.out.println("Introduce el numero");
		double  nota_bus=sc.nextDouble();
//		double nota_bus=4.6;
		
		while (alum < NUM_ALUM && encontrado == false) {
			if (nota_bus == notas[alum]) { /* encuentra un alumno con la nota */
					encontrado = true; /* terminar búsqueda, podría hacerse con un break*/
					alum_nota = alum; /* guardo el alumno que la tiene */
			}else {
				alum++; /* si no lo encuentra mirar al siguiente */
			}
		}
	
		if (encontrado == true) {
			System.out.println ("El alumno con nota "+ nota_bus+ " es "+ alum_nota);
		}else {
			System.out.println ( "NO EXISTE ALUMNO CON LA NOTA "+ nota_bus);
		}
		
		
	}

	}
