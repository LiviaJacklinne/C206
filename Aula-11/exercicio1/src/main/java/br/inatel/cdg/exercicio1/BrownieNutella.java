package br.inatel.cdg.exercicio1;

public class BrownieNutella extends Brownie
{
    public BrownieNutella(String nome, double preco, String sabor)
    {
        super(nome, preco, sabor);
    }

    public void addNutella()
    {
        float aux;
        System.out.println(super.nome + " " + super.preco);
    }
}
