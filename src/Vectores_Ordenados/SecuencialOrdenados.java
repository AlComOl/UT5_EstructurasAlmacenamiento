package Vectores_Ordenados;
import java.util.*;
//Vector Ordenado Busqueda Secuencial 
public class SecuencialOrdenados {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cont=0;
		boolean encontrado=false;
		int ordenado[]= {10,20,30,50,60,70,80,90,100};
		
		System.out.println("Introduce valor a buscar");
		int n=sc.nextInt();
//	SECUENCIAL CON EL BUCLE FOR	
//		for(int i=0;i<ordenado.length;i++) {
//			if(ordenado[i]==n) {
//				System.out.println("El numero "+n+" esta en la posicion "+i);
//			}
//		}
//	SECUENCIAL CON WHILE
		
		while(cont<ordenado[cont]&&!encontrado) {
			
			if(ordenado[cont]==n) {
				encontrado=true;
				System.out.println("El numero "+n+" está en la posición "+cont);
			}
			cont++;
		}
		
		}
	}


