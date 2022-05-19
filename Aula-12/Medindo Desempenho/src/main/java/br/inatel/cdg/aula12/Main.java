package br.inatel.cdg.aula12;
/*
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        int numValores = 100000;
        long tempoInicial;
        long tempoFinal;

        List<Integer> listaInteiro = new ArrayList<>();
        Set<Integer> conjuntoInteiro = new HashSet<>();
        Map<Integer, Integer> mapaInteiro = new HashMap<>();

        // Inserindo na List (ArrayList)
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i<numValores; i++)
        {
            listaInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir na List: " + (tempoFinal-tempoInicial));

        // Inserindo no Set (HashSet)
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i<numValores; i++)
        {
            conjuntoInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir na List: " + (tempoFinal-tempoInicial));

        // Inserindo no Map (HashMap)
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i<numValores; i++)
        {
            listaInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir na List: " + (tempoFinal-tempoInicial));

        /* o array list é o mais rápido porque insere os dados fora de ordem, por isso ele é o mais
        demorado para buscar.



    }



}*/



    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int numValores = 1000000;
        long tempoInicial, tempoFinal;

        List<Integer> listaInteiro = new ArrayList<Integer>();
        Set<Integer> conjuntoInteiro = new HashSet<Integer>();
        Map<Integer, Integer> mapaInteiro = new HashMap<Integer, Integer>();

        //Inserindo na List (ArrayList)
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < numValores; i++) {
            listaInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir na List: "
                + (tempoFinal-tempoInicial)+"ms");

        //Inserindo no Set (HashSet)
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < numValores; i++) {
            conjuntoInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir no Set: "
                + (tempoFinal-tempoInicial)+"ms");

        //Inserindo no Set (HashMap)
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < numValores; i++) {
            mapaInteiro.put(i, i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir no Map: "
                + (tempoFinal-tempoInicial)+"ms");

        //Fazendo a busca
        //Buscando na List (ArrayList)
        //tempoInicial = System.currentTimeMillis();
       // for (int i = 0; i < numValores; i++) {
       //     listaInteiro.contains(i);
       // }
       // tempoFinal = System.currentTimeMillis();
       // System.out.println("Tempo para buscar na List: " + (tempoFinal-tempoInicial)+"ms");

        //Buscando no HashSet
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < numValores; i++) {
            conjuntoInteiro.contains(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar no Set: "
                + (tempoFinal-tempoInicial)+"ms");

        //Buscando no HashMap
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < numValores; i++) {
            mapaInteiro.containsKey(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar no Map: "
                + (tempoFinal-tempoInicial)+"ms");

    }

}
