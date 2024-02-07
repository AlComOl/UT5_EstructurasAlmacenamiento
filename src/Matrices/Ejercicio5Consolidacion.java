package Matrices;
import java.util.*;
/**********************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha : 7/02/24
 * 
 * Ejercicio de consolidación 3 Apuntes Pdf 
 **********************************************/

public class Ejercicio5Consolidacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int N=24;
		String empleados[]=new String[N];
		int ingresos[][]=new int [N][3];
		int totTrim[]=new int [N];
		int empleadoTotal=0;
		
		empleadoTotal=CargarEmpleados(empleados,sc);
		
		IntroducirIngresos(ingresos,sc,empleados,empleadoTotal);
		obtienePagoTrimestreEmpleado(ingresos,totTrim,empleadoTotal);
//		mostrarMatriz(ingresos);
		mostrarTotalPagoxEmpleado(empleados,totTrim,empleadoTotal);
		int SueldoMaximo=maxSueldo(totTrim,empleadoTotal);
		System.out.println("El sueldo Maximo es "+SueldoMaximo );
		
	}


			public static int CargarEmpleados(String empleados[],Scanner sc) {
			/********************************************************
			 * @author acome
			 * @param array de empleados
			 * @funcion carga los empleados emn el array
			 * 
			 *******************************************************/
				boolean igual=false;
				int i=0;
				String entrada;
			    while(i < empleados.length&&igual==false) {
			    	
			        System.out.println("Introduce Nombres de empleados");
			         entrada = sc.nextLine();
		
			        if (entrada.equalsIgnoreCase("fin")) {
			             igual=true;
			        }else {
			        empleados[i] = entrada;
			        i++;
			        }
			    }
				return i;
			}
		//	modificar*********
			public static void IntroducirIngresos(int ingresos[][],Scanner sc,String empleados[],int empleadoTotal) {
			/********************************************************
			 * @author acome
			 * @param ingresos matriz
			 * @funcion Introduce los ingresos de 3 meses de 4 empleados
			 * 
			 ********************************************************/
				
				for (int i=0;i<empleadoTotal;i++) {//maneja filas
					System.out.println("************Introduce ingresos Empleado "+empleados[i] +" ****Tipo INT****");
						for(int j=0;j<ingresos[i].length;j++) {
							
							ingresos[i][j]=sc.nextInt();
					}
				}
			}
		
			public static void obtienePagoTrimestreEmpleado(int ingresos[][], int totTrim[],int empleadoTotal) {
			/*********************************************************************************
			 * @author acome
			 * @matriz ingresos
			 * @array totTrim con la suma de cada uno de los meses de cada empleado
			 * 
			 * *******************************************************************************/
			    for (int i = 0; i <empleadoTotal ; i++) { // maneja filas
			        for (int j = 0; j < ingresos[i].length; j++) { // maneja columnas
			            totTrim[i] += ingresos[i][j];
			        }
			    }
			}
			
			public static void mostrarMatriz(int ingresos[] []) {
				/**************************************
				 * @author acome
				 * @param m[] matriz
				 * 
				 * Muestra valores a la matriz que 
				 * pasamos por parametro para comprobar
				 ****************************************/
				   
				    for (int fila = 0; fila < ingresos.length; fila++) {
				    	 System.out.print(" [");
				       for(int columna=0;columna<ingresos[fila].length;columna++) {
				    	  System.out.print(ingresos[fila][columna]+" ");
				    	  
				       }
				       System.out.println("]  ");
				    }
				}
			
			public static void mostrarTotalPagoxEmpleado(String empleados[],int totTrim[],int empleadoTotal) {
			/******************************************************************************	
			 * @autor acomenge
			 * @param empleados array empleados
			 * @param totTrim array suma sueldo de los meses 
			 * @param empleadoTotal empleados que hemos introducido
			 * 
			 * Muestra la tabla con empleado y suma de los sueldos de cada empleado
			 * ****************************************************************************/
				System.out.println("La suma de los sueldos de los Empleados introducidos es: ");
				for(int i=0;i<empleadoTotal;i++) {
					
					System.out.printf("%-10s\t%d euros\n", empleados[i], totTrim[i]);
				}
				
			}
			
			public static int maxSueldo (int totTrim[],int empleadoTotal) {
			/*****************************************************************		
			 * @author acome
			 * @param totTrim suma total de sueldos
			 * @param empleadoTotal empleados que hemos introducido
			 * 
			 * Devuelve el max sueldo entre el total de los empleados
			 * 
			 * **************************************************************/
				int max=totTrim[0];
				
					for(int i=0;i<empleadoTotal;i++) {
						if(totTrim[i]>max);
						max=totTrim[i];	
					}
					return max;
			}
	}
