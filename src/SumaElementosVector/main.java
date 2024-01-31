package SumaElementosVector;

public class main {
    public static void main(String[] args) {
        // Crear un vector con valores enteros
        int[] valores = {1, 2, 3, 4, 5};
        Vector vector1 = new Vector(valores);

        // Calcular la suma de los valores del vector
        int suma1 = vector1.suma();
        System.out.println("La suma del primer vector es: " + suma1);

        // Crear un vector con elementos
        Elemento[] elementos = {
            new Elemento(6),
            new Elemento(7),
            new Elemento(8),
            new Elemento(9),
            new Elemento(10)
        };
        Vector vector2 = new Vector(elementos);

        // Calcular la suma de los valores del segundo vector
        int suma2 = vector2.suma();
        System.out.println("La suma del segundo vector es: " + suma2);
    }
}
