package PracticaVectoresMatrices2023;
import java.util.*;
public class Tarea1 {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int v1[]= {2,4,6,8,10,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//tamaño 20
		int n,n1,n2=0,c_pos=6;//siendo 6-1(5) las posiciones ocupadas del vector
		
		
//		menu
		do {
		System.out.println(
					       "\n 1.- introducir un elemento en el vector: "
						  +"\n 2.- buscar un elemento"+
						  "\n Elige opcion");
		
		
							n=sc.nextInt();
		switch (n) {
		case 1: 
			
			System.out.println("Ordenar valor en el vector");
			n2=sc.nextInt();
			if(c_pos>v1.length) {
				
				System.out.println("El vector está lleno");
			
			}else {
			System.out.println(insertar(n2,v1));
				c_pos++;
				
				for(int i=0;i<20;i++) {
					
					System.out.print(v1[i]+" ,");
				}	
			
			}
			
	
		
		case 2: {
			
			
		}
		case 3: {
			
			
		}
		default:
			
		}
		
		}while(n!=0);
		
		
	}
//	FUNCION DE INSERTAR VALOR *me falta hacer que si el valor es mayor que el mayor del vector lo insete
	public static boolean insertar(int n, int v1[]) {
		int aux=0,cont=0;
		boolean insert=false;
		while(cont<20&&v1[cont]<n) {//encontramos la posicion donde va el numero
			
			cont++;
			
		}
		  if (cont == v1.length) {
		        System.err.println("El vector está lleno");
		
			for(int i=18;i>=cont;i--){//he cambiado la n habia un 18 
			
				v1[i+1]=v1[i];
			
			}
		
			v1[cont]=n;
			insert=true;
	
		}
		return insert;
	}

	
//	FUNCION DE BUSCAR ELEMENTO
	public static int buscar(double v1[],int n, double dato) {
		
		
		return n;
		
	}
}