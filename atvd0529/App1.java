package atvd0529;

import java.util.Scanner;
public class App1 {

	    public static void main(String[] args) {
	        Scanner lerTeclado = new Scanner(System.in);
	        
	        Editora[] editoras = new Editora[2];
	        Genero[] generos = new Genero[3];
	        Livro[] livros = new Livro[5];
	        
	        
	        Editora editora = new Editora (0, null, null, null, null);
	        
	        
	        for(int i = 0; i<editoras.length; i++){
	            int idEd = i+1;
	            System.out.printf("Digi o nome da %dª editora:\n",(i+1));
	            String nomeEd = lerTeclado.next();
	            System.out.println("Digite o Contato: ");
	            String contato = lerTeclado.next();
	            System.out.println("Digite a cidade: ");
	            String cidade = lerTeclado.next();
	            System.out.println("Digite a UF: ");
	            String UF = lerTeclado.next();
	            System.out.println("--\n");
	        }
	        
	        
	        Genero genero = new Genero (0, null); 
	        
	        for(int i = 0; i<generos.length; i++){
	            int idGen = i+1;
	            System.out.printf("Digite o nome do %dº genero:\n",(i+1));
	            String nomeGen = lerTeclado.next();
	            System.out.println("--\n");
	        }
	        
	        
	        
	        for(int i = 0; i<livros.length; i++){
	            int idLiv = i+1;
	            System.out.printf("Digite o título do %dº Livro:\n",(i+1));
	            String titulo = lerTeclado.next();
	            System.out.println("Digite o ISBN: ");
	            String ISBN = lerTeclado.next();
	            System.out.println("Digite o número de páginas: ");
	            int numeroPag = lerTeclado.nextInt();
	            System.out.println("Escolha o Genero do Livro:");
	            System.out.println("1 - "+generos[0].getNomeGenero()+"  2 - "+generos[1].getNomeGenero()+" 3 -"+generos[2].getNomeGenero());
	            int selecaoGen = lerTeclado.nextInt();
	            selecaoGen -= 1 ;
	            System.out.println("Escolha a Editora do Livro:");
	            System.out.println("1 - "+editoras[0].getRazaoSocial()+"  2 - "+editoras[1].getRazaoSocial());
	            int selecaoEd = lerTeclado.nextInt();
	            selecaoEd -= 1;
	            
	            System.out.println("--\n");
	        }
	        
	        Livro livro = new Livro (0, null, null, 0, genero, editora);
	    //    livros[i]= livro;
	        
	        
	        for(int i = 0; i<livros.length; i++){
	            System.out.printf("%dº livro\n",livros[i].getIdLivro());
	            System.out.println("Título: "+livros[i].getTitulo());
	            System.out.println("Genero: "+livros[i].getGenero().getNomeGenero());
	            System.out.println("Editora: "+livros[i].getEditora().getRazaoSocial());
	            System.out.println("--\n");
	        }
	        
	    }
	}
