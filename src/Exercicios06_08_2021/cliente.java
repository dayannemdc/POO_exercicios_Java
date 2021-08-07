package Exercicios06_08_2021;

public class cliente {
	
	private String nomeDoCliente;
	private int idade; 
	private String frequenciaDeCompras; 
	private int valorDaCompra;
	
	public cliente(String nome, int idade, String frequencia, int valor)
	{
		this.nomeDoCliente = nome;
		this.idade = idade;
		this.frequenciaDeCompras = frequencia;
		this.valorDaCompra = valor;
	}
		
	public void imprimirDados()
	{
		System.out.println("\nO Cliente"+nomeDoCliente+" com idade de "+idade+" apresenta frequencia: "+frequenciaDeCompras+" e consome aproximadamente "+valorDaCompra+" em compras.");
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFrequenciaDeCompras() {
		return frequenciaDeCompras;
	}

	public void setFrequenciaDeCompras(String frequenciaDeCompras) {
		this.frequenciaDeCompras = frequenciaDeCompras;
	}

	public int getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(int valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}
	

}
