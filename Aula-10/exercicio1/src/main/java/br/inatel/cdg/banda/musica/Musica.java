package br.inatel.cdg.banda.musica;

public class Musica
{
    // Atributos (variaveis) privados, precisa de GET e SET
    private String nome;
    private double duracao;

    // Construtor (mesmo nome da classe)
    public Musica(String nome, double duracao)
    {
        this.nome = nome;
        this.duracao = duracao;
    }

    // Funções são Métodos
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public double getDuracao()
    {
        return duracao;
    }
    public void setDuracao(double duracao)
    {
        this.duracao = duracao;
    }

}
