package ex9;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> lista = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a " + (i + 1) + "º palavra");
			lista.add(sc.next());
		}
		boolean vazia = lista.isEmpty();
		if (vazia == true) {
			System.out.println("Lista Vazia");
		}
		System.out.println(lista);

		System.out.println("Lista Tamanho--> " + lista.size());

		System.out.println("Ultima Palavra--> " + lista.get(2));
	}
}