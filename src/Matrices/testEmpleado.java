package Matrices;

import java.util.Scanner;

public class testEmpleado {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int N=3;
		
		
		Empleado empleados[]=new Empleado[10]; //es un array que tiene empleados dentro con su nombre y sueldo
//		double sueldos[]=new double[N];
		boolean igual=false;
		int i=0;
		String entrada;
			
			
			
		    while(i < empleados.length&&igual==false) {
		    	
		        System.out.println("Introduce Nombres de empleados");
		        	entrada = sc.nextLine();
		        	  if (entrada.equalsIgnoreCase("fin")) {
				        igual=true;
				      }else {
				        Empleado e1=new Empleado(entrada);
				        	double sueldos[]=new double[N];
//				        	e1.setNombre(entrada);
				        	 System.out.println("Introduce Sueldos ");
					         	for (int j=0;j<N;j++) {
					         		
					         		System.out.println("Introduce sueldo mes "+ j);
					         		sueldos[j]=sc.nextDouble();
								
					         	}
					         	sc.nextLine();
					         		e1.setSueldo(sueldos);
					         		empleados[i] = e1;//pasamos un empleado
					         		i++;
				        }
		    }
//		    SUMA EL TOTAL 
		    
		  
		    for(int k=0;k<empleados.length-1;k++) {
		    	if(empleados!=null) {
		    	System.out.println(empleados[k].toString());
		    	}
			}
			        
			    
		   }
		    
		        	
		        	
		         
		        
		        
		         
		         	
		         	
		         
		      
			
		}

