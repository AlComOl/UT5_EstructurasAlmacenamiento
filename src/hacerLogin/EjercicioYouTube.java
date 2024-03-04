package hacerLogin;
import java.util.*;
//la contraseña será válida si contiene al menos un carácter especial ( .oh -). 
//Y el usuario será válido si no contiene letras mayúsculas ni caracteres especiales.
public class EjercicioYouTube {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();
        ArrayList<String> contraseñas = new ArrayList<>();

        // Introduce usuarios y contraseñas
        System.out.println("Introduce nombre de usuario (Escribe fin para terminar)");
        String usuario = sc.nextLine().trim();
        
        while (!usuario.equalsIgnoreCase("fin")) {
            if (compruebaUsuario(usuario)) {
                usuarios.add(usuario);
                System.out.println("Introduce contraseña:");
                String contraseña = sc.nextLine().trim();
                while (!compruebaContraseña(contraseña)) {
                    System.out.println("Contraseña no válida. Inténtalo de nuevo:");
                    contraseña = sc.nextLine().trim();
                }
                contraseñas.add(contraseña);
            } else {
                System.out.println("Nombre de usuario no válido. Inténtalo de nuevo.");
            }
            System.out.println("Introduce nombre de usuario (Escribe fin para terminar)");
            usuario = sc.nextLine().trim();
        }

        // Mostrar resultados
        System.out.println("Usuarios y Contraseñas Aceptados " + usuarios.size() + ":");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("Usuario: " + usuarios.get(i) + ", Contraseña: " + contraseñas.get(i));
        }
    }

    /*****************************************************
     * 
     * @param usuario como parametro 
     * @return para comprobar los usuarios recorriendo el array 
     * list con el for each char a char
     ******************************************************/
    public static boolean compruebaUsuario(String usuario) {
        // Validar que el usuario no tenga letras mayúsculas ni caracteres especiales
        for (char c : usuario.toCharArray()) {
            if (Character.isUpperCase(c) || !Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /*****************************************************
     * 
     * @param contraseña como parametro 
     * @return para comprobar las contraseñas
     ******************************************************/
    public static boolean compruebaContraseña(String contraseña) {
        // Validar que la contraseña tenga al menos un carácter especial
        boolean contieneCaracterEspecial = false;
        for (char c : contraseña.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-') {
                contieneCaracterEspecial = true;
                break;
            }
        }
        return contieneCaracterEspecial;
    }
}

