package Exercicios06_08_2021;

public class testandoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cliente cliente1 = new cliente(" Joao da Silva",35,"alta",1500);

		cliente1.imprimirDados();
		
		cliente1.setNomeDoCliente(" Maria da Silva");
		cliente1.setIdade(28);
		cliente1.setFrequenciaDeCompras("média");
		cliente1.setValorDaCompra(800);
		
		cliente1.imprimirDados();
	}

}
