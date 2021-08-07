package Exercicios06_08_2021;

public class testaProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		produtoEletronico novoProduto=new produtoEletronico(null,false,0,0,0);
		
		System.out.println("Entre com o produto eletrônico: ");
		novoProduto.receberProduto();
		
		novoProduto.imprimirInformcoes();

	}

}
