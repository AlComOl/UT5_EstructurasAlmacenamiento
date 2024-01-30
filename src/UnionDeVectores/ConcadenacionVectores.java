package UnionDeVectores;
import java.util.*;
public class ConcadenacionVectores {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos_v1=0,pos_v2=0,pos_v3=0;
		int Numpos1=7;
		int Numpos2=7;
		
		int v1[]= {10,20,30,40,50,60,70};
		int v2[]= {80,90,125,235,345,465,575};
		int v1v2[]=new int [v1.length+v2.length];
//CONCADENACION CON WHILE**********SERIA MEJOR HACERLO ASI PORQUE NO TENEMOS UNA VARIBLE BOOLEANA****************************************************
//		while(pos_v3<v1.length) {
//			v1v2[pos_v3]=v1[pos_v1];
//			pos_v3++;
//			pos_v1++;
//		}
//		
//		while(pos_v3<v1v2.length) {
//			v1v2[pos_v3]=v2[pos_v2];
//			pos_v3++;
//			pos_v2++;
//		}
//	
//		for (int i=0;i<v1v2.length;i++) {
//			System.out.println(v1v2[i]);
//		}
		
//		CONCADENACION CON FOR******************************************************************************
		
		for ( int i = 0;i<v1.length;i++) {
			v1v2[i]=v1[i];
		}
		for ( int i = 0;i<v2.length;i++) {
			v1v2[i+v1.length]=v2[i];
		}
		
		for(int i=0;i<v1v2.length;i++) {
			System.out.print(v1v2[i]+" ,");
		}
	}

}
