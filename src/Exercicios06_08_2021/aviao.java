package Exercicios06_08_2021;

public class aviao {
	
	public String status;
	public String cor;
	public String tamanho;
	public int	capacidade;
	
	public aviao(String status, String cor, String tamanho, int capacidade) {
		this.status = status;
		this.cor = cor;
		this.tamanho = tamanho;
		this.capacidade = capacidade;
	}

	public void imprimir()
	{
		System.out.println("\nO Avião é "+status+" de cor "+cor+" de tamanho "+tamanho+" e com capacidade de "+capacidade+" pessoas.");
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	

}
