package lista2gg;
import java.util.*;
public class algoritmo3 {
	public static void main (String[] args) {
		Scanner in= new Scanner (System.in);
		double n1, n2, m, m2, ex;
		System.out.println ("Digite a primeira nota:");
		n1=in.nextDouble();
		System.out.println ("Digite a segunda nota:");
		n2=in.nextDouble();
		m=(n1+n2)/2;
		if (m>=6) {
			System.out.println("Aprovado");
		} else if (m<3) {
			System.out.println("Reprovado");
		}else if (m>=3 && m<6) {
			System.out.println("Está em exame");
		
		System.out.println ("Escreva a nota do exame");
		ex=in.nextDouble ();
		m2=m+ex;
		if (m2<6) {
			System.out.println ("reprovado");
		}
		else
			if(m2>6) {
				System.out.println("aprovado");
			}
				}
		in.close();
}
}
