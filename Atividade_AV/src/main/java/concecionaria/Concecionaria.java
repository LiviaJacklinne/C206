package concecionaria;

import org.jetbrains.annotations.NotNull;

public abstract class Concecionaria implements Comparable<Concecionaria>
{
    protected String nome;
    protected double preco;

    // Construtor
    public Concecionaria(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostraInfo()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: " + getPreco());
    }

    // Metodo de comparação = ordenação
    public int compareTo(Concecionaria o)
    {
        return Double.compare(this.getPreco(), o.getPreco());
    }

    // Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}
}
