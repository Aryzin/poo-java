package Listinha;

import java.util.ArrayList;
import java.util.Scanner;

public class pessoaCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		Pessoa p1 = new Pessoa();
		int opc;

		do {
			System.out.println("Digite\n0-Sair\n1-Cadastrar\n2-Atualizar\n3-Listar:");
			opc= sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Digite o nome da pessoa");
				p1.setNome(sc.next());
				System.out.println("Digite o idade da pessoa");
				p1.setIdade(sc.nextInt());
				System.out.println("Digite o cpf da pessoa");
				p1.setCpf(sc.next());
				pessoa.add(p1);
				break;
			case 2:
					System.out.println("Digite o nome da pessoa");
					p1.setNome(sc.next());
					System.out.println("Digite o idade da pessoa");
					p1.setIdade(sc.nextInt());
					System.out.println("Digite o cpf da pessoa");
					p1.setCpf(sc.next());
				pessoa.add(p1);
			case 3:
				for (Pessoa pes : pessoa) {
					System.out.println("Nome:" + pes.getNome());
                    System.out.println("Cpf:" + pes.getCpf());
					System.out.println("Idade:" + pes.getIdade());
					break;
				}
			}

		} while (opc!= 0);

	}

}