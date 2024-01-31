package SumaElementosVector;

public class Vector {
    private Tabla tabla;

    public Vector(int[] valores) {
        this.tabla = new Tabla(valores);
    }

    public Vector(Elemento[] elementos) {
        this.tabla = new Tabla(convertir(elementos));
    }

    private int[] convertir(Elemento[] elementos) {
        int[] valores = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            valores[i] = elementos[i].getValor();
        }
        return valores;
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < tabla.longitud(); i++) {
            suma += tabla.get(i).getValor();
        }
        return suma;
    }
}
