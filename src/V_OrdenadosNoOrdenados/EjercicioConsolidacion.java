package V_OrdenadosNoOrdenados;
import java.util.*;
//Ejercicio de consolidación: transforme el ejercicio anterior con una función, añade otro vector con los 
//nombres para que muestre el código del alumno y su nobre.
//Realiza otro programa que tenga un vector de objetos de la clase Alumno y y que haga lo mismo que antes.

public class EjercicioConsolidacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  nombre;
		String nombres[]= {"Juan","Jose","Vicente","Luis","Andres"};
		double notas[]= {3.7,5.8,6.5,6.7,8.9};
		System.out.println("Introduce nota a buscar");
		double notaBuscar1=sc.nextDouble();
		
		

		
		busquedaSecuencial(notas,notaBuscar1);
		
		nombre=busquedaSecuencial(notas,notaBuscar1);
		
		if(nombre!=-1) {
			System.out.println(nombres[nombre]);
		}else {
			System.out.println("El numero no esta en el vector");
		}
	}

	

//	algoritmo de secuencial 
	
	public static int busquedaSecuencial(double []notas, double notaBuscar1) {
		boolean encontrado = false;
		int res=0;
		int alum=0;
		int alum_nota=0;
		int NUM_ALUM=5;
		
		while (alum < NUM_ALUM && encontrado == false)
			if (notaBuscar1 == notas[alum]) {     /* encuentra un alumno con la nota */
				encontrado = true;                /* terminar búsqueda
				alum_nota = alum;                 /* guardo el alumno que la tiene */
			}else {                                /* si no lo encuentra mirar al siguiente */
				
				alum++;
			}
			
			if (encontrado == true) {
				res=alum_nota;
			}
			else {
				res=-1;
			}
			
		return res;
		}
		
}
