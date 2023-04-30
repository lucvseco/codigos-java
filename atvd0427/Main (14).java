/* Escreva um programa para receber a quantidade de pessoas
   contaminadas com o corona vírus nas 4 cidades da região 
   metropolitana de um Estado. Os dados devem ficar armazenados
   em um vetor.
   
   1 - Calcular e mostrar o total de pessoas contaminadas
   2 - Calcular e mostrar a média de pessoas contaminadas
   3 - Calcular e mostrar a quantidade de cidades com pessoas contaminadas   
       acima da média
   

*/


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int totalPessoasContaminadas = 0;
        int contaCidadesAcimaMedia = 0;
        
        int[] pessoasContaminadas = {1500, 7000, 2300, 5000};
        String[] cidades = {"recife", "olinda", "cabo", "jaboatao"};
        
        /*
	    int[] pessoasContaminadas = new int[4];
	    String[] cidades = new String[4];
    
        for (int i = 0; i<pessoasContaminadas.length; i++) {
            
            System.out.printf("Nome da %dª cidade: ", (i+1));
            cidades[i] = ler.nextLine();

            do {
                
                System.out.printf("Pessoas contaminadas na %dª cidade: ", (i+1));
                pessoasContaminadas[i] = ler.nextInt();
                if (pessoasContaminadas[i] < 0) {
                    System.out.println("Valor não pode ser negativo");
                    continue;
                }
                break;
            } while (true);

            ler.nextLine();
            
        } 
        */

        for (int i = 0; i<pessoasContaminadas.length; i++) {
            totalPessoasContaminadas += pessoasContaminadas[i];
        }
        System.out.println("Total de pessoas contaminadas: " + totalPessoasContaminadas);

        double mediaPessoasContaminadas = totalPessoasContaminadas / pessoasContaminadas.length;   
        System.out.println("Média de pessoas contaminadas: " + mediaPessoasContaminadas);

        System.out.print("\nCidades acima da média de pessoas contaminadas:");
        for (int i = 0; i<pessoasContaminadas.length; i++) {
            
            if (pessoasContaminadas[i] > mediaPessoasContaminadas) {
                contaCidadesAcimaMedia++;
                System.out.printf("\n%s: %d", cidades[i], pessoasContaminadas[i]);
            }
        }
        System.out.println("\nTotal de cidades acima da média: " + contaCidadesAcimaMedia);

	}
}
