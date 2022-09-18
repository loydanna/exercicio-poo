package Exercicio1;

public class Main {
	
	public static void main(String[] args) {
		Veículo carro = new Veículo();
		carro.acelerar(20);
		carro.abastecer(30);
		carro.abastecer(30);
		carro.abastecer(30);
		carro.frear(40);
		carro.pintar("preto");
		carro.ligar(false);
		carro.ligar(true);
		carro.desligar(true,0);
		carro.desligar(false,0);
		carro.desligar(true,20);
	}

}
