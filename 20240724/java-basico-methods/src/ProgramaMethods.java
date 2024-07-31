public class ProgramaMethods {
    public static void main(String[] args) {
        short[][] matriz = {{1,2,3},{4,5}};
        Integer codigo = new Integer(13);

        System.out.println("Iniciando o game, bem-vindo!");
        System.out.println("etapa-1 = " + codigo);
        calcular(matriz, codigo);
        System.out.println("etapa-3 = " + codigo);
        imprimir(matriz, codigo + 1);
        System.out.println("etapa-5 = " + codigo);

        // logica restante a fazer
    }

    // modificador de acesso + (static) + tipo-retorno + nome(parametros){...}
// passagem por referencia ou valor
    public static void calcular(short[][] matrix, Integer cod) {
        for (int i = 0; i < matrix.length; i++) {
            // navegando por linha
            for (int j = 0; j < matrix[i].length; j++) {
                // navegando por coluna
                matrix[i][j] += 1;
                cod += 3;
            }
        }
        System.out.println("etapa-2 = " + cod);
    }

    public static void imprimir(short[][] metrix, Integer kod) {
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("etapa-4 = " + kod);
    }
}