package PracticaVectoresMatrices2023;
/********************************************
 * @autor Practica2023
 * Fecha 11/02/2024
 * *****************************************/
import java.util.*;
public class Tarea1 {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		double v1[]= {2,4,6,8,10,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//tamaño 20
		int n,n1,c_pos=6;//siendo 6-1(5) las posiciones ocupadas del vector
		double n2=0,n3=0,a=0, buscado;
		
		
//		menu
		do {
		System.out.println(
					       "\n 1.- introducir un elemento en el vector: "
					      +"\n 2.- buscar un elemento"
					      +"\n 3.- eliminar un elemento del vector"
					      +"\n 4.- muestra el vector y el número de elementos del vector"
					      +"\n 5.- muestra la media aritmética de todos sus elementos"
					      +"\n 6-. muestra la desviación estándar"
					      +"\n 7.- modificar un elemento dado del vector"
//					      Me falta hacer el punto 7 porque no lo tengo claro 
//					      creo que llamando al metodo buscar inseratar u ordenar burbuja se podria hacer 

					      +"\n Elige opcion");
		
		
							n=sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Introduce elemento");
			n2= sc.nextDouble();
			c_pos++;
			if(c_pos<20) {
			
				System.out.println(insertar1(v1,c_pos,n2));
				
			}else {
				System.out.println("vector lleno de elementos");
			}
		break;
		case 2: {
			System.out.println("Introduce el numero a buscar");
			double dato= sc.nextDouble();
			int res=buscar(v1,c_pos,dato);
			System.out.println(res);
		}
		break;
		case 3: {
			System.out.println("Introduce el elemento a eliminar");
			double eliminar= sc.nextInt();
			 buscado=buscar(v1,c_pos,eliminar);
			if(buscado>=0) {
			System.out.println(eliminar(v1,buscado));
			}else {
				System.out.println("El numero no esta en el vector");
			}
		}
		break;
		case 4:{
			mostrarVector(v1);
			
			
			
		break;
		}
		case 5:{
			double media=mediaAritmetica(v1);
			System.out.println(media);
		break;	
		}
		case 6:{
			
		System.out.println("La desviacion estandar es :"+desviacionTipica(v1,a));	
		break;
		}
		case 7:
		System.out.println("Cual es el elemento que quieres modificar");
		double dModificar=sc.nextDouble();
		 buscado=buscar(v1,c_pos,dModificar);
		 
			
		default:
			
		}
		
		}while(n!=0);
		
		
	}

	public static boolean insercionDirecta(double v[], int n, double elemento) {
	/**************************************************************************	
	 * Este bucle lo que hace es ordenar los elementos NO INSERTA ELEMENTOS
	 * ahora si antes no
	 * ************************************************************************/
		boolean insert = true;
	    if (n < v.length) {
	        v[n] = elemento; // Lo inserto al final de los elementos
	        n++; // Incrementar el contador de elementos en el vector
	        double aux;
	        for (int i = 0; i < n; i++) {
	            aux = v[i];//guardo el elemento que estoy comparando con los demás
	            int j = i;
	            while (j > 0 && aux < v[j - 1]) {//Mientras el aux que es 1 elemento
	            								 //sea menor que el anterior [j-1]
	            								 //desplazo elementos para delantev[j] = v[j - 1];
	                v[j] = v[j - 1];
	                j--;
	            }
	            v[j] = aux;
	        }
	    } else {
	        insert = false;
	    }
	    return insert;
	}
		
	   
		
	
	
	public static boolean insertar1(double v[], int nElementos, double elemento) {
	/************************************************************************
	 * @author acome
	 * @param double v[] vector
	 * @param int nElementos
	 * @param double elemento
	 * 
	 * insercion de un elementos en una posicion especifica
	 * 
	 * ************************************************************************/
		int  posicion=0;
		boolean introducido=false;
				while(posicion<nElementos&&v[posicion]<elemento) {//encuentra el lugar del numero(posicion)
			//	Miestras la posicion es menor que el nElementos
			//y posicion menor que elemeto repite bucle	aumentando el contador
						posicion++;
					
					}
						for(int i=nElementos;i>posicion;i--) {//ndados menor que la posicion 
							v[i]=v[i-1];
			//metemos i-1 en i que es 1 posicion mas, de manera que empujamos todos los valores 1 posicion
						}
						v[posicion]=elemento;//metemos el numero
						introducido=true;
			
						
						
						return introducido;
	}
