import java.util.Random;
import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int x = rand.nextInt(10)+1; // Gera um numero aleatório entre 10 e 1
        int y;

        //System.out.println(x);

        do
        {
            System.out.println("Digite um número de 1 a 10: ");
            y = entrada.nextInt();

            if (y > x)
                System.out.println("Seu numéro é maior do que o do sistema");
            if (y < x)
                System.out.println("Seu numéro é menor do que o do sistema");

        } while (!(y == x));

        System.out.println("Muito bom, você acertou o número aleatório " +y);

        //Para fechar o Scanner, após seu uso
        entrada.close();
    }
}
