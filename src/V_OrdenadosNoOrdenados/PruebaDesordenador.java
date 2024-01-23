package V_OrdenadosNoOrdenados;
import java.util.*;

public class PruebaDesordenador {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int notaBusqueda;
		int resuBusqueda=0;
		boolean encontrado=false;
		int contador=0; 
		int notas[]=new int[10];
		
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduce notas");
			n=sc.nextInt();
			notas[i]=n;
		
		}
		
			System.out.println("Introduce la nota que vas buscando");
			notaBusqueda=sc.nextInt();
		
		while(contador<notas.length&&encontrado==false) {		
				if(notaBusqueda==notas[contador]) {
				encontrado=true;
				resuBusqueda=contador;
			}else {
				contador++;
			}
			
			if(encontrado=true) {
				System.out.println("El numero que buscas esta en el vector es:"+resuBusqueda);
			}else {
				System.out.println("El numero que buscas no esta en el vector");
			}
		}
	}

}