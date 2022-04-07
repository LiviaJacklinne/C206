package br.inatel.cdg;
import br.inatel.cdg.matematica.Calculo;
import br.inatel.cdg.matematica.Matematica; //fully qualidied name

// Quando usa o asterisco importa todas as classe, porem gsta memoria e processador
//import br.inatel.cdg.matematica*;



public class Main
{
    public static void main(String[] args)
    {
        // Usando fully qualidied name, usado para importar a classe "menos usada"
        //br.inatel.cdg.matematica.Matematica matematica = new br.inatel.cdg.matematica.Matematica();

        Matematica matematica = new Matematica();

        // OBS: só é necessario usar o nome todo quando duas classe tem o mesmo nome
        br.inatel.cdg.outramatematica.Matematica matematica1 = new br.inatel.cdg.outramatematica.Matematica();

        Calculo calculo = new Calculo();


    }
}
