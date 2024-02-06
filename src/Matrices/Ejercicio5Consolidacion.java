package Matrices;
import java.util.*;

public class Ejercicio5Consolidacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String empleados[]=new String[4];
		int ingresos[][]=new int [4][3];
		int totTrim[]=new int [3];
		
		CargarEmpleados(empleados,sc);
		IntroducirIngresos(ingresos,sc);
		obtienePagoTrimestreEmpleado(ingresos,totTrim);
		mostrarTotalPagoxEmpleado(empleados,totTrim);
	}

	
	public static void CargarEmpleados(String empleados[],Scanner sc) {
	/********************************************************
	 * @author acome
	 * @param array de empleados
	 * @funcion carga los empleados emn el array
	 * 
	 *******************************************************/
	
		for(int i=0;i<empleados.length;i++) {
			System.out.println("Introduce Nombres de empleados");
			empleados[i]=sc.nextLine();
		}
		
	}
	
	public static void IntroducirIngresos(int ingresos[][],Scanner sc) {
	/********************************************************
	 * @author acome
	 * @param ingresos matriz
	 * @funcion introducir ingresos 
	 * 
	 ********************************************************/
		
		for (int i=0;i<ingresos.length;i++) {//maneja filas
			System.out.println("************Introduce ingresos mes "+ (i+1) +" ****Tipo INT****");
				for(int j=0;j<ingresos[i].length;j++) {
					
					ingresos[i][j]=sc.nextInt();
			}
		}
	}
//	el fallo esta aqui
	public static void obtienePagoTrimestreEmpleado(int ingresos[][],int totTrim[]) {
		
		for(int i=0;i<ingresos[i].length;i++) {//maneja filas
			for(int j=0;j<ingresos.length;i++) {//maneja columnas
				totTrim[i]+=ingresos[j][i];
			}
		}
	
	}

	
	public static void mostrarTotalPagoxEmpleado(String empleados[],int totTrim[]) {
		
		for(int i=0;i<empleados.length;i++) {
			System.out.print(empleados[i]+" ");
			for(int j=0;j<totTrim.length;j++) {
				System.out.println(totTrim[i]);
			}
			System.out.println("************");
		}
	}
}
