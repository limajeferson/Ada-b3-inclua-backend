public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";
        livro.anoPublicacao = 1899;

        System.out.println(livro.titulo + " é um romance escrito por " + livro.autor + ", publicado em " + livro.anoPublicacao + ".");
    }

}
