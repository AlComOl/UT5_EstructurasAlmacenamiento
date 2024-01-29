package V_OrdenadosNoOrdenados;
import java.util.*;

//1) Búsqueda secuencial en vectores no ordenados y ordenados.
// Este algoritmo funciona tanto en ordenados como en no ordenados 
public class SecuencialNoOrdenados {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int NUM_ALUM=5;
		boolean	encontrado = false;
		int alum=0;
		double alum_nota=0;
		double notas[]= {4.5,3.5,7.9,8.5,2.5};
		
		System.out.println("Introduce el numero");
		double  nota_bus=sc.nextDouble();//introducimos nota a buscar
		
		while(alum<NUM_ALUM&&!encontrado) {
			if(nota_bus==notas[alum]) {
				encontrado=true;
				System.out.println("El numero "+nota_bus+" esta en la posicion "+alum);
			}
			alum++;
			
		}
		if(!encontrado) {
			System.out.println("El numero "+nota_bus+" no esta en el vector");
		}
		
		
		
	}

	}
