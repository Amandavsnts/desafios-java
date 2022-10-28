package fundamentos.desafio;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		//int a = 2 + 3 * 4;
		//int b = (int)Math.pow(a, 3);
		//double c = Math.pow(a, 3);
		
		//System.out.println(b);
		//System.out.println(c);
		
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2);
		
		
		int c = 3 * 2;
		int d = b / c;
		
		
		int e = (1 - 5) * (2 - 7);
		int f = e / 2;
		int g = (int) Math.pow(f, 2);

		
		int h = d - g;
		int i = (int) Math.pow(h, 3);

		
		int j = 10;
		int k = (int) Math.pow(j, 3);

		
		int l = i / k;
		
		System.out.println("O resultado e " + l + ".");
		
	}
}
