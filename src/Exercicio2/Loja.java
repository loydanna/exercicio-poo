package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Loja  {

	public String nome, cnpj;
	public List<Livro> livros= new ArrayList<>();
	public List<VideoGame> videoGames= new ArrayList<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<VideoGame> getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	
	
	public Loja() {}
	
    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
    
    
	public void listaLivros() {
		System.out.println("As lojas " + nome + " possui esses livros para venda:" );
		livros.forEach(System.out::println);
		if(livros.isEmpty()) System.out.println("A loja não tem livros no estoque");
    }
	
    public void listaVideoGames() {
    	System.out.println("As lojas " + nome + " possui esses video-games para venda:" );
    	videoGames.forEach(System.out::println);
    	if(livros.isEmpty()) System.out.println("A loja não tem video-games no estoque");
    }
    
	
	public double calculaPatrimonio() {
		double somaLivros = livros.stream().mapToDouble(livros -> livros.getPreco() * livros.getPreco()) .sum();
		double somaVideoGame = videoGames.stream().mapToDouble(videoGames -> videoGames.getPreco() * videoGames.getPreco()) .sum();
		double soma = somaLivros + somaVideoGame;
		System.out.println("O patrimonio das loja " + nome + " é R$ " + soma);
		return soma ; 
	}
    
    
}
