package Exercicio2;

public class VideoGame extends Produto implements Imposto {
	
	public String marca, modelo;
	public boolean isUsado;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	
	public VideoGame() {}

	public VideoGame(String nome, double preco, int qtd,String marca, String modelo, boolean isUsado) {
		this.nome= nome;
		this.preco= preco;
		this.qtd=qtd;
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	

	@Override
	public String toString() {
		return "VideoGame [marca=" + marca + ", modelo=" + modelo + ", isUsado=" + isUsado + ", nome=" + nome
				+ ", preco=" + preco + ", qtd=" + qtd + "]";
	}

	@Override
	public double calculaImposto() {
		double imposto;
		 if (isUsado== true){
			 imposto=0.25;
			 System.out.println("O imposto do jogo" + nome + " é " + (preco*=imposto)) ;
		 }else {
			 imposto= 0.45;
			 System.out.println("O imposto do jogo" + nome + " é " + (preco*= imposto)) ;
		 }
		 return imposto;
		
	}

}
