package projectAlgoritmos;
import java.util.Scanner;
public class idadeAno {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double aN, aAtual, idade;
		System.out.println("digite um n�mero:");
		aN= in.nextDouble();
		System.out.println("digite outro n�mero:");
		aAtual= in.nextDouble();
		idade=aAtual-aN;
		System.out.println(" O resultado de " +aAtual+ " e " +aN+ " � igual a " +idade);
		in.close();
		
	}
	
}
