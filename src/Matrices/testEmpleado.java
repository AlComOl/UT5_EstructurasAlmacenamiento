package Matrices;
/************************************************************
 * @author acome
 * 
 * Consolidacion 5 POO
 ***********************************************************/


import java.util.Scanner;

public class testEmpleado {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int N=3;
		
//		Creamos un array de empleados
		Empleado empleados[]=new Empleado[10]; //es un array que tiene empleados dentro con su nombre y sueldo

		boolean igual=false;
		int i=0;
		String entrada;
			
			
//			mientras los el tamño de empleados sea mayor y igual sea false se ejecurtara el bucle 
		    while(i < empleados.length&&igual==false) {
		    	
		        System.out.println("Introduce Nombres de empleados");
		        	entrada = sc.nextLine();
//		        	si la entrada es fin saldra del bucle
		        	  if (entrada.equalsIgnoreCase("fin")) {
				        igual=true;
				      }else {			    	  
				        Empleado e1=new Empleado(entrada);//Nuevo obgeto de Empleado llamado e1
//				        (el constructor recibe el nombre como parametro)
				        	double sueldos[]=new double[N];//creamos un nuevo array con n posiciones
//				      
				        System.out.println("Introduce Sueldos ");
					      	for (int j=0;j<N;j++) { //Utilizamos el bucle para iterar por los meses 
					         		
				         		System.out.println("Introduce sueldo mes "+ j);
				         		
				         		sueldos[j]=sc.nextDouble();//se almacena en cada iteracion el sueldo
								
					         }
					         	sc.nextLine();
			         		e1.setSueldo(sueldos);
			         		empleados[i] = e1;//pasamos un empleado
			         		i++;
				        }
		    }
		    
		    for(int k=0;k<empleados.length-1;k++) {
		    	if(empleados[k]!=null) {
		    	System.out.println(empleados[k].toString());
		    	}
			}
			        
			    
		   }
		    
		        	
		        	
		         
		        
		        
		         
		         	
		         	
		         
		      
			
		}

