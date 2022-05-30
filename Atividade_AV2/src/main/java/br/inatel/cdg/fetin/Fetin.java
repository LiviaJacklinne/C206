package br.inatel.cdg.fetin;

import br.inatel.cdg.exceptions.unchecked.NomeRepetidoException;
import br.inatel.cdg.exceptions.checked.NotaInsuficienteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fetin
{
    private float nota;
    private String projeto;

    List<String> AuxNome = new ArrayList<>();

    // Criando o mapa
    Map<String, Float> map = new HashMap<String, Float>();

    public void map (String nome, float nota) throws NomeRepetidoException, NotaInsuficienteException
    {
        if (nota > 60)
        {
            map.put(nome, nota);
        }
        else
            throw new NotaInsuficienteException("Nota insuficiente");
    }

    public void AuxNome(String nome) throws NomeRepetidoException
    {

        if (!AuxNome.contains(nome))
        {
            AuxNome.add(nome);
        }
        else
            throw new NomeRepetidoException("Projeto com nome repetido");
    }

    public void mostraInfo()
    {
        map.forEach((nome, nota)->
        {
            System.out.println("Projeto: "+ nome);
            System.out.println("Nota: "+ nota);
        });
    }


    // Getters e Setters
    public float getNota() {return nota;}
    public void setNota(float nota) {this.nota = nota;}
    public String getProjeto() {return projeto;}
    public void setProjeto(String projeto) {this.projeto = projeto;}

}
