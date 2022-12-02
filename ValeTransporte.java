package atividadeJava;
import java.util.Scanner;
public class salario {
	public static void main (String[] Args) {
		Scanner in=new Scanner (System.in);
		double salario,vt;
		System.out.println("Digite um número:");
		salario=in.nextDouble();
		vt=salario/100*6;
		System.out.println(" O desconto do vale transporte é de " +vt);
		in.close();
	}

}
