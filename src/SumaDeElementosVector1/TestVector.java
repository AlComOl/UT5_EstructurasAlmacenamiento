package SumaDeElementosVector1;
/**************************************************
 * Autor: Álvaro Comenge
 * 
 * Entornos de Desarrollo
 * 
 * Version Emiliano Suma de elementos de un Vector
 * 
 * Fecha 1/01/24
 *
 ***************************************************/
public class TestVector {

    public static void main(String[] args) {
        // Crear un vector con 5 elementos
        Vector vector = new Vector(5);
        
        System.out.println("Suma de elementos: " + vector.suma());
        
        vector.mostrar();
    }
}
