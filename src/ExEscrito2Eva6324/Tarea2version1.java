package ExEscrito2Eva6324;
import java.util.*;

public class Tarea2version1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String municipio;
		float media=0, sum=0;
		final int MAX=365;
		int n=0,continuar=0;
		String fecha[]=new String[MAX];
		float pluviometria[]=new float[MAX];
		
		System.out.println("Introduce Localidad");
		municipio=sc.next();
		
		
		System.out.println("Dame la pluviosidad dd/mm/aa dd.dd");
			while(continuar!=2){
				System.out.println("Introduce fecha");
				fecha[n]=sc.next();
			
				System.out.println("Litros lluvia diarios");
				pluviometria[n]=sc.nextFloat();
				
				sum=+pluviometria[n];
				n++;
				System.out.println("Quieres continuar 1- Si 2_-No");
				continuar=sc.nextInt();
			}
		
			System.out.println(municipio);
			media=sum/MAX;
			
			for(int i=0;i<n;i++) {
				if(pluviometria[i]<media) {
					System.out.println(fecha[i]);
				}
			}
			sc.close();
	}

}
