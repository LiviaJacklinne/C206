public class Conta
{
    private double saldo;
    double limite;

    // Construtor, deve ser passado um paramentro
    public Conta(double saldo, double limite)
    {
        this.saldo = saldo;
        this.limite = limite;
    }
    // Não precisa de parâmetro, os dados podem ser inseridos depois
    public Conta()
    {

    }

    void sacar(double quantia)
    {
        saldo -= quantia;
    }
    void depositar(double quantia)
    {
        saldo +=quantia;
    }

    // Essa função torna publico a maneira de ler o saldo
    /*public double devolveSaldo() { return saldo; }*///exemplo de função

    //Getter e Setter (torna publico a maneira de ler/acessar)
    public double getSaldo()
    {
        return saldo;
    }

    /*public void setSaldo(double saldo){ this.saldo = saldo; }*/

}
