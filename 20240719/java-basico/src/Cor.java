public enum Cor {
    AMARELO("#FFFF00"), VERDE("#008000"), AZUL("#0000FF");

    // modificador de acesso
    // atributo de enum ("classe")
    // metodos

    private String codigoHex;

    // construtor
    Cor(String codigo) {
        this.codigoHex = codigo;
    }

    // metodo getters e setters
    public String getCodigoHex() {
        return this.codigoHex;
    }

    // nao é comum em enums
    public void setCodigoHex(String codigo) {
        this.codigoHex = codigo;
    }

}