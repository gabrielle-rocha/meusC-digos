package laçosClassicos;
import java.util.*;
public class fibonacci {
	public static void main (String [] args) {
		Scanner in=new Scanner (System.in);
		int i, a, s, r, n;
		a = 0;
		s = 1;
		System.out.println("Digite o número desejado");
		n=in.nextInt();
		for (i= 1; i<=n; i++) {
			r = a+s;
			s = a;
			a = r;
			System.out.println(r);
		}
		i++;
	}
}































































































,,,,,,,,,,,,,,,,,,,,,
,,,,,,,,,,,,,,,,,,,
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,