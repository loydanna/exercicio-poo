package Exercicio4;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(new Pessoa ("João", 15),
				new Pessoa ("Leandro", 21),new Pessoa ("Paulo", 17),
				new Pessoa ("Jessica", 18));
		
	      Pessoa p2 = pessoas.stream().max(Comparator.comparingInt(Pessoa::getIdade)).get();
	      
	      System.out.println("A maior idade é : " + p2);   
	         
	    //Questão5
	      List<Pessoa> p3 = pessoas.stream()
	    		    .filter(p -> p.getIdade() >= 18).collect(Collectors.toList());
	    	   
	      System.out.println(p3);   
	      
	    //Questão6
	      List<Pessoa> p4 = pessoas.stream()
	    		     .filter(p -> p.nome.equals("Jessica")).collect(Collectors.toList());
	    	   
	      System.out.println(p4);
	           
	}


}
