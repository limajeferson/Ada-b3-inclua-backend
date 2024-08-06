public class TesteLivro {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";
        livro.anoPublicacao = 1899;

        Livro livro2 = new Livro("Vidas Secas","Graciliano Ramos");

        Livro livro3 = new Livro("Capitães da Areia", "Jorge Amado",1937);

    }
}