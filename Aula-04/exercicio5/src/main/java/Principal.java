public class Principal
{
    public static void main(String[] args)
    {
        // Alocando memória pro personagem '1' e atribuindo dados
        Ashen ashen = new Ashen();
        ashen.nome = "Tokyo";
        ashen.vida = 100;

        // Alocando memória pra arma '1' e atribuindo dados
        Arma arma = new Arma(); //
        arma.nome = "M4A1";
        arma.poder = 40;
        arma.resistencia = 80;
        arma.descricao = "Rifle";

        // Na classe ashen, tem uma arma da classe Arma. Essa 'arma' tem o endereço da classe Arma
        ashen.arma = arma; // Agregação

        arma.mostraInfoArma(); // Chama a função para mostrar os dados da arma

        ashen.usarArma();
        System.out.println("Vida depois de usar arma: " + ashen.vida);
        ashen.tomarDano();
        System.out.println("Resistência depois de tomar dano: " + arma.resistencia);


    }

}
