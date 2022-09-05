package ex6;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> salario = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o salario " + (i + 1) + "=");
			salario.add(sc.nextDouble());
		}
		Collections.sort(salario);
		System.out.println("Ordem Crescente");
		for (Double sal : salario) {
			System.out.println(sal);
		}
		Collections.reverse(salario);
		System.out.println("Ordem Decrescente");
		for (Double sal : salario) {
			System.out.println(sal);
		}

	}

}