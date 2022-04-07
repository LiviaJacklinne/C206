import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Tem um GET e SET automático
@AllArgsConstructor // Passar parametro direto, sem ter construtor

public class Pessoa
{
    private double peso, imc, temp;
    private int idade, cpf;
    private String nome, descricao;


}