//	FUNCION DE BUSCAR ELEMENTO
	public static int buscar(double [] v, int n, double dato) {
	/**********************************************************
	 * @author acome
	 * @param double v[] vector
	 * @param int n numero de elementos del vector c_pos
	 * @param double dato a buscar
	 * 
	 * Busca el dato que pasamos por la funcion
	 * 
	 * devuelve -1 si no lo encuentra o la posicion del elemento(i)  
	 * 
	 * *********************************************************/
			int rdo=-1;
			boolean encontrado=false;
		for(int i=0;i<v.length&&encontrado==false;i++) {
			if(v[i]==dato) {
				encontrado=true;
				rdo=i;
			}
			
		}
		
		return rdo;
		
	}
	
	public static int eliminar(double [] v, double posicion) {
	/******************************************************
	 * @author acome
	 * @param double [] v
	 * @param int posicion 
	 * 
	 * 
	 * Elimina el elementos del vector pasando la posicion 
	 * donde esta 
	 * 
	 *******************************************************/
		int eliminado;
		v[(int) posicion]=0;
		if(posicion==0) {
			 eliminado=-1;
		}else {
			eliminado=1;
		}
		return eliminado;
	}
	
	
	
	
	public static void mostrarVector(double v[]) {
	/*************************************************	
	 * @author acome
	 * @param double v[]
	 * 
	 * Muestra el vector y el numero de elementos que 
	 * hay en el.
	 * 
	 * ***********************************************/
	
		int i, elementos=0;
		for(i=0;i<v.length-1;i++) {
			System.out.print(v[i]+" ,");	
		}
		System.out.print(v[i]);
		for(int j=0;j<v.length;j++) {
			if(v[j]>0) {
				elementos++;
			}	
		}
		System.out.println("\n El numero de elementos del vector es "+ elementos);
	}
	
	
	public static double mediaAritmetica(double v[]) {
		int i,suma=0,media;
		for( i=0;i<v.length;i++) {
			suma+=v[i];
		}
		media=suma/i;
	
		return media ;
	}
	
	
	public static void ordenarBurbuja(double v[]) {
		
		/***********************************************************
		 * 
		 * @author Álvaro Comenge
		 * @param v[] vector de elementos 
		 * Metodo : Ordenacion vector (Burbuja)
		 * 
		 ***********************************************************/
			double aux=0;
			for(int i=0; i<v.length-1;i++) {
				for(int j=v.length-1;j>i;j--) {
					if(v[j-1]>v[j]) {
						aux=v[j-1];
						v[j-1]=v[j];
						v[j]=aux;
						
					}
				}
			}
		}	
	
	public static double  obtenerMediana(double v[]) {
		/*******************************************************
		 * @author Álvaro Comenge
		 * 
		 * Método Mediana: valor que tiene igual número de valores 
		 * superiores que inferiores.
		 * 
		 * @param v el array de elementos 
		 * 
		 * El array debe estar ordenado llamamos al metodo ordenarBurbuja 
		 * para ordenar el array.
		 * 
		 ******************************************************/
		ordenarBurbuja(v);
		
		double res=0;
		if(v.length%2!=0) {
			
			res=v.length/2;
			
		}else {
			double sum=v[v.length/2]+v[(v.length/2)+1];
			res=sum/2;
		}
		return res;
	}
	public static double desviacionTipica(double v[],double a) {
		/*******************************************************
		 * @author Álvaro Comenge
		 * 
		 * Método:Desviación típica: variación del conjunto de 
		 * valores respecto al valor medio..
		 * 
		 * Atención el array debe estar orenado o previamente
		 * llamar al método ordenar.
		 * 
		 ******************************************************/
		
		double suma=0;
		/*Resto la media a cada valor del vector*/
		
		for(int i=0;i<v.length;i++) {
//			 se encarga de calcular el cuadrado de la diferencia entre el valor de v[i] 
//			 y la media  de todo el conjunto de datos obtenerMedia(v)
			suma+=Math.pow(v[i]-obtenerMediana(v), 2);
		}
		
		return suma;
	}	
	
}