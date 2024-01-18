package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:18/01/24
 * 
 *  Escribe un algoritmo que carga una lista de 100 nombres en un vector NOM de 100 elementos alfanuméricos y a continuación 
 *  permite sucesivas consultas para comprobar si un nombre está o no en la lista. El final de las consultas se detectará al 
 *  introducir un *.
 * 
 * 
 * 
 * 
 *****************************************************************************************************************************/
public class Prg5_15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int NOMBRES=100;
		String c;
		boolean busqueda=false;
		String NOM[]=new String[NOMBRES];
		do {
	
		System.out.println("Introduce nombres");
		
		for(int i=0;i<NOMBRES;i++) {
				
			NOM[i]=sc.next();
		}
		System.out.println("Introduce el nombre a consultar");
		c=sc.next();
		for(int z=0;z<NOMBRES;z++) {
			if(c.equalsIgnoreCase(c)) {
				busqueda=true;
				break;
			}
			
		}
		String res=busqueda==true?"Coincide":"No coincide";
		System.out.println(res);
		}while(!c.equalsIgnoreCase("*"));
		System.out.println("Adios");
		
			
		
	
	}
}