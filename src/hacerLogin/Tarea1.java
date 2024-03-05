package Practica280224;
import java.util.*;

public class Tarea1 {

	

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
//	        Array list de correos 
	        ArrayList<String> correosElectronicos = new ArrayList<>();

	        // Introduce correos electronicos correos electrónicos
	        System.out.println("Introduce correos electrónicos(Escribe fin para terminar)");
	        String correo = sc.nextLine();
	        
	        
	        
	        while (!correo.equalsIgnoreCase("fin")) {
	            correosElectronicos.add(correo);
	            correo = sc.nextLine();
	        }

	        // Array list de validacion
	        ArrayList<String> correosbien = new ArrayList<>();
	        ArrayList<String> correosmal = new ArrayList<>();
	        for (String c : correosElectronicos) {
	            if (compruebaCorreo(c)) {
	            	correosbien.add(c);
	            } else {
	            	correosmal.add(c);
	            }
	        }

	        // Mostrar resultados
	        System.out.println("Correos Aceptados " + correosbien.size()/*nuemero de correos*/ + ":");
	        for (String c : correosbien) {
	            System.out.println(c);
	        }

	        System.out.println("Correos No Aceptados " + correosmal.size() + ":");
	        for (String c : correosmal) {
	            System.out.println(c);
	        }
	    }
	    
	    
	    public static boolean compruebaCorreo(String correo) {
	        String division[] = correo.split("@");

	        // Variable para almacenar el resultado de la validación
	        boolean esCorreoValido = true;

	        if (division.length != 2) {
	            esCorreoValido = false;
	        } else {
	            String nombreUsuario = division[0];
	            String dominio = division[1];

	            // Validar parte del nombre de usuario
	            for (char c : nombreUsuario.toCharArray()) {
	                if (!Character.isLetterOrDigit(c) && c != '.' && c != '_') {
	                    esCorreoValido = false;
	                }
	            }

	            // Validar parte del dominio
	            boolean puntoEnDominio = false;
	            for (char c : dominio.toCharArray()) {
	                if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
	                    esCorreoValido = false;
	                }
	                if (c == '.') {
	                    puntoEnDominio = true;
	                }
	            }

	            if (!puntoEnDominio) {
	                esCorreoValido = false;
	            }
	        }

	        // No hay return aquí, solo se retorna la variable al final
	       return esCorreoValido;
	    }
	    
	    
	    /*****************************************************
	     * 
	     * @param correo como parametro 
	     * @return para comprobar los correos recorriendo el arrauy 
	     * list con el for each char a char
	     ******************************************************/
//	    public static boolean compruebaCorreo(String correo) {
//	        String partes[] = correo.split("@");//separamos en 2 partes y lo meto en el array
//	        if (partes.length != 2) {
//	            bol false;
//	        }
//	        String nombreUsuario = partes[0];
//	        String dominio = partes[1];
//
//	        // Validar parte del nombre de usuario
//	        for (char c : nombreUsuario.toCharArray()) {
//	            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_') {
//	                return false;
//	            }
//	        }
//
//	        // Validar parte del dominio
//	        boolean puntoEnDominio = false;
//	        for (char c : dominio.toCharArray()) {//con el mismo procedimiento
//	            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
//	                return false;
//	            }
//	            if (c == '.') {
//	                puntoEnDominio = true;
//	            }
//	        }
//
//	        return puntoEnDominio;
//	    }
}
	