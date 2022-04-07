package br.inatel.cdg.membro;

public class Membro
{
    // Atributos (variaveis) privados, precisa de GET e SET
    private String nome;
    private String funcao;

    // Construtor (mesmo nome da classe)
    public Membro(String nome, String funcao)
    {
        this.nome = nome;
        this.funcao = funcao;
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
    public String getFuncao()
    {
        return funcao;
    }
    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }

}
