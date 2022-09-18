package Exercicio3;

import java.util.ArrayList;
import java.util.List;


public class Mago extends Personagem{
  
	public List<String> magia= new ArrayList<>();
	public static int contador=0;

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	
	public Mago() {
		super();
		contador++;
	}

	
	@Override
	public String toString() {
		return "Mago [magia=" + magia + ", nome=" + nome + ", vida=" + vida + ", mana=" + mana + ", inteligencia="
				+ inteligencia + ", forca=" + forca + ", level=" + level + ", xp=" + xp + "]";
	}

	void lvlUp() {
		super.lvlUp();
		vida+=5;
		forca+=2;
		mana+=10;
		inteligencia+=10;
		System.out.println("O seu status é: " + toString());
		}
		
	
	void attack() {
		int numeroaleatorio = (int) (Math.random()* 300);
	    int ataque= (inteligencia*level) + numeroaleatorio;
	    System.out.println("O seu ataque foi de: " + ataque);
	   }
	
	void aprenderMagia() {
		
	}
	
     public static void contadorDePersonagens() {
    	 System.out.println("O total de magos criados foi " +contador); 
	}
}
