package PracticaCadenasyArraylist;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        
        String[] palabras = obtenerPalabras(frase);
        mostrarPalabras(palabras);
    }
    
    public static String[] obtenerPalabras(String frase) {
        final int TAMANO_MAXIMO = 100; // Supongamos un máximo de 100 palabras
        
        String[] vectorPalabras = new String[TAMANO_MAXIMO];
        int indiceVector = 0;
        StringBuilder palabra = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            
            // Si el caracter actual es un separador (espacio, coma o punto)
            if (caracter == ' ' || caracter == ',' || caracter == '.') {
                // Si la palabra tiene al menos un caracter, la añadimos al vector de palabras
                if (palabra.length() > 0) {
                    vectorPalabras[indiceVector++] = palabra.toString();
                    palabra.setLength(0); // Reseteamos la palabra
                }
            } else {
                // Si no es un separador, añadimos el caracter a la palabra actual
                palabra.append(caracter);
            }
        }
        
        // Añadimos la última palabra si existe
        if (palabra.length() > 0) {
            vectorPalabras[indiceVector++] = palabra.toString();
        }
        
        // Creamos un nuevo array con el tamaño correcto para devolver
        String[] resultado = new String[indiceVector];
        System.arraycopy(vectorPalabras, 0, resultado, 0, indiceVector);
        return resultado;
    }
    
    public static void mostrarPalabras(String[] palabras) {
        System.out.println("Las palabras que conforman la frase son:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(i + "-> " + palabras[i]);
        }
    }
}