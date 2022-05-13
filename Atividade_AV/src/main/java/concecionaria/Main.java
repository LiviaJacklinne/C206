// Livia Jacklinne Ramos Moreira, GEC - 1731, 13/05/2022

package concecionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        // Array auxiliar
        ArrayList<String> auxList = new ArrayList<>();

        // Classe Fiat
        System.out.println("Digite dois nomes de um carro da Fiat: ");
        auxList.add(sc.nextLine());
        auxList.add(sc.nextLine());

        // Classe Honda
        System.out.println("Digite dois nomes de um carro da Honda: ");
        auxList.add(sc.nextLine());
        auxList.add(sc.nextLine());

        // Classe Mercedes
        System.out.println("Digite dois nomes de um carro da Mercedes: ");
        auxList.add(sc.nextLine());
        auxList.add(sc.nextLine());

        // Inserindo os dados no objeto, com o nome inserido na lista auxiliar
        // Preço do carro gerado aleatóriamente com a função RANDOM
        Fiat fiat1 = new Fiat(auxList.get(0), new Random().nextDouble()*100);
        Fiat fiat2 = new Fiat(auxList.get(1), new Random().nextDouble()*100);

        Honda honda1 = new Honda(auxList.get(2), new Random().nextDouble()*100);
        Honda honda2 = new Honda(auxList.get(3), new Random().nextDouble()*100);

        Mercedes mercedes1 = new Mercedes(auxList.get(4), new Random().nextDouble()*100);
        Mercedes mercedes2 = new Mercedes(auxList.get(5), new Random().nextDouble()*100);

        // Adicionando os itens na classe Concecionaria
        ArrayList<Concecionaria> carro = new ArrayList<Concecionaria>();
        carro.add(fiat1);
        carro.add(fiat2);
        carro.add(honda1);
        carro.add(honda2);
        carro.add(mercedes1);
        carro.add(mercedes2);

        System.out.println("-------------");

        // Array sem ordenar
        System.out.println("**Array sem ordenar**");
        for(Concecionaria concecionaria: carro)
        {
            concecionaria.mostraInfo();
            //System.out.println("-------------------------");
        }

        System.out.println(" ");

        // Ordenando em ordem crescente
        Collections.sort(carro);
        System.out.println("**Array ordenado em ordem crescente**");
        for(Concecionaria concecionaria: carro)
        {
            concecionaria.mostraInfo();
        }

        System.out.println(" ");

        // Ordenando em ordem crescente
        Collections.reverse(carro);
        System.out.println("**Array ordenado em ordem decrescente**");
        for(Concecionaria concecionaria: carro)
        {
            concecionaria.mostraInfo();
        }

    }
}
