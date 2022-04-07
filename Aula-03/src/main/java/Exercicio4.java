import java.util.Scanner;

public class Exercicio4
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int alunos;

        System.out.print("Digite o número de alunos (10, 20 ou 30): ");
        alunos = entrada.nextInt();

        switch (alunos)
        {
            case 10:
            case 20:
                System.out.println("Aula na sala I-15");
                break;
            case 30:
                System.out.println("Aula na sala I-22");
                break;
            default:
                System.out.println("Número de alunos inválido");
                break;
        }

        //Para fechar o Scanner, após seu uso
        entrada.close();
    }
}
