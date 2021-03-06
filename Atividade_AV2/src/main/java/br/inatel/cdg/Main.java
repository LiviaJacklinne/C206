package br.inatel.cdg;

import br.inatel.cdg.exceptions.checked.NotaInsuficienteException;
import br.inatel.cdg.exceptions.unchecked.NomeRepetidoException;
import br.inatel.cdg.fetin.Fetin;

public class Main
{
    public static void main(String[] args)
    {
        Fetin fetin1 = new Fetin();
        Fetin fetin2 = new Fetin();
        Fetin fetin3 = new Fetin();
        Fetin fetin4 = new Fetin();


        try
        {
            fetin1.map("Grupo1",70f);
            fetin2.map("Grupo2",40f);
            fetin3.map("Grupo3",80f);
            fetin4.map("Grupo3",60f);
        }
        catch (NotaInsuficienteException | NomeRepetidoException e)
        {
            e.printStackTrace();
        }

        fetin1.mostraInfo();
        fetin2.mostraInfo();
        fetin3.mostraInfo();
        fetin4.mostraInfo();

    }
}
