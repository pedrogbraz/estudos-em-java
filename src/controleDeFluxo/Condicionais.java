package controleDeFluxo;

public class Condicionais {
	public static void main(String[] args) {
		int idade = 17;

		// If, Else, Else If
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else if (idade > 25) {
			System.out.println("Adulto");
		} else {
			System.out.println("Jovem");
		}

		// Switch
		int opcao = 1;
		switch (opcao) {
			case 1:
				System.out.println("Primeira opção");
				break;
			case 2:
				System.out.println("Segunda opção");
				break;
			default:
				System.out.println("Nenhuma opção");
				break;
		}
	}
}
