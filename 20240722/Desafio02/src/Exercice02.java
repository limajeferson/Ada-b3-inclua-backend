import java.util.Arrays;
import java.util.Random;

/*
Crie um algoritmo que gere aleatoriamente 10 valores,
e organize do menor para o maior, e exiba na tela o menor valor e o maior valor.
*/

public class Exercice02 {
    public static void main(String[] args) {
        // Cria uma instância de Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array de inteiros com 10 elementos
        int[] valores = new int[10];

        // Preenche o array com números aleatórios entre 0 e 99
        for (int i = 0; i < 10; i++) {
            valores[i] = random.nextInt(100);
        }

        // Exibe os valores gerados
        System.out.println("Valores gerados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();

        // Ordena o array
        Arrays.sort(valores);

        // Obtém o menor e o maior valor
        int menor = valores[0];
        int maior = valores[valores.length - 1]; // Pode usar valores.length - 1 para o último elemento

        // Exibe o menor e o maior valor
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
    }
}
