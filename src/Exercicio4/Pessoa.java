package Exercicio4;

public class Pessoa {
public String nome;
public Integer idade;


public String getNome() {
	return nome;
}

public Integer getIdade() {
	return idade;
}



public Pessoa(String nome, Integer idade) {
	super();
	this.nome = nome;
	this.idade = idade;
}

@Override
public String toString() {
	return "[" + nome + "," + String.valueOf(idade)+ "]";
}

	



}
