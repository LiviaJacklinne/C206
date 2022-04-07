public class Arma // Classe Arma
{
    // Declarando atributos da arma
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma() // Função para ler os dados da arma
    {
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistência: " + resistencia);
        System.out.println("Descrição: " + descricao);
    }
}
