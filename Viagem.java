package lista2gg;
import java.util.*;
public class algoritmo4 {
	public static void main (String [] args) {
		Scanner in= new Scanner (System.in);
		
		double valorTotal,destino, dias;
		System.out.println("Digite 1 para escolher Ilhabela ou 2 para escolher Fernando de Noronha:");
		destino= in.nextDouble();
		if (destino==1) {
		if (dias<=5) {
			valorTotal=dias*240.00;
			System.out.println("O valor a ser pago é R$"+valorTotal);
			else if (dias<=10) {
				valorTotal=(dias*220.00)+130.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}else {
				valorTotal=(dias*210.00)+150.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}else if(dias<=5) {
				valortTotal=(dias*400.00)+100.00;
				System.out.prinln("O valor a ser pago é R$"+valorTotal);
			}else if (dias<=10) {
				valorTotal=(dias*410.00)+150.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}else {
				valorTotal=(dias*420.00)+200.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}
		}
		}
	}
	in.close;
}
