package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");

		String nome = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome);

		System.out.print("Informe o telefone do cliente: ");
		String telefone = scanner.nextLine();

		System.out.print("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);

		int total = consumidor.getFiado();

		if (total > 100) {
			System.out.println(
					"Nome do cliente �: " + consumidor.getNome() + ". Telefone: " + consumidor.getTelefone(telefone)
							+ ". Ele(a) deve um total de: " + total + " Reais. Ganhou um brinde!");
		} else {
			System.out.println("Nome do cliente �: " + consumidor.getNome() + ". Telefone: "
					+ consumidor.getTelefone(telefone) + ". Ele(a) deve um total de: " + total + " Reais.");
		}
	}

	// While
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}

		return total;
	}

	// For
//	public static int somaFor(int[] fiados) {
//		int total = 0;
//		for (int i = 0; i < fiados.length; i++) {
//			total += fiados[i];
//		}
//
//		return total;
//
//	}
//
	// For Each
//	public static int somaForeach(int[] fiados) {
//		int total = 0;
//		for (int fiado : fiados) {
//			total += fiado;
//		}
//		return total;
//	}
//
}