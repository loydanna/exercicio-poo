package Exercicio1;


public class Veículo {

	public String marca, modelo, placa, cor;
	public float km;
	public boolean isLigado;
	public int litrosCombustivel, velocidade, preco;
	
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	void acelerar(int velocidade) {
	 velocidade += 20;
	 System.out.println("Acelerou... Sua velocidade atual é: " + velocidade );
	}
	
    void abastecer(int combustivel) {
	    
		if (litrosCombustivel<60) {
			 litrosCombustivel += combustivel;
		     System.out.println("Abasteceu... Seu tanque esta com: " + litrosCombustivel + " litros");}
		else {
			System.out.println("Tanque Cheio, Não pode mais encher" );
			}
		}
    
    void frear(int velocidade) {
       if (velocidade > 0) {
    	 velocidade -= 20;
    	 System.out.println("Freou... Sua velocidade atual é: " + velocidade );
    } else {
    	System.out.println("Veiculo já está parado"); }
	
	}

    void pintar(String cor) {
    	System.out.println("Pintou... A cor do seu carro é : " + cor);
    }
    
    void ligar(boolean isLigado) {
    	if( isLigado== false ) {
    		System.out.println("O carro foi ligado!");
    	}else {
    		System.out.println("O carro já está ligado!");
    	}
    }
    
    void desligar(boolean isLigado,int velocidade) {
        	if( isLigado== true && velocidade==0 ) {
        		System.out.println("O carro foi desligado!");}
        		else if (velocidade> 0) {
        			System.out.println("Velocidade acima de 0, não pode desligar");
        		}
    
        		else{
        		System.out.println("O carro já está desligado!");
        	}
    }
}