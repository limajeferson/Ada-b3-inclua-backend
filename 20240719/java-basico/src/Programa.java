public class Programa {

    public static void main(String[] args) {
        System.out.println(Cor.AMARELO);
        System.out.println(Cor.values());
        System.out.println(Cor.AMARELO.getCodigoHex());

        Cor corRecebida = Cor.VERDE;
        String resultado = null;

        // cor preferida = verde = acertou-errou
        switch (corRecebida) {
            case AZUL: {
                resultado = "errou-azul";
                System.out.println("entrou-azul");
                break;
            }
            case AMARELO: {
                resultado = "errou-amarelo";
                System.out.println("entrou-amarelo");
                break;
            }
            case VERDE: {
                resultado = "acertou";
                System.out.println("entrou-verde");
                break;
            }
            default: {
                resultado = "cor invalida";
            }
        }

        System.out.println(resultado);
        System.out.println(corRecebida.getCodigoHex());
    }

}