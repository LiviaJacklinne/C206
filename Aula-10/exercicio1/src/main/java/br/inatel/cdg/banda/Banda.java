package br.inatel.cdg.banda;

import br.inatel.cdg.banda.musica.Musica;
import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.membro.Membro;

public class Banda
{
    private String nome;
    private String genero;
    private Empresario empresario = null;
    // Instanciar é quando usa NEW
    private Membro membros[] = new Membro[4];
    private Musica musicas[] = new Musica[2];

    public Banda(String nome, String genero)
    {
        this.nome = nome;
        this.genero = genero;
    }

    public void addNovaMusica(Musica musica)
    {
        for(int i=0; i<musicas.length; i++)
        {
            if(musicas[i] == null)
            {
                musicas[i] = musica;
                break;
            }
        }
    }
    public void addNovoMembro(Membro membro)
    {
        for(int i=0; i<membros.length; i++)
        {
            if(membros[i] == null)
            {
                membros[i] = membro;
                break;
            }
        }
    }

    public void mostraInfo()
    {
        System.out.println("Banda: " + getNome() + " " + getGenero() );

        for(int i=0; i< membros.length; i++)
        {
            if(membros[i] != null)
            {
                System.out.println("Membros: " + membros[i].getNome() + " " + membros[i].getFuncao());
            }
        }
        for(int i=0; i< musicas.length; i++)
        {
            if(musicas[i] != null)
            {
                System.out.println("Membros: " + musicas[i].getNome() + " " + musicas[i].getDuracao());
            }
        }

        if(empresario != null)
        {
            System.out.println("Empresario: " + empresario.getNome() + " " + empresario.getCNPJ());
        }

    }




    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getGenero()
    {
        return genero;
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }
    public Empresario getEmpresario()
    {
        return empresario;
    }
    public void setEmpresario(Empresario empresario)
    {
        this.empresario = empresario;
    }
    public Membro[] getMembros()
    {
        return membros;
    }
    public void setMembros(Membro[] membros)
    {
        this.membros = membros;
    }
    public Musica[] getMusicas()
    {
        return musicas;
    }
    public void setMusicas(Musica[] musicas)
    {
        this.musicas = musicas;
    }
}
