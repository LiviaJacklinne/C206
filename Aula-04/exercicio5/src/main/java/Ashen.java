public class Ashen // Classe Asehn
{
    // Atribuindo os dados do personagem
    String nome;
    int vida; //
    Arma arma;

    void usarArma () // Função para o boneco usar a arma
    {
        vida -= 5; // ele perde 5 de vida
    }
    void tomarDano() // Função quando o boneco toma dano
    {
        arma.resistencia -= 2; // A arma perde resistencia
    }
}
