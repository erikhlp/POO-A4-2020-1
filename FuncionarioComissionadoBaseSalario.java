package poo;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
	private Double salario;
	
	public FuncionarioComissionadoBaseSalario(String nome, String cpf, Double vendasBrutas,
			Double salario) {
		super(nome, cpf, vendasBrutas);
		this.salario = salario;
	}

	public Double getRendimentos(Double rendimentos) {
		return this.salario + rendimentos;
	}
	
}
