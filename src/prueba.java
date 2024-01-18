import java.util.Scanner;

public class prueba {
    /*
     * @author: Francisco Verdeguer García
     * @version: 17/01/24
     * @description: Realiza un programa que lee 20 números reales y saca por pantalla aquellos que sean mayores que la media.
    */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        final int CANTNUMEROS=20;
        int numeros[]= new int[CANTNUMEROS];

        int n;
        double sumaValores=0.0, media;
        
        System.out.println("Introduce numeros");
        
        for(int i=0; i< CANTNUMEROS;i++) {
            n=tec.nextInt();
            numeros[i]=n;
            sumaValores+=n;
        }

        media=sumaValores/CANTNUMEROS;
        
        System.out.println(sumaValores);
        
        System.out.println(media);
        for(int i=0; i< CANTNUMEROS;i++) {
            if(numeros[i]>media)
                System.out.print(numeros[i] + " ");
        }


        tec.close();
    }
}