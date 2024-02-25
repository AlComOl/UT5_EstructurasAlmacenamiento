package EjerciciosGitHub;
import java.util.*;
/*************************************************
 * @author acome
 * 
 * @fecha 24/02/24
 * 
 * @descripcion Hacer un programa que al recibir como 
 * datos dos cadenas de caracteres forme una tercera cadena
 * intercalando los caracteres de las palabras de las cadenas recibidas.
 * ************************************************/
public class CadenasPrg_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce primera cadena");
		String c1=sc.nextLine();
		System.out.println("Introduce primera cadena");
		String c2=sc.nextLine();
		
		mezclarCadenas(c1,c2);
		

	}
	
	public static void mezclarCadenas(String c1,String c2) {
		
		StringBuilder c3 =new StringBuilder();
		int k=0,i,pos=0;
		
		int longitudc1=c1.length();
		int longitudc2=c2.length();
		
		if(longitudc1>longitudc2) {
		
			for( i= 0;i<longitudc1;i++) {
				c3.append(c1.charAt(i));	
				if(i<longitudc2) {
					c3.append(c2.charAt(i));
				}
					
			}
	
		}else {
			
			for( i= 0;i<longitudc2;i++) {
				
				if(i<longitudc1) {
				c3.append(c1.charAt(i));	
			}
			
		c3.append(c2.charAt(i));
				
					
				}
			}
			
		
		System.out.println(c3);
		
	}	
		
		
}	
