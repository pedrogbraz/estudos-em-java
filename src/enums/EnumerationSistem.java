package enums;

public class EnumerationSistem {
	public static void main(String[] args) {
		for (BrazilianStates state : BrazilianStates.values()) {
			System.out.println(state.getName());
		}
	}
}
