package lacoenquanto;
import java.util.*;
public class alturajp {
	public static void main (String [] args) {
		Scanner in= new Scanner (System.in);
		int i=1;
		double joao, pedro;
		pedro= 1.45;
		joao= 1.34;
		while (pedro>joao) {
			pedro=pedro+0.02;
			joao=joao+0.025;
			i++;
		}
		System.out.println ("Demorou " +i+ " anos para João ficar mais alto que Pedro");
	}
	
}

