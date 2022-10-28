package fundamentos.desafio;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho na Terça (V ou F)
		//Trabalho na Quinta (V ou F)
		//Se apenas um trabalho der certo apenas uma TV de 32
		//Se os dois derem certo uma TV de 50
		//E nos dois casos a familia vai tomar sorvete e negação logica no sorvete
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprou Sorvete\"?" + comprouSorvete);
		
	}
	
}
