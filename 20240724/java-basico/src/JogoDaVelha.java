import java.util.Scanner;

public class JogoDaVelha {
    static char[][] tabuleiro = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };
    static String jogador1, jogador2;
    static int placarJogador1 = 0, placarJogador2 = 0, totalPartidas = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        apresentarJogo(input);

        boolean continuarJogando = true;
        while (continuarJogando) {
            iniciarPartida(input);
            System.out.print("Deseja jogar novamente? (s para sim, q para sair): ");
            String resposta = input.next();
            if (resposta.equalsIgnoreCase("q")) {
                continuarJogando = false;
            } else {
                totalPartidas++;
                reset();
            }
        }

        input.close();
    }

    private static void apresentarJogo(Scanner input) {
        System.out.println("Bem-vindos ao Jogo da Velha!");
        System.out.println("Comandos: 'LinhaColunaSímbolo' (ex: 01X, 12O)");
        System.out.println("Para sair do jogo, digite 'q'.");

        System.out.print("Nome do Jogador 1: ");
        jogador1 = input.next();
        System.out.print("Nome do Jogador 2: ");
        jogador2 = input.next();

        mostrarPlacar();
        mostrarTabuleiro();
    }

    private static void iniciarPartida(Scanner input) {
        String jogadorAtual = getJogador();
        char simboloAtual = jogadorAtual.equals(jogador1) ? 'X' : 'O';

        System.out.println("Iniciando a partida! O primeiro a jogar é: " + jogadorAtual);

        while (true) {
            mostrarTabuleiro();
            System.out.print(jogadorAtual + ", digite sua jogada (ex: 01X, 12O): ");
            String jogada = input.next();

            if (jogada.equalsIgnoreCase("q")) {
                System.out.println("Jogo encerrado.");
                break;
            }

            if (validarJogada(jogada, simboloAtual)) {
                if (verificarVencedor(simboloAtual)) {
                    mostrarTabuleiro();
                    System.out.println("Parabéns, " + jogadorAtual + "! Você venceu a partida.");
                    getPlacar(jogadorAtual);
                    mostrarPlacar();
                    break;
                } else if (verificarEmpate()) {
                    mostrarTabuleiro();
                    System.out.println("O jogo terminou em empate!");
                    break;
                }

                jogadorAtual = alternarJogador(jogadorAtual);
                simboloAtual = jogadorAtual.equals(jogador1) ? 'X' : 'O';
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
    }

    private static void mostrarTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void mostrarPlacar() {
        System.out.println("Placar:");
        System.out.println(jogador1 + ": " + placarJogador1);
        System.out.println(jogador2 + ": " + placarJogador2);
        System.out.println("Total de partidas: " + totalPartidas);
    }

    private static boolean validarJogada(String jogada, char simbolo) {
        if (jogada.length() != 3) return false;

        int linha = jogada.charAt(0) - '0';
        int coluna = jogada.charAt(1) - '0';

        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) return false;
        if (tabuleiro[linha][coluna] != '_') return false;

        tabuleiro[linha][coluna] = simbolo;
        return true;
    }

    private static boolean verificarVencedor(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
                return true;
            }
            if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo) {
                return true;
            }
        }
        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
            return true;
        }
        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '_';
            }
        }
    }

    private static String getJogador() {
        return Math.random() < 0.5 ? jogador1 : jogador2;
    }

    private static String alternarJogador(String jogadorAtual) {
        return jogadorAtual.equals(jogador1) ? jogador2 : jogador1;
    }

    private static void getPlacar(String jogadorAtual) {
        if (jogadorAtual.equals(jogador1)) {
            placarJogador1++;
        } else {
            placarJogador2++;
        }
    }
}
