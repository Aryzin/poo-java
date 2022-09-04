package ex10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] vetor = { "Amazônia", "Mata Atlântica", "Cerrado", "Caatinga", "Pampa", "Pantanal" };

		vetor[3] = "";
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}
}
// Daria para remover o item com lista.remove(3).