import java.util.*;

public class prueba {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int vecinos = 10;
        int Voto[] = new int[vecinos];

        for (int i = 0; i < 10; i++) {
            System.out.println("¿A que vecino vas a votar?");
            System.out.println("1. Mark  |  2. Axel   |  3. Roberto");
            System.out.println("4. Marta |  5. Tilin  |  6. Vanesa");
            System.out.println("7. David |  8. Sarina |  9. Mai");
            System.out.println("10. Maria");
            int eleccion = tec.nextInt();


            while (eleccion > 10 || eleccion < 0) {
                eleccion = tec.nextInt();
            }

            switch (eleccion) {
                case 1:
                    Voto[0] += 1;
                    break;
                case 2:
                    Voto[1] += 1;
                    break;
                case 3:
                    Voto[2] += 1;
                    break;
                case 4:
                    Voto[3] += 1;
                    break;
                case 5:
                    Voto[4] += 1;
                    break;
                case 6:
                    Voto[5] += 1;
                    break;
                case 7:
                    Voto[6] += 1;
                    break;
                case 8:
                    Voto[7] += 1;
                    break;
                case 9:
                    Voto[8] += 1;
                    break;
                case 10:
                    Voto[9] += 1;
                    break;
            }
        }

        int presidente = 0;
        int mayor = 0;
        int presi[] = new int[10];
        for (int i = 0; i < vecinos; i++) {
            if (Voto[i] > mayor) {
                mayor = Voto[i];
                presidente = i + 1;
            }
        }
       System.out.println("El nuevo presidente es el apartamento " + presidente + " con " + mayor + " votos");

    }
}