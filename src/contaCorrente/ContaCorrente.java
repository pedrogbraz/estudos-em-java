package contaCorrente;

public class ContaCorrente {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numeroDaConta = 123456;
		conta1.numeroDaAgencia = 003;
		conta1.nomeDoCliente = "Pedro Gontijo Braz";
		conta1.dataDeNascimento = "27/08/2007";

		Conta conta2 = new Conta();
		conta2.numeroDaConta = 246899;
		conta2.numeroDaAgencia = 002;
		conta2.nomeDoCliente = "Alexandre Cesar Braz";
		conta2.dataDeNascimento = "15/06/1972";

		conta1.depositar(1000);
		conta1.consultarSaldo();
		conta1.transferir(500, conta2);

		conta1.consultarSaldo();
		conta2.consultarSaldo();
	}
}
