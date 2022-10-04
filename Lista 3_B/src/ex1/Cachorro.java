package ex1;

public class Cachorro extends Animal {
	
	
	public void Cachoro() {}
	
	public Cachorro(String nome, String raca, Float comprimento, Integer patas, String Cor, String ecossitema) {
		this.setNome("Barte");
		this.setRaca("Salsicha");
		this.setComprimento(23.4f);
		this.setPatas(4);
		this.setCor("Preto");
		this.setEcossistema("Selvagem");
	}
	
	public String late() {
		return"";
	}
	public String toString() {
		return("nome:"+ this.getNome() +", raça:"+this.getRaca()+", comprimento:"+this.getComprimento()+", patas:"+this.getPatas()+", cor:"+this.getCor()+", ecossistema:"+this.getEcossistema());
	};
	
}
