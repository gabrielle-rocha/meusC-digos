import java.util.*;
public class doWhileIdade {
	public static void main (String [] args) {
		Scanner in= new Scanner (System.in);
		int i=1;
		double at,an,id ;
		do {
			System.out.println("Digite o ano atual");
			at = in.nextDouble();
			System.out.println("Digite o ano de nascimento");
			an = in.nextDouble();
			id= (at-an);
			System.out.println("Sua idade é "+id+" anos");
			if (id<=18) {
				System.out.println("menor de idade");
			}	else {
				System.out.println("maior de idade");
			}
			System.out.println(" ");
			i++;
		} while (i<=18);
	}
}



 





































































































