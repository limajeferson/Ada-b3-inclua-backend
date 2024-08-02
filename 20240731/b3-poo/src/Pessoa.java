import java.time.LocalDateTime;

public class Pessoa {

    String nome;
    int idade;
    LocalDateTime dataHoraCriacao;

    public Pessoa(String nomeConstrutor, int idadeConstrutor) {
        if (nomeConstrutor == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        nome = nomeConstrutor;
        idade = idadeConstrutor;
        dataHoraCriacao = LocalDateTime.now();
    }

    public Pessoa() {
        dataHoraCriacao = LocalDateTime.now();
    }

    public void apresentar() {
        System.out.println("Olá meu nome é " + nome.toUpperCase() + " e eu tenho " + idade + " anos");
    }
}