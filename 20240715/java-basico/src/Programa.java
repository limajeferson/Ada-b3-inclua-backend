public class Programa {
    public static void main(String[] args) {
        // 0000 0000 0000 0000
        // char (Character) e string - unidade
        char a1 = 'a'; // 16 bits ou 2 bytes -- 1 byte = 8 bits
        // classe wrapper -> Character
        Character a2 = 'a';
        Character a3 = '\u0029';
        System.out.println( a1 + " " + a3 );
        if (Character.isLetter(a3))
            System.out.println("sim");
        else
            System.out.println("nao");

        Character a4 = Character.valueOf('a');

        String t1 = "texto";
        String t2 = new String("texto"); //instancia tipo string
        String t3 = "hello" + "world"; // 1 + 1 + 1 = 3

        // padrao tipos java
        // short    = 2 bytes
        // 1    inteiro usamos int      = 4 bytes
        // 1.2  decimal usamos double   = 8 bytes
        float f1 = 1.2f;

        // - 128 .. 127 .. 1 byte = 8 bits
        // 0000 0001
        byte b1 = -128; // -128 -1 = -129
        byte b2 = (byte) (b1 - 1);
        System.out.println( b2 ); // 127

        enum Cor {
            VERMELHO("#ff0000"), VERDE("#00ff00"), AZUL("#0000ff");

            private String codigoHex;
            Cor(String codigo) {
                this.codigoHex = codigo;
            }
        }

        // underflow + overflow


    }
}