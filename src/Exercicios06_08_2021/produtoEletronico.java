package Exercicios06_08_2021;

import java.util.Scanner;

public class produtoEletronico {

	public String produto;
	public boolean disponivel;
	public int precoFinal;
	public int preco;
	public int desconto;
	
	public produtoEletronico(String produto, boolean disponibilidade, int precoFinal, int preco, int desconto) {
		this.produto = produto;
		this.disponivel = disponibilidade;
		this.precoFinal = precoFinal;
		this.preco=preco;
		this.desconto=desconto;
	}
	Scanner leia = new Scanner(System.in);
	
	public void receberProduto() {
		produto=leia.next();
	}
	
	public void imprimirInformcoes() {
		System.out.println("\nO produto descrito foi: "+produto);
	}
}
