package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuintes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Informe o numero de contribuentes: ");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println("Dados do " + i + "º contribuinte: ");
			System.out.print("Pessoa fisica ou juridica (f,j): ");
			char res = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (res == 'f') {
				System.out.print("Gastos com saude: ");
				double gastoComSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoComSaude));
			} else {
				System.out.print("Numero de funcionarios: ");
				int funcionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionario));
			}
			
		}
		
		System.out.println("Taxas pagas: ");
		for (Contribuintes c : list) {
			System.out.printf("%s: $ %.2f%n", c.getNome(), c.calculoImposto());
		}
		
		System.out.println();
		double soma = 0.0;
		for (Contribuintes c : list) {
			soma += c.calculoImposto();
		}
		System.out.println("Total de taxas: $ " + String.format("%.2f", soma));
		
		
		
		
		sc.close();
	}

}
