package gettersAndSetters;

public class Alunos {
	private String nome = "Pedro Gontijo Braz";
	private Integer idade = 17;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		if (idade < 0)
			throw new IllegalArgumentException("Valor da idade está incorreto!"); // Verificar se idade é maior do que zero
		this.idade = idade;
	}
}
