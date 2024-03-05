package ExamenEscrito2evaluacion;
import java.util.*;
public class E3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String cadena="Hola Alvaro";
		int rdo[]=new int [1];
		
		String r=capitalizar(cadena, rdo);
		
		System.out.println(rdo[0]);
		System.out.println(r);

	}
	
	public static String capitalizar(String cadena,int rdo[]) {
		int mayusculas=0;
		String	nuevacadena =cadena.substring(0,1).toUpperCase()+cadena.substring(1);
		
		for(int i=0;i<cadena.length();i++) {
			
			if(Character.isUpperCase(cadena.charAt(i))) {
				
				 mayusculas++;
			}
			
			rdo[0]=mayusculas;
		}
		
		
		return nuevacadena;
		
	}

}
