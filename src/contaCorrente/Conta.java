package contaCorrente;

public class Conta {
	long numeroDaConta;
	short numeroDaAgencia;
	String nomeDoCliente;
	String dataDeNascimento;
	double saldoDaConta;

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldoDaConta += valor;
			System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldoDaConta);
		} else {
			System.out.println("Valor de depósito inválido!");
		}
	}

	public void sacar(double valor) {
		if (valor > 0 && valor <= saldoDaConta) {
			this.saldoDaConta -= valor;
			System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoDaConta);
		} else {
			System.out.println("Valor de saque inválido ou saldo insuficiente.");
		}
	}

	public void transferir(double valor, Conta contaDestino) {
		if (valor > 0 && valor <= saldoDaConta) {
			this.saldoDaConta -= valor;
			contaDestino.saldoDaConta += valor;
			System.out.println("Transferência realizada com sucesso. Novo saldo: " + saldoDaConta);
		} else {
			System.out.println("Valor de transferência inválido ou saldo insuficiente.");
		}
	}

	public void cancelarConta() {
		System.out.println("Conta de " + nomeDoCliente + " cancelada com sucesso!");
	}

	public void consultarSaldo() {
		System.out.println("Saldo atual da conta de " + nomeDoCliente + " é: " + saldoDaConta);
	}
}
