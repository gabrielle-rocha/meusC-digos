package projectAlgoritmos;
import java.util.Scanner;
public class AreaTriangulo {
   public static void main (String[] args) {
	   Scanner in=new Scanner(System.in);
	   double a, b, area;
	   System.out.println ("Digite um número:");
	   a=in.nextDouble();
	   System.out.println("Digite outro número:");
	   b=in.nextDouble();
	   area=a*b;
	   System.out.println("o resultado de " +a+ " e " +b+ " é igual a " +area);
	   in.close();
   }
}
