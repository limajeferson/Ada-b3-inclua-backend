import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        exemploFor();
//        exemploArray();
//        exemploForEach();
        exemploString();
    }

    private static void exemploString() {
        String s1 = "roberto";
        String s2 = "carlos";
        String s3 = s1 + s2; // concatenar - juntar - unir
        String s4 = s1.concat(s2);

        int a = s4.length(); // tamanho
        String s5 = s4.replace("o", "a");
        String s6 = "1153-inclua+-aula6-arrays-20";
        String[] s7 = s6.split("-");
        System.out.println(s7);
        System.out.println(Arrays.toString(s7));

        System.out.println(s6.indexOf("+")); // me diga onde está o +
        System.out.println(s6.charAt(11));   // o que tem na posicao 11
    }

    private static void exemploForEach() {
        // forEach
        int[] x = new int[3];
        for (int valor : x) {
            System.out.println(valor);
        }
    }

    private static void exemploArray() {
        // aqui criou o array com valores aleatorios
        Random random = new Random();
        Double[] numeros = new Double[5]; // [null, null, ..]
        for (int i = 0; (numeros.length > i); i++) {
            // numeros[i] = Math.random();
            numeros[i] = random.nextDouble(10);
            System.out.print(numeros[i] + " : ");
        }

        // conceitos wrapper/primitivo .. autoboxing e unboxing
        Double x1 = 9d; // = new Double(9d) .. autoboxing
        Double x2 = new Double(9d);
        double x3 = x2; // unboxing

        // exemplo tipos java e erro ArrayIndexOutOfBoundsException
        // inteiros, decimais, booleanos, strings, chars, ..
        numeros[4] = 9d; // [0,1,2,3,4] - unboxing / autoboxing
        // if (true) return;

        // montar novo array apenas os numeros abaixo de 5
        double[] novoarray = new double[5];
        int j = 0;
        // for (declaracao; (condicao); execucao) i = i + 1 .. overload
        for (int i = 0; (numeros.length > i); i++) { // length > i .. i < length
            double numero = numeros[i];
            // indice de navegacao = i .. indice de atribuicao = j
            if (numero < 5)
                novoarray[j++] = numero;
        }

        System.out.println();

        // como gerar apenas os elementos menores
        for (int i = 0; (novoarray.length > i); i++) {
            System.out.print(novoarray[i] + " : "); // para nao ter que imprimir os 5
        }
    }

    public static void exemploFor() {
        // uso do for
        Cor[] novasCores = Cor.values();
        Cor cor = null;
        for (int i = 0; (i < novasCores.length); i++) {
            cor = novasCores[i];
            System.out.println(cor);
            if (cor.equals(Cor.AZUL)) {
                System.out.println("achou");
                break;
            }
        }
        System.out.println("cor encontrada = " + cor);
    }

}