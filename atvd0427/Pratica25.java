import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String[] nomes = {"valter", "ivo", "antonio", "ivonete", "carmem", "c"};

        System.out.print("Nome para comparar: ");
        String nome = ler.nextLine();
        nome = nome.toLowerCase();
        int cont = 0;
        // 0 se as strings forem iguais
        // <0 se a string1 vem antes da string2
        // >0 se a string1 vem depois da string2
        for (int i =0; i<nomes.length; i++){
            if ( nomes[i].compareTo(nome) > 0 ) {
                cont++;    
            }  
        }
        System.out.printf("\nQuantidade de nomes posteriores a %s: %d", nome, cont);
	}  
}
