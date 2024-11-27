package operadores;

public class TiposDeOperadores {
	public static void main(String[] args) {
		// Tipos de Operadores

		// 1. Operadores Aritméticos
		int a = 10;
		int b = 5;

		System.out.println("Soma: " + (a + b));
		System.out.println("Subtracao: " + (a - b));
		System.out.println("Multiplicacao: " + (a * b));
		System.out.println("Divisao: " + (a / b));
		System.out.println("Modulo: " + (a % b));

		// 2. Operadores de Atribuição
		int c = 10;
		c += 5;
		System.out.println("Atribuição: " + c);

		// 3. Operadores Relacionais
		int d = 10;
		int e = 5;

		System.out.println("Maior: " + (d > e));

		// 4. Operadores Lógicos
		boolean f = true;
		boolean g = false;

		System.out.println("And: " + (f && g));
		System.out.println("Or: " + (f || g));
		System.out.println("Negação: " + !f);

		// 5. Operadores de Incremento e Decremento
		int h = 10;

		System.out.println("Incremento: " + (++h));
		System.out.println("Decremento: " + (--h));

		// 6. Operadores de Concatenação
		String i = "Hello ";
		String j = "World";

		System.out.println("Concatenação: " + (i + j));

		// 7. Operadores de Comparação
		int k = 10;
		int l = 10;

		System.out.println("Igual: " + (k == l));
		System.out.println("Diferente: " + (k != l));
		System.out.println("Maior: " + (k > l));
		System.out.println("Maior ou Igual: " + (k >= l));
	}
}
