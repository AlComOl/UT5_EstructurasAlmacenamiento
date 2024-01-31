package SumaElementosVector;

public class Tabla {
    private Elemento[] elementos;

    public Tabla(int[] valores) {
        elementos = new Elemento[valores.length];
        for (int i = 0; i < valores.length; i++) {
            elementos[i] = new Elemento(valores[i]);
        }
    }

    public Elemento get(int indice) {
        return elementos[indice];
    }

    public int longitud() {
        return elementos.length;
    }
}
