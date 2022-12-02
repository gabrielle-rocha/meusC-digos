package lacoenquanto;
import java.util.*;
public class tabuada {
	public static void main (String [] args) {
		Scanner in= new Scanner (System.in);
		int i=1, num, resultado;
		System.out.println("Digite um número e obtenha a tabuada");
		num=in.nextInt();
		while (i<=10) {
			resultado= num*i;
			System.out.println (num+ "x" +i+ "=" +resultado);
			i++;
		}
	}
}
