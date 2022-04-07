import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args)
    {
        // Scanner função para inserir dados
        Scanner entrada = new Scanner(System.in);
        float npa, np3, total;

        System.out.print("Digite sua NPA: ");
        npa = entrada.nextFloat();

        if(npa >= 60)
            System.out.println("Aprovado!!");
        else
        {
            System.out.println("Você deve fazer NP3");
            System.out.print("Digite sua NP3: ");
            np3 = entrada.nextFloat();

            total = (npa + np3)/2;

            if(total >= 50)
                System.out.println("Aprovado!!");
            else
                System.out.println("Reprovado :( ");

            // Fechando scanner
            entrada.close();

        }
    }
}
