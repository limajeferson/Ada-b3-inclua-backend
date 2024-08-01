import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaArray {
    public static void main(String[] args) {

        Cor[] cores = Cor.values();

        int[] numerosX = {1, 2, 3};
        int[] numerosY = new int[]{1, 2, 3};
        int[] numerosZ = new int[3];

        System.out.println(numerosX.length);
        System.out.println(cores.length);
        System.out.println(cores[0]);
        System.out.println(cores[0].getCodigoHex());

        //exemplo com do while

        Scanner scanner = new Scanner(System.in);
        double entrada = 0;
        do {
            // tratar erros (com try catch)
            try {
                System.out.println("Favor informar um numero:");
                entrada = scanner.nextDouble();
                System.out.println(entrada);
            } catch (InputMismatchException e) {
                System.out.println("Fim .. entrada = " + entrada);
            }
            scanner.nextLine();
        } while (entrada != 0);
        System.out.println("Fim .. entrada = " + entrada);

        // uso do for
        Cor[] novasCores = Cor.values();
        for (int i = 0; i < novasCores.length; i++) {
            Cor cor = null;
            System.out.println(Cor);
            if (cor.equals(Cor.AZUL)) {
                System.out.println("achou");
                break;
            }
        }
        System.out.println("cor encontrada = " + cor);

    }
}
