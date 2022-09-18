package Exercicio7;

public class Supervisor extends Funcionarios {

	
	void bonificacao(double salario) {
		super.bonificacao(salario);
		System.out.println("O seu salario base mais bonificação de Supervisor é: " + (salario+=5000.00));
	}
}
