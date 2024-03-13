package Practica280224;
import java.util.*;

public class testClubEcuestre {

	

    public static void main(String[] args) {
    	
    	 ArrayList<Caballo> caballos = new ArrayList<>();
         ArrayList<Cliente> clientes = new ArrayList<>();
    	
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Crear caballo");
            System.out.println("2. Crear cliente");
            System.out.println("3. Mostrar información de un cliente");
            System.out.println("4. Mostrar información de un caballo");
            System.out.println("5. Reservar paseo");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearCaballo(caballos);
                    break;
                case 2:
                    crearCliente(clientes);
                    break;
                case 3:
                	 System.out.print("Ingrese nombre cliente: ");
                     String nombreCli = sc.nextLine();
                     
                     mostrarInfoCliente(clientes,nombreCli);
                    break;
                case 4:
//                    mostrarInfoCaballo();
                    break;
                case 5:
                	 System.out.print("Ingrese nombre cliente: ");
                     String nombre = sc.nextLine();//buscamos el cliente para meterle el paseo que vamos a crear
                	System.out.print("Ingrese el caballo: ");
                    String nombreCaballo = sc.nextLine();
                    System.out.print("Ingrese el dia: ");
                    int dia = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el mes: ");
                    int mes = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el anyo: ");
                    int anyo = sc.nextInt();
                    sc.nextLine();
                    reservarPaseo(clientes,caballos,nombre,nombreCaballo,dia,mes,anyo);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
    public static void crearCaballo( ArrayList<Caballo> caballos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del caballo: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el color del caballo: ");
        String color = sc.nextLine();

        Caballo caballo = new Caballo(nombre,color);
        caballos.add(caballo);
 
        System.out.println("Caballo creado correctamente.");
    }
  
    public static void crearCliente(  ArrayList<Cliente> clientes ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el número de apellido del cliente: ");
        String  apellidos= sc.nextLine();
        System.out.print("Ingrese el número de teléfono : ");
        int telefono = sc.nextInt();

        Cliente cliente = new Cliente(nombre,apellidos,telefono);
        clientes.add(cliente);
        System.out.println("Cliente creado correctamente.");
    }
    
    
    
    
    
    
    
	public static void reservarPaseo( ArrayList<Cliente> clientes, ArrayList<Caballo> caballos,String nombre,String nombreCaballo,int dia,int mes,int anyo) {
		
        Paseo x =new Paseo();//se crea el paseo con los atribitos correspondientes 
        x.setDia(dia);
        x.setMes(mes);
        x.setAnyo(anyo);
        
        
        for(Cliente cliente:clientes) {
        	if(cliente.getNombre().equalsIgnoreCase(nombre)) {
        		cliente.addPaseo(x);
        	}
        }
        for(Caballo caballo:caballos) {
        	if(caballo.getNombre().equalsIgnoreCase(nombreCaballo)) {
        		caballo.addPaseo(x);
        	}
        }
        
       
        
        

	}
	public static void mostrarInfoCliente( ArrayList<Cliente> clientes,String nombre) {
        
		for(Cliente i :clientes) {
			if(i.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(i.toString());
			}
		}
		
		
		
	}
}