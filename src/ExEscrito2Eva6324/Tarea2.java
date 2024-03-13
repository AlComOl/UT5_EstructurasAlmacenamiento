package ExEscrito2Eva6324;
import java.util.*;
/***************************************************************************************************************************************************************************************************************
 * Realice un progrma en Java que pida el nombre del municipio, y las fechas en las que ha llovido , asi como la pluviosidad
 * de ese dia . La informacion de las fechas (String), la guardará en un vector y la pluviosidad en otro vector y determine las fechas en las que la pluviosidad
 * no ha superado la media actual(solo si ha habido lluvia ese dia).PAra el calculo de la media tendremos en cuentatodos los dias del año(365), incluidos los que tengan pluviosidad cero.
 * El programa mostrara por pantalla la ciudad a la que pertenece el registrode lluvias , la media actual y ,a continuacion, las fechas, en las que no ha superado la media actual (si en esa fecha ha llovido)
 * 
 * Solo aparecen los dias en que se ha producido lluvia,Los dias que no aparecen m la lluvia es cero.
 * 
 * 
 * 
 * 
 * *************************************************************************************************************************************************************************************************************/
public class Tarea2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		  final int MAX=365;
		  int cont=0;
		  
		
		String fechas[]=new String[MAX];
		float pluviosidad[]=new float[MAX];
		String municipio;
		float media=0,sum=0;
		
		String continuar ="s";
		
		System.out.println("Introduce nombre del municipio");
		municipio=sc.next();
		
		
		System.out.println("Dame la pluviosidad dd/mm/aa dd.dd");
		
		
	
		for(int i=0;i<fechas.length&&continuar.equalsIgnoreCase("s");i++) {
			
				System.out.println("Fecha");
				fechas[i]=sc.next();
				System.out.println("litros");
				pluviosidad[i]=sc.nextFloat();
				sum+=pluviosidad[i];
				System.out.println("Quieres continuar");
				continuar=sc.next();
		}
		
			media=sum/MAX;
		
		System.out.println("Pluviosidad media "+ media+"litros");
		System.out.println("Lo dias que ha llovido y no se ha superado la pluviosidad media han sido");
		
			for(int j=0;j<pluviosidad.length;j++) {
						
						if(pluviosidad[j]<media&&pluviosidad[j]!=0.0) {
							if()
						System.out.println(fechas[j]);
						}
					}

	}
}
