package ex7;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero:");
			lista.add(sc.nextInt());
		}
		System.out.println("Desordenada");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordem Crescente");
		System.out.println(lista);
		Collections.reverse(lista);
		System.out.println("Ordem Decrescente");
		System.out.println(lista);

	}

}