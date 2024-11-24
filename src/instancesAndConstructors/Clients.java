package instancesAndConstructors;

public class Clients {
	String name;
	Double limitCredit = 10.0;

	public void LimitCreditSolicited(Double valueSolicited) {
		limitCredit = valueSolicited;
	}

	public void comprar(Double productValue) {
		limitCredit -= productValue;
	}

	public Clients (String informedName) {
		this.name = informedName;
	}
}
