package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem {
 
	public List<String> habilidade= new ArrayList<>();
	public static int contador=0;

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	public Guerreiro() {
		super();
		contador++;
	}
	
   @Override
	public String toString() {
		return "Guerreiro [habilidade=" + habilidade + ", nome=" + nome + ", vida=" + vida + ", mana=" + mana
				+ ", inteligencia=" + inteligencia + ", forca=" + forca + ", level=" + level + ", xp=" + xp + "]";
	}

void lvlUp() {
	   super.lvlUp();
	   vida+=10;
	   forca+=10;
	   mana+=2;
	   inteligencia+=5;
	   System.out.println("O seu status é: " + toString());
	}
   

void attack() {
	int numeroaleatorio = (int) (Math.random()* 300);
	    int ataque= (forca*level) + numeroaleatorio;
	    System.out.println("O seu ataque foi de: " + ataque);
   }
   
   void aprenderHabilidade() {
	   
   }
   
   public static void contadorDePersonagens() {
  	 System.out.println("O total de guerreiros criados foi " + contador); 
	}
}
