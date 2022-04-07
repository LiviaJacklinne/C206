package br.inatel.cdg;

import br.inatel.cdg.banda.Banda;
import br.inatel.cdg.banda.musica.Musica;
import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.membro.Membro;

public class Main
{
    public static void main(String[] args)
    {
        // Instanciando Banda
        Banda banda = new Banda("Patroas", "Sertanejo");

        // Instanciando Empresário
        Empresario empresario = new Empresario("Eduardo", 1234);
        banda.setEmpresario(empresario);

        // Instanciando Membros
        Membro membro1 = new Membro("Marilia", "Cantora");
        Membro membro2 = new Membro("Maiara", "Cantora");
        Membro membro3 = new Membro("Maraisa", "Cantora");
        Membro membro4 = new Membro("Livia", "Cantora");

        // Adicionando membros pela função da classe Banda
        banda.addNovoMembro(membro1);
        banda.addNovoMembro(membro2);
        banda.addNovoMembro(membro3);
        banda.addNovoMembro(membro4);

        // Instanciando Musicas
        Musica musica1 = new Musica("Bebaça",3.14);
        Musica musica2 = new Musica("Presepada", 3.28);

        // Adicionando musicas pela função da classe Banda
        banda.addNovaMusica(musica1);
        banda.addNovaMusica(musica2);

        // Função Mostrar Info
        banda.mostraInfo();
    }
}
