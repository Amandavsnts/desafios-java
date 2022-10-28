package fundamentos.desafio;

public class DesafioConversaoTemperaturaCelcius {

	public static void main(String[] args) {
		
		//Formula (°F - 32) * 5/9 = °C 
		// (c*9/5)+32 
		// 5/9 da 0 pq o resultado e quebrado de um calculo de inteiros
		// para que a conta saia correta é necessario fazer 5/9.0 ou 5.0/9 ou 5.0/9.0
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double F = 65;
		double celsius = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado e " + celsius + " C"  );
		
		F = 185;
		celsius = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado e " + celsius + " C"  );
		
		F = 96;
		celsius = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado e " + celsius + " C");
		
		F = 15;
		celsius = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado e " + celsius + " C");
		
		F = 110;
		celsius = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado e " + celsius + " C");
		
		final double MULT = 5.0/9.0;
		final double SUB = 32;
		
		double FA = 81;
		double cel = (FA - SUB) * MULT;
		
		System.out.println("O resultado e " + cel + " C");
		
		final double fator1 = 5.0/9.0;
		final double ajuste1 = 32;
		
		double f1 = 52;
		double celsius1 = (f1 - ajuste1) * fator1;
		
		System.out.println("O resultado e " + celsius1 + " C");
		
		final double fator2 = 5.0/9.0;
		final double ajuste2 = 32;
		
		double f2 = 29;
		double celsius2 = (f2 - ajuste2) * fator2;
		
		System.out.println("O resultado e" + celsius2 + " C");		
	}
}
