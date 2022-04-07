package br.inatel.cdg.conversor;

import br.inatel.cdg.jogador.Jogador;

public class Conversor
{
    public static void conversor()
    {
        System.out.println("Pontos :" + Jogador.getJogador());
        System.out.println("Moedas: " + (Jogador.getJogador()*100));
    }
}
