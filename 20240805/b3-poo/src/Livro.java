public class Livro {
    String titulo = "Título não informado";
    String autor = "Autor não informado";
    int anoPublicacao = 0;

    public Livro() {
        this.titulo = "Título não informado";
        this.autor = "Autor não informado";
        this.anoPublicacao = 0;

        System.out.println(titulo + " é um romance escrito por " + autor + ", publicado em " + anoPublicacao + ".");
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        anoPublicacao = 0;

        System.out.println(titulo + " é um romance escrito por " + autor + ", publicado em " + anoPublicacao + ".");
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

        System.out.println(titulo + " é um romance escrito por " + autor + ", publicado em " + anoPublicacao + ".");
    }
}
