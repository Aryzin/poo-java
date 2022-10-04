package ex1;

public abstract class Animal {

	private String nome;
	private String raca;
	private Float comprimento;
	private Integer patas;
	private String cor;
	private String ecossistema;
	


public Animal() {};

	
public Animal(String nome){};

public String caminha(){
	return"";
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getRaca() {
	return raca;
}


public void setRaca(String raca) {
	this.raca = raca;
}


public Float getComprimento() {
	return comprimento;
}


public void setComprimento(Float comprimento) {
	this.comprimento = comprimento;
}


public Integer getPatas() {
	return patas;
}


public void setPatas(Integer patas) {
	this.patas = patas;
}


public String getCor() {
	return cor;
}


public void setCor(String cor) {
	this.cor = cor;
}


public String getEcossistema() {
	return ecossistema;
}


public void setEcossistema(String ecossistema) {
	this.ecossistema = ecossistema;
};




}