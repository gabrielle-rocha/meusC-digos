package decisao;
import java.util.Scanner;
public class apostila1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double s;
		System.out.println ("Escreva o sal�rio");
		s=in.nextDouble();
		if(s>=954) {
		  System.out.println ("acima");
		}else {
			System.out.println ("Abaixo");
		}
	}
}
