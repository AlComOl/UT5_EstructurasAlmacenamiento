import java.util.Scanner;

public class prueba {
    /*
     * @author: Francisco Verdeguer García
     * @version: 19/01/24
     * @description:Sobre el mismo programa anterior hacer que imprima los siguientes datos estadísticos: media aritmética, moda, 
        mediana y desviación típica.
     */

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numeros[]= {1,2,3,4,5,6,7,8,9,10};


        double mediaAritmetica= calcularMediaAritmetica(numeros);
        int moda= calcularModa(numeros);
        double mediana = calcularMediana(numeros);
        double desviacion= calcularDesviacion(numeros);
        System.out.println("La media es "  + mediaAritmetica + "\nLa moda es " + moda + "\nLa mediana es " + mediana + "\nLa desviacion es " + desviacion);


        tec.close();
    }

    public static double calcularMediaAritmetica(int numeros[]){
        double mediaAritmetica;
        int suma=0;
        for (int i = 0; i<numeros.length; i++) {
            suma+=numeros[i];
        }
        mediaAritmetica=suma/numeros.length;
        return mediaAritmetica;
    }

    public static int calcularModa(int numeros[]){
        int moda=0, cont=0, contMayor=0;

        for (int i = 0; i<numeros.length; i++) {
            for(int j = 0; j< numeros.length; j++){
                if(numeros[j]==numeros[i]){
                    cont++;
                }
            }

            if(cont>contMayor){
                contMayor=cont;
                moda=numeros[i];
            }
        }
        return moda;
    }

    public static double calcularMediana(int numeros[]){
        double mediana;

        if(numeros.length%2==0){
            mediana=((double)numeros.length/2 + ((double)numeros.length/2 +1))/2;
        }else{
            mediana=numeros.length/2;
        }

        return mediana;
    }

    public static double calcularDesviacion(int []numeros){
        double resta, suma=0, media=calcularMediaAritmetica(numeros);
        
        for (int i = 0; i<numeros.length; i++) {
            suma+=numeros[i];
        }
        resta= suma-media;
        return resta;
    }
}