package ex3;

import java.util.Scanner;

public class Ex3 {
	public static void Abastece(Double precoLitro, Double qntd) {
		Double valorTotal;
	    valorTotal= precoLitro * qntd;
	    System.out.println("Valor total a pagar= R$"+ valorTotal);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Double litro,preco;
		
		
		System.out.println("Digite o valor do litro:");
		preco=sc.nextDouble();
		
		System.out.println("Digite a quantidade de litros:");
		litro=sc.nextDouble();
		
	    Abastece(preco,litro);
     
	}

}