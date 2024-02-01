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
public class Vector {

    private Tabla t;

//    public Vector() {
//        t = new Tabla();
//    }

    public Vector(int i) {
        t = new Tabla(i);
    }

    public void mostrar() {
        t.mostrar(); // Corrección: Llamar al método mostrar() de la Tabla
    }


    public Integer suma() {
        int sum = 0;
        for (int i = 0; i < t.tamanyo(); i++) { // Corrección: Utilizar t.tamanyo()
            Integer valor = t.getValor(i);
            if (valor != null) {
                sum += valor;
            }
        }
        return sum;
    }

}
