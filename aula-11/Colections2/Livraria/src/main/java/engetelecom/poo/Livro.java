package engetelecom.poo;

public class Livro {
    private final String  ISBN;
    private String  titulo;
    private String  autor;
    private int     ano;


    public Livro(String ISBN, String titulo, String autor, int ano) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {return titulo;}

    public String getAutor() {return autor;}

    public int getAno() {return ano;}

    public String getISBN() {return ISBN;}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format(
                """
                ISBN:%s
                Título:%s
                Autor:%s
                Ano:%s
                """,ISBN,titulo,autor,ano
        );
    }
}
