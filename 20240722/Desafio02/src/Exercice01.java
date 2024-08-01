import java.util.Arrays;
import java.util.Random;

public class Exercice01 {
    public static void main(String[] args) {  // Aqui está a correção

        /** Ada Turma B3 Inclua+ -> Desafio 02
         * Gere uma lista de arrays de 10 números e calcule a mediana
         * */

        Random random = new Random();
        double[] numeros = new double[10];

        // Preenche o array com números aleatórios entre 0 e 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextDouble() * 10;
        }

        // Ordena o array
        Arrays.sort(numeros);

        // Calcula a mediana
        double mediana;
        int mid = numeros.length / 2;
        if (numeros.length % 2 == 0) {
            mediana = (numeros[mid - 1] + numeros[mid]) / 2.0;
        } else {
            mediana = numeros[mid];
        }

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        System.out.println("Mediana: " + mediana);
    }
}
