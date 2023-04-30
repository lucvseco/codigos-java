package atvd0529;

public class Livro {
    private int idLivro;
    private String titulo;
    private String ISBN;
    private int numeroPaginas;
    private Genero genero;
    private Editora editora;


    public Livro(int idLivro, String titulo, String iSBN, int numeroPaginas, Genero genero, Editora editora) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		ISBN = iSBN;
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
		this.editora = editora;
	}


	public int getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public Genero getGenero() {
        return genero;
    }


    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public Editora getEditora() {
        return editora;
    }

    
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
}
