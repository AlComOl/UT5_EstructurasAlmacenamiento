import java.util.Scanner;

public class prueba{
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        int [] numeroCalificaciones = new int[11];

        int nota;

        System.out.println("Dame una nota(entre 0 a 10)");
        nota = tec.nextInt();

        while (nota>=0&&nota<=10) {

            numeroCalificaciones[nota]++;

            System.out.println("Dame una nota(entre 0 a 10)");
            nota = tec.nextInt();
        }

        for(int i=0; i<numeroCalificaciones.length; i++){
            System.out.println("Numero " + i + " se repite: " + numeroCalificaciones[i]);
        }
    }
}