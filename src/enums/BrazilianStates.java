package enums;

public enum BrazilianStates {
	AC ("Acre"),
	AL ("Alagoas"),
	AM ("Amazonas"),
	BA ("Bahia"),
	CE ("Ceara"),
	DF ("Distrito Federal"),
	ES ("Espirito Santo"),
	GO ("Goias"),
	MA ("Maranhao"),
	MG ("Minas Gerais"),
	MS ("Mato Grosso do Sul"),
	MT ("Mato Grosso"),
	PA ("Para"),
	PB ("Paraiba"),
	PE ("Pernambuco"),
	PI ("Piaui"),
	RJ ("Rio de Janeiro"),
	RN ("Rio Grande do Norte"),
	RS ("Rio Grande do Sul"),
	RO ("Rondonia"),
	RR ("Roraima"),
	SC ("Santa Catarina"),
	SP ("Sao Paulo"),
	SE ("Sergipe"),
	TO ("Tocantins");

	private String name;
	private BrazilianStates (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
