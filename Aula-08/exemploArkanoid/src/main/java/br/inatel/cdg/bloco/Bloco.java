package br.inatel.cdg.bloco;

import br.inatel.cdg.jogador.Jogador;

public class Bloco
{
    private static int numBlocos = 0;
    public static int blocoDestruido = 0;

    public Bloco()
    {
        numBlocos++;
    }

    public static int NumBlocos()
    {
        return numBlocos;
    }

    public static void destroiBloco()
    {
        blocoDestruido++;
        Jogador.pontuacao();
    }
}
