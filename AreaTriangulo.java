package projectAlgoritmos;
import java.util.Scanner;
public class AreaTriangulo {
   public static void main (String[] args) {
	   Scanner in=new Scanner(System.in);
	   double a, b, area;
	   System.out.println ("Digite um n�mero:");
	   a=in.nextDouble();
	   System.out.println("Digite outro n�mero:");
	   b=in.nextDouble();
	   area=a*b;
	   System.out.println("o resultado de " +a+ " e " +b+ " � igual a " +area);
	   in.close();
   }
}
