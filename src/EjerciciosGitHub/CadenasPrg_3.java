package EjerciciosGitHub;
import java.util.*;
/******************************************
 * @author Álvaro comenge 
 * @fecha 20/2/23
 * @descripcion Dada una Cadena de caracteres invertirla.
 * 
 * ***************************************/
public class CadenasPrg_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Introduce una cadena para invertirla");
		String frase=sc.nextLine();
		
		StringBuffer cadena=new StringBuffer(frase);
		
		cadena.reverse();
		
		System.out.println(cadena);

	}

}
