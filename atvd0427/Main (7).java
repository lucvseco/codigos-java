/* Seu Dodô divide as despesas com energia, água e internet entre seus filhos.
   2.1 - Escreva um algoritmo para receber os valores das contas
         de cada despesa e a quantidade de filho que seu Dôdo tem.
         Mostre o total das despesas e quanto cada filho vai pagar.
   2.2 - Converta o algoritmo em um programa na linguagem Java */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner lerTeclado = new Scanner(System.in); 
    
        // Entradas
        System.out.print("Valor da energia.....: ");
        float valorEnergia  = lerTeclado.nextFloat();
        System.out.print("Valor da água........: ");
        float valorAgua     = lerTeclado.nextFloat();
        System.out.print("Valor da internet....: ");
        float valorInternet = lerTeclado.nextFloat();
        System.out.print("Quantidade de filhos.: ");
        int   numeroFilhos  = lerTeclado.nextInt();
        
        // Processamento
        float totalDespesas = valorEnergia + valorAgua + valorInternet;
        float valorPorFilho = totalDespesas / numeroFilhos;
        
        // Saída
        System.out.println();
        
        System.out.printf("Total das despesas R$ %.2f, cada filho paga R$ %.2f", totalDespesas, valorPorFilho);
        
        System.out.println();        
        System.out.println("Total das despesas...: R$ " + totalDespesas);
        System.out.println("Valor por filho......: R$ " + valorPorFilho);
  
        lerTeclado.close();
	}
}
