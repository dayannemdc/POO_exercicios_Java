package Exercicios06_08_2021;

import java.util.Scanner;

public class testaAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aviao novoAviao = new aviao("novo", "branco", "grande", 1000);
		
		novoAviao.imprimir();
		
		novoAviao.setStatus("usado");
		novoAviao.setCor("azul");
		novoAviao.setTamanho("pequeno");
		novoAviao.setCapacidade(300);
		
		novoAviao.imprimir();
		
	}

}
