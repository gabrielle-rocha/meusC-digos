package projectAlgoritmos;
import java.util.Scanner;
public class doisValoresInteiros {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
		double a,b,c;
		System.out.println ("Digite um n�mero:");
		a=in.nextDouble();
		System.out.println("Digite outro n�mero:");
		b=in.nextDouble();
		c= a;
		a= b;
		b= a; 
		System.out.println(" o valor de " +a+ " e " +b);
		in.close(); 
		
		
	}

}
