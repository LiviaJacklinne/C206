public class Kart
{
    String nome;
    Motor motor;
    Piloto piloto;

    // Métodos
    void pular()
    {
        System.out.println("Pular");
    }
    void soltarTurbo()
    {
        System.out.println("Soltar Turbo");
    }
    void fazerDrift()
    {
        System.out.println("Drift");
    }

    // Composição = Criar um construtor
    Kart()
    {
        motor = new Motor(); // Relação kart motor: o Motor só existe de o Kart existir
    }

}
