package EjerciciosGitHub;
import java.util.*;
/**************************************************************
 * @autor Álvaro Comenge
 * 
 * @Fecha 22/02/24
 * 
 * @descripcion Escriba un programa que lea una frase y a continuación
 *  visualice cada palabra de la frase en columnas, seguida del número
 *   de letras que tiene cada palabra
 * 
 * **********************************************************/
public class CadenasPrg_21 {//estudiarlo bien esta tarde 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase=sc.nextLine();
		
		fraseAColumnas(frase);
	}

	public static void fraseAColumnas(String frase) {
		
		String acolumnas[]=frase.split(" ");//split separa cuando encuentra espacio
		
		
		for(int i=0;i<acolumnas.length;i++) {//bucle externo separa palabra
			
			String palabraContar=acolumnas[i];//metemos en palabraContar cada incremento 
			int cont=0;
			
			for(int j=0;j<palabraContar.length();j++) { //cuenta las vocales 
			
				
				cont++;
			}
			 System.out.println(acolumnas[i] + "\t tiene\t" + cont + "\tvocales");
			
		}
	}
}
