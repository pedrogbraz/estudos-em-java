package instancesAndConstructors;

public class Sistem {
	public static void main(String[] args) {
		Clients pedro = new Clients("Pedro Gontijo Braz");
		pedro.LimitCreditSolicited(10.0);
		pedro.comprar(9.0);
		System.out.println(pedro.limitCredit);
	}
}
