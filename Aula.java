package ifsc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Aula {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String leiaStr = leitura.nextLine();
		leitura.close();
		
		
		
		List<String> lista = new ArrayList<>();
		lista.add(leiaStr);
		lista.add("Jalmir");
		lista.add("Lais");
		
		System.out.print("Quantidade: ");
		System.out.println(lista.size());
		System.out.print("Vazia? ");
		System.out.println(lista.isEmpty());
		System.out.print("Lista: ");
		System.out.println(lista.toString());
		
		for(String lis:lista) {
			System.out.println(lis);
		}
		
		for(int i = 0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		int contador = 0;
		while(contador < lista.size()) {
			System.out.println(lista.get(contador));
			contador++;
		}
	}
}
