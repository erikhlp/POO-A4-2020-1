package poo;

public class FuncionarioTeste {

	public static void main(String[] args) {
		FuncionarioComissionadoBaseSalario salario = new FuncionarioComissionadoBaseSalario("Carlos", "928173231", 10.00, 1000.00); 
		
		System.out.println(salario.getRendimentos(salario.getRendimentos()));
	}

}
