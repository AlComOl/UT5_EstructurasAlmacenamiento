package V_OrdenadosNoOrdenados;
import java.util.*;

public class PruebaDesordenador {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int notaBusqueda;
		
		boolean encontrado=false;
		int contador=0; 
		int notas[]=new int[5];
		
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduce notas");
			n=sc.nextInt();
			notas[i]=n;
		
		}
		
			System.out.println("Introduce la nota que vas buscando");
			notaBusqueda=sc.nextInt();
		
		while(contador<notas.length&&!encontrado) {		
				if(notaBusqueda==notas[contador]) {
					encontrado=true;
					System.out.println("El numero "+notaBusqueda+" esta en la posicion "+contador);
				}
				contador++;
		}
				if(!encontrado==true) {
					System.out.println("nO ESTA EN EL VECTOR ");
				}
			
		}
	}


