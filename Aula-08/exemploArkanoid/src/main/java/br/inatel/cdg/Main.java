package br.inatel.cdg;

import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.conversor.Conversor;

public class Main
{
    public static void main(String[] args)
    {
        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();

        Bloco.destroiBloco();
        Bloco.destroiBloco();

        System.out.println("Número de blocos criados: " + Bloco.NumBlocos());
        System.out.println("Blocos destruidos: " + Bloco.blocoDestruido); // aqui
        Conversor.conversor();
    }
}
