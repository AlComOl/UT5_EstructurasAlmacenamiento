package ExEscrito2Eva6324;
import java.util.*;
//realice una funcion recursiva que obtenga la suma de los numeros naturales desde 1 hasta n
//se debe de pasar como parametro el numero n, debe de ser mayor que 0. Se debe de imprimir toda la cadena por consola
//Por ejemplo para n=4 (1+2+3+4=10);
public class tarea1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce n");
		int n = sc.nextInt();
		System.out.println(funcion(n));

	}

	public static int funcion(int n) {
		int res;
		if(n==1) {
			
			res=1;
		}else {
			res=n+funcion(n-1);
			System.out.println(n);
		}
		return res;
	}
}
