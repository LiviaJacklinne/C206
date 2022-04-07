public class Main
{
    public static void main(String[] args)
    {
        // Código Chris

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "kart1";
        kart2.nome = "kart2";

        kart1.motor.velocidadeMax = 120.02f;
        kart1.motor.cilindadradas = "200";
        kart2.motor.velocidadeMax = 100.02f;
        kart2.motor.cilindadradas = "150";

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Piloto1";
        piloto2.nome = "Piloto2";

        // o que rolou aqui????
        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart2.fazerDrift();

        kart1.motor.mostrarInfo();
        kart2.motor.mostrarInfo();

        /*
            // Instânciando
            Piloto piloto1 = new Piloto();
            piloto1.nome = "Mutley";
            piloto1.vilao = true;

            // Instânciando
            Piloto piloto2 = new Piloto();
            piloto2.nome = "Penelope";
            piloto2.vilao = false;

            piloto1.mostrarInfo();
            piloto2.mostrarInfo();

            // Instânciando
            Kart kart = new Kart();
            kart.nome = "Pink";
            kart.motor.cilindadradas = "100";
            kart.motor.velocidadeMax = 120;

            // Usando métodos
            kart.pular();
            kart.soltarTurbo();
            kart.fazerDrift();

                ERRADO ERRADO ERRADO
                Motor motor = new Motor();
                motor.cilindadradas = "100";
                motor.velocidadeMax = 120;
                motor.mostrarInfo(); // Método



            // Agregação
            Piloto piloto = new Piloto();
            kart.piloto = piloto;
        */
    }
}
