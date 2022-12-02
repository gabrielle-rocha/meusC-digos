package atividadeJava;
import java.util.Scanner;
public class dobroTriplo {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		double n1, dobro, triplo;
		System.out.println("Digite um numero:");
		n1=in.nextDouble();
		dobro=n1*2;
		triplo=n1*3;
		System.out.println("o dobro é " +dobro+ "e o triplo é " +triplo);
		in.close();
		
	}

}
