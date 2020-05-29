package poo;

public class FuncionarioComissionado {
	private String nome;
	private String cpf;
	private Double taxaComissao;
	private Double vendasBrutas;
	
	public FuncionarioComissionado(String nome, String cpf, Double vendasBrutas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.taxaComissao = 0.5*vendasBrutas;
		this.vendasBrutas = vendasBrutas;
	}

	public Double getRendimentos() {
		return  this.taxaComissao;
	}
	
}
