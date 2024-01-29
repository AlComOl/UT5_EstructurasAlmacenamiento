package Vectores_Ordenados;
import java.util.*;
//ESTA BUSQUEDA SOLO SE PUEDE REALIZAR CON VECTORES ORDENADOS Y TIENE UN PEQUENO FALLO 
//SI EL ELEMENTO ES MAYOR QUE EL ULTIMO DEL VECTOR EL BUCLE SE SALDRA DEL VECTOR CAUSANDO UN ERROR
//PRA EVITAR ESTE ERROR PUEDES VERIFICARLO ANTES DE ENTRAR AL BUCLE 
public class BusquedaDicotomica {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int izq=0;
		int der=6;
		boolean encontrado=false;
		
		int ordenado[]= {2,4,6,8,10,12};
		
		System.out.println("Numero a buscar");
		int n=sc.nextInt();
//		VERIFICACION
		if(n>ordenado[5]) {
			System.out.println("El numero "+n+" no esta en el vector");
		}else {
		
		while(izq<=der&&!encontrado) {
			
			int centro=(izq+der)/2;
			
			if(n==ordenado[centro]) {
				encontrado=true;
				System.out.println("El numero "+n+" esta en el posicion "+centro);
			}else if(n>ordenado[centro]) {
				izq=centro+1;
			}else {
				der=centro-1;
			}
		}
		
		if(!encontrado) {
			System.out.println("El numero no está en el vector");
		}
		}
	}

}
