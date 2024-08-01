import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();

        double bQuadrado = b * b;
        double parteDelta = 4 * a * c;
        double delta = bQuadrado - parteDelta;

        if (a == 0) {
            System.out.println("Entrada inválida: 'a' não pode ser zero.");
        } else if (delta < 0) {
            System.out.println("raiz real não existe porque delta é negativo.");
        } else {
            /* Pesquisei como calcular raiz quadrada e encontrei o Math.sqrt()*/
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("A raiz da equação é:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        input.close();
    }
}