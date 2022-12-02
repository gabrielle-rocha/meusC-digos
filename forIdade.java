public class forIdade {
	public static void main (String[] args) {
		 Scanner in=new Scanner (System.in);
		 int i;
		 double idVelho, idNovo, id, aA, aN;
		 idVelho = -1000;
		 idNovo = 1000;
		 System.out.println("Digite o ano atual");
		 aA = in.nextDouble();
		 System.out.println(" ");
		 for (i=1; i<=5; i++) {
			 System.out.println("Digite o ano de nascimento" +i+ ":");
			 aN = in.nextDouble();
			 id = aA- aN;
			 System.out.println("Sua idade �" +id);
			 System.out.println(" ");
			 if (id> idVelho){
				 idVelho = id;
			 } 
			 if(id<idNovo) {
				 idNovo = id;
			 }
		 }
		 System.out.println("O mais veho tem" +idVelho+ "anos e o mais novo tem" +idNovo+ "anos");
	}

}
