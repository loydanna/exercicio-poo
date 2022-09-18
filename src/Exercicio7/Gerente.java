package Exercicio7;

public class Gerente extends Funcionarios {

	
	void bonificacao(double salario) {
		super.bonificacao(salario);
		System.out.println("O seu salario base mais bonificação de gerente é: " + (salario+=10000.00));
	}
}
