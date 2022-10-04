package ex1;

public class Gato extends Animal {

	public Gato(String nome, String raca, Float comprimento, Integer patas, String Cor, String ecossitema) {
		this.setNome("Bart");
		this.setRaca("vira-Lata");
		this.setComprimento(23.4f);
		this.setPatas(4);
		this.setCor("Preto");
		this.setEcossistema("Selvagem");
	};
	
	public String mia() {
		return"";
	}
	public String toString() {
		return("nome:"+ this.getNome() +", raça:"+this.getRaca()+", comprimento:"+this.getComprimento()+", patas:"+this.getPatas()+", cor:"+this.getCor()+", ecossistema:"+this.getEcossistema());
	};
	
}
