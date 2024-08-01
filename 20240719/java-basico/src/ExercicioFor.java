import java.util.Random;

public class ExercicioFor {
    public static void main(String[] args) {
        Random random = new Random();
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextDouble() * 10;
            System.out.print(numeros[i] + " : ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 5) {
                count++;
            }
        }

        double[] novoarray = new double[count];
        int j = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 5) {
                novoarray[j++] = numeros[i];
            }
        }

        for (int i = 0; i < novoarray.length; i++) {
            System.out.print(novoarray[i] + " : ");
        }
    }
}
