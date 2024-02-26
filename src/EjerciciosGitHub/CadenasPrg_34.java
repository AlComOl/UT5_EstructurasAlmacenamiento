package EjerciciosGitHub;


import java.util.*;
public class CadenasPrg_34 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int menu,numero;
		String cadena;
		
		do {
			getMenu();
			menu=in.nextInt();
			switch(menu) {
			case 1:
				System.out.println("Dame el numero");
				numero=in.nextInt();
				cadena=String.valueOf(numero);
				System.out.println("Para comprobar que es cadena, lo duplicamos, debe salir los mismos numeros dos veces");
				System.out.println("Cadena original: "+cadena);
				System.out.println(cadena+cadena);
				break;
			case 2:
				System.out.println("Dame la cadena");
				cadena=in.next();
				numero=Integer.valueOf(cadena);
				System.out.println("Para comprobar que un numero, lo duplicamos, debe salir el doble del numero original");
				System.out.println("Numero original: "+numero);
				System.out.println(numero+numero);
				break;
				default: break;
			}	
		}while (menu!=0);
	}
	
	public static void getMenu() {
		System.out.println("1. Convertir un numero a cadena");
		System.out.println("2. Convertir una cadena a numero");
		System.out.println("0. Salir");
	}
}
