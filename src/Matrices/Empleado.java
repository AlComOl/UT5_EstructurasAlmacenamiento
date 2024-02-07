package Matrices;

import java.util.Scanner;

public class Empleado {

	
	
//		atributos
		private String nombre;
		private static final int N=3;
		private float sueldo[];
//		constructores
		
		public Empleado() {
			
		}
		
		public Empleado(String nombre,int sueldos[]) {
			
			this.nombre=nombre;
			this.sueldo = sueldo;
			
		}
		
		
		public Empleado(Empleado otroEmpleado) {
			this.nombre=otroEmpleado.nombre;
			this.sueldo=otroEmpleado.sueldo;
		}
//		setters y getters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public float[] getSueldo() {
			return sueldo;
		}

		public void setSueldo(float[] sueldo) {
			this.sueldo = sueldo;
		}
		
		
//	demás	Metodos 

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
		
		

	
			 
					public static void main(String[] args) {
						Scanner sc=new Scanner(System.in);
						final int N=10;
						int empleadosTotal;
						
						String empleados[]=new String[N]; 
						int ingresos[][]=new int [N][N];
						int sueldo;
							
							Empleado e1= new Empleado();
							
							System.out.println("Introduce Empleados");
//				cargamos los empleados
						empleadosTotal=e1.CargarEmpleados(empleados,sc);
//				cargamos sueldos		
						IntroducirIngresos(ingresos,sc,empleados,empleadosTotal);
						
				
					}
			}
	


