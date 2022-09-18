package Exercicio7;

public class Vendedor extends Funcionarios {
	
	

	void bonificacao(double salario) {
		super.bonificacao(salario);
		System.out.println("O seu salario base mais bonificação de Vendedor é: " + (salario+=3000.00));
	}

}
