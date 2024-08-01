public class Main {
    public static void main(String[] args) {
        // varias dimensões
        int[][] matriz = {
                {1, 3, 5},  // i - linha 1
                {4, 6, 8}   // i - linha 2
        //       j  j  j -> 3 colunas
        };

        // matriz.length = 2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}