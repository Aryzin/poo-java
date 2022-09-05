package ex12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> nome = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "º nome: ");
			nome.add(sc.next());
		}
		
		System.out.println(nome);
		nome.remove(1);
		nome.add(1, "Adicionado");
		
		System.out.println(nome);

		
	}
}