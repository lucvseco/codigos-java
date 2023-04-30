package atvd0512;

import java.util.Scanner;

public class AppEstacionamento {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		
		System.out.println("Código:");
		int codigo = lerTeclado.nextInt();
		System.out.println("Nome:");
		String nome = lerTeclado.next();
		System.out.println("Cidade:");
		String cidade = lerTeclado.next();
		System.out.println("Vagas:");
		int vagas = lerTeclado.nextInt();
		System.out.println("Valor Inicial:");
		float valorInicial = lerTeclado.nextFloat();
		System.out.println("Valor adicional:");
		float valorAdicional = lerTeclado.nextFloat();
		System.out.println("Franquia inicial:");
		int franquiaInicial = lerTeclado.nextInt();
		
		
		
		Estacionamento estacionamento = new Estacionamento(nome, codigo,
		cidade, vagas, valorInicial, valorAdicional, franquiaInicial);
		
		
		System.out.println("situação" + estacionamento.isSituacao());
		estacionamento.ativar();
		System.out.println("Código:" + estacionamento.getCodigo());
		System.out.println("Nome:" + estacionamento.getNome());
		System.out.println("Cidade:" + estacionamento.getCidade());
		System.out.println("Vagas:" + estacionamento.getVagas());
		System.out.println("Valor inicial:" + estacionamento.getValorInicial());
		System.out.println("Valor adicional:" + estacionamento.getValorAdicional());
		System.out.println("Franquia inicial:" + estacionamento.getFranquiaInicial());
		System.out.println("situação" + estacionamento.isSituacao());
		estacionamento.desativar();
		System.out.println("situação" + estacionamento.isSituacao());
	}
}
