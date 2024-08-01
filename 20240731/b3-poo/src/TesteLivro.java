public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";
        livro.anoPublicacao = 1899;

        System.out.println(livro.titulo + " é um romance escrito por " + livro.autor + ", publicado em " + livro.anoPublicacao + ".");

        Livro livro2 = new Livro();
        livro2.titulo = "Vidas Secas";
        livro2.autor = "Graciliano Ramos";
        livro2.anoPublicacao = 1938;

        System.out.println(livro2.titulo + " é um romance escrito por " + livro2.autor + ", publicado em " + livro2.anoPublicacao + ".");

        Livro livro3 = new Livro();
        livro3.titulo = "Capitães da Areia";
        livro3.autor = "Jorge Amado";
        livro3.anoPublicacao = 1937;

        System.out.println(livro3.titulo + " é um romance escrito por " + livro3.autor + ", publicado em " + livro3.anoPublicacao + ".");
    }

}
