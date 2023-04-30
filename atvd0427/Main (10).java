/* Um agencia deseja selecionar atores para fazer um comercial 
   para o dia das avós. Busca pessoas do sexo feminino (F) com
   idade até 6 anos e idade a partir de 65 anos.
   Escreva um programa para receber os dados necessários e mostrar
   - Não temos papel para você no momento
   - Temos um papel para você
*/


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    
        int idade;
        do {
        	System.out.print("Idade: ");
        	idade = input.nextInt();
        	if (idade<0) {
        	    System.out.println("A idade não pode ser negativa");
        	}
        } while (idade < 0);

    	input.nextLine(); // limpeza de buffer de teclado
    	
    	char sexo;
    	do {
        	System.out.print("Sexo : ");
        	sexo = input.nextLine().charAt(0);
        	sexo = Character.toUpperCase(sexo);
        	if (sexo != 'M' && sexo != 'F') {
        	    System.out.println("Sexo incorreto. Digite M ou F");
        	}
    	}  while (sexo != 'M' && sexo != 'F');  	
    	
        if (sexo == 'F' && (idade <=6 || idade >= 65) ) {
    	    System.out.print("Temos um papel para você");            
        }
        else {
    	    System.out.print("Não temos papel para você no momento");            
        }

    	input.close();
	}

}
