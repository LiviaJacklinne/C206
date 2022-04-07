package br.inatel.cdg.empresario;

public class Empresario
{
    // Atributos (variaveis) privados, precisa de GET e SET
    private String nome;
    private long CNPJ;

    // Construtor (mesmo nome da classe)
    public Empresario(String nome, long CNPJ)
    {
        this.nome = nome;
        this.CNPJ = CNPJ;
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
    public long getCNPJ()
    {
        return CNPJ;
    }
    public void setCNPJ(long CNPJ)
    {
        this.CNPJ = CNPJ;
    }

}
