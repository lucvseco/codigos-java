
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int contAprovados = 0; 
	    int contReprovados = 0;
	    int contPessoas = 1;
	    double media = 0;

        do { //  Repetir 4 vezes
            
            do { // Crítica de cada média recebida
                System.out.printf("Média da %dª pessoa: ", contPessoas);
                media =  input.nextDouble();
                if (media < 0 || media > 10 ) {
                    System.out.println("Média incorreta. Informe de 0 - 10");
                    continue;
                }
                break;
            } while ( true );

            if (media >= 6) {
               contAprovados = contAprovados + 1; 
            }
            else {
                contReprovados = contReprovados + 1;
            }
            
            contPessoas = contPessoas + 1;
        } while (contPessoas<=4);
        
        System.out.println("Quantidade de aprovados : " + contAprovados);
        System.out.println("Quantidade de reprovados: " + contReprovados);

	}
	
}
