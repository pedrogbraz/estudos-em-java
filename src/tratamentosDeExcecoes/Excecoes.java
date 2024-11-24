package tratamentosDeExcecoes;

import java.text.NumberFormat;
import java.util.*;

public class Excecoes {
	public static void main(String[] args) {
		// Tratamento de Exceções
		try {
			Double valor = Double.valueOf("1.75");
			Double vd = valor.doubleValue();
			System.out.println(vd);
		} catch (NumberFormatException e) {
			System.err.println("Número inválido");
		}


	}
}
