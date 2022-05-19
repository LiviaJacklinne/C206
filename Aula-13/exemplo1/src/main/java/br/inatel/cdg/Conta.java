package br.inatel.cdg;

import java.util.HashSet;
import java.util.*;


public class Conta
{
    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(float saldo, float limite)
    {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public void mostraInfo()
    {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        // FOR IT é usado, pois o "vetor" não segue uma ordem, portanto com um indice "i" não é possivel
        // acessar todas as posições
        for (Cliente cliente : clientes)
        {
            try
            {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            }
            catch (NullPointerException e)
            {
                System.out.println("Nao existe cliente nessa posicao");
            }
        }
    }
}
