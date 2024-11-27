package scanners;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        String firstName = null;
        String lastName = null;
        Integer age = null;

        // Simulando uma linha existente em um arquivo txt
        String stringArquiveLine = "Pedro;Gontijo Braz;17";
        Scanner scan = new Scanner(stringArquiveLine);
        scan.useDelimiter(";"); // Delimitando o que eu quero ler, ou seja, o ";

        // Conhecendo novos recursos
        int i = 0;
        while (scan.hasNext()) { // Conceito de loop
            if (i == 0) {
                firstName = scan.next();
            } else if (i == 1) {
                lastName = scan.next();
            } else if (i == 2) {
                age = Integer.parseInt(scan.next());
            }

            i++;
        }

        System.out.printf("Meu nome é %s %s e tenho %d anos%n", firstName, lastName, age);
    }
}
