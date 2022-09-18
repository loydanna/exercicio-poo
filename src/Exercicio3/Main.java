package Exercicio3;

public class Main {

	 public static void main(String[] args) {
		 
		 Guerreiro personagem1 = new Guerreiro();
		 personagem1.lvlUp();
		 personagem1.attack();
		 
		 Guerreiro.contadorDePersonagens();
		 
		 Mago personagem2 = new Mago ();
		 personagem2.lvlUp();
		 personagem2.attack();
		 
		 Mago personagem3 = new Mago ();
		 personagem3.lvlUp();
		
		 Mago.contadorDePersonagens();
	 }
	
}
