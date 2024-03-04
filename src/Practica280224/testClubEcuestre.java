package Practica280224;
import java.util.*;

public class testClubEcuestre {

	private static ArrayList<Caballo> caballos = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
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
                    crearCaballo();
                    break;
                case 2:
                    crearCliente();
                    break;
                case 3:
                    mostrarInfoCliente();
                    break;
                case 4:
//                    mostrarInfoCaballo();
                    break;
                case 5:
                    reservarPaseo();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
    public static void crearCaballo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del caballo: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el color del caballo: ");
        String color = sc.nextLine();

        Caballo caballo = new Caballo(nombre,color);
        caballos.add(caballo);
 
        System.out.println("Caballo creado correctamente.");
    }
  
    public static void crearCliente() {
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
    
    
    
    
    
    
    
	public static void reservarPaseo() {
        Scanner sc = new Scanner(System.in);
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
	public static void mostrarInfoCliente() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre cliente: ");
        String nombre = sc.nextLine();
        
		for(Cliente i :clientes) {
			if(i.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(i.toString());
			}
		}
		
		
		
	}
}