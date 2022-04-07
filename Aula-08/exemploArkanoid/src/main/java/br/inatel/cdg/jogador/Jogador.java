package br.inatel.cdg.jogador;

public class Jogador
{
    private static int jogador = 0;

    public static int pontuacao()
    {
        jogador++;
        return jogador;
    }

    public static int getJogador()
    {
        return jogador;
    }
}
