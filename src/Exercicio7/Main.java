package Exercicio7;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente1= new Gerente();
		gerente1.bonificacao(1100.00);
		
		Supervisor supervisor1= new Supervisor();
		supervisor1.bonificacao(1100.00);
		
		Vendedor vendedor1= new Vendedor();
		vendedor1.bonificacao(1100.00);
		
	}
}
