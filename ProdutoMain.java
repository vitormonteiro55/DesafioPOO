package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastrar Produto ----");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double valor = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produto celular = new Produto(nome, valor, quantidade);
		
		System.out.printf(
				"Produto %s de valor R$%.2f possui %d itens em estoque.\nImposto: R$%.2f\nValor total do estoque: R$%.2f",
				celular.nome,
				celular.valorUnitario,
				celular.quantidade,
				celular.valorImposto(),
				celular.valorEstoque()
		);
		
		sc.close();
	}

}