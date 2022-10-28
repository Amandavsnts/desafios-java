package fundamentos.desafio;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		

		// %d = numeros inteiro -  %1f = numeros com ponto flutuantes
		// %s = letras/strings - %n = variação de quebra de linha 
	
		/* Scanner é a analise do que é forncecido
		 * System.in é a leitura da entrada, ele pede alguma informação
		 * diferente do System.out que te mostra a informação
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Antepenultimo contracheque: ");
		String ant1 = entrada.nextLine().replaceAll(",", ".");
		double numero1 = Double.parseDouble(ant1);
		
		System.out.print("\nPenultimo contracheque: ");
		String pen1 = entrada.nextLine().replaceAll(",", ".");
		double numero2 = Double.parseDouble(pen1);
		
		System.out.print("\nUltimo contracheque: ");
		String ult1 = entrada.nextLine().replaceAll(",", ".");
		double numero3 = Double.parseDouble(ult1);
		
		
		
		double media = (numero1 + numero2 + numero3) / 3;
		System.out.println("\nA media dos salarios e " + media);
		
		entrada.close();
	}
}
