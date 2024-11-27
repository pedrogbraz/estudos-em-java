package classsesEssenciais;

import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
        // Classes Essenciais
        // System.out.println("Test"); // Para saida de dados
        // System.err.println("Erro"); // Para erro

        // Utilizando System.err, System.out e System.in
        Scanner scan = new Scanner(System.in); // Instanciando Scanner
        System.out.println("Digite sua altura"); // Para entrada de dados
        double height = Double.parseDouble(scan.next()); // Leitura de dados

        System.out.println("Digite seu peso"); // Para entrada de dados
        double weight = Double.parseDouble(scan.next()); // Leitura de dados

        // Tratamento de erro
        try {
            double imc = weight / (height * height); // Calculando IMC
            System.out.printf("Seu IMC é de %.1f%n", imc); // Formatando para 1 casa decimal
        } catch (Exception e) {
            System.err.println("Erro ao calcular IMC: " + e.getMessage()); // Mensagem de erro
        }
    }
}
