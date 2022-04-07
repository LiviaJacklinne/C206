// Incluindo a biblioteca Scanner
import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
        // Scanner função para inserir dados
        Scanner entrada = new Scanner(System.in);
        int partida1, partida2, partida3, total;
        float media;

        // Entrada de dados
        System.out.print("Número de zubis mortos na primeira rodada: ");
        partida1 = entrada.nextInt();
        System.out.print("Número de zubis mortos na segunda rodada: ");
        partida2 = entrada.nextInt();
        System.out.print("Número de zubis mortos na terceira rodada: ");
        partida3 = entrada.nextInt();

        // Soma dos zubis mortos
        total = partida1 + partida2 + partida3;

        // Média dos zubis mortos
        media = total/3;

        // Saida de dados
        System.out.println("Total de zubis mortos " +total);
        System.out.println("Média de zumbis mortos " +media);

        // Fechando scanner
        entrada.close();

    }
}
