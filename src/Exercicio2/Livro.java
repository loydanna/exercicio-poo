package Exercicio2;

public class Livro extends Produto implements Imposto {
	
	public String autor, tema;
	public int qtdPag;
	
	

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	
	public Livro() {}
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		this.nome= nome;
		this.preco= preco;
		this.qtd=qtd;
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", tema=" + tema + ", qtdPag=" + qtdPag + ", nome=" + nome + ", preco=" + preco
				+ ", qtd=" + qtd + "]";
	}

	@Override
	public double calculaImposto() {
		double imposto;
		 if (tema.equalsIgnoreCase("educativo")){
		 System.out.println("O imposto do livro" + nome + " é " + (imposto=0)) ;
		 }else {
			 imposto=0.10;
			 System.out.println("O imposto do livro " + nome + "é " + (preco*= imposto)) ; 
		 }
		 return imposto;
		 
		
		
	
	}

}
