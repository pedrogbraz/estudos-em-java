package estruturasDeRepeticoes;

public class Estruturas {
	public static void main(String[] args) {
		// For
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// While
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// Do While
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		// For Each
		String[] alunos = {"Pedro", "Diogo", "Nicolas", "João", "Paloma"};
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
