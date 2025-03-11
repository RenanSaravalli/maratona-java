package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;

public class Aula03TiposPrimitivosEx {
    public static void main(String[] args) {
        String nome = "Renan";
        int numEnd = 35;
        String endereco = "Rua Estrela Dalva número:" + numEnd;
        float salario = 2000.12F;

        LocalDate data = LocalDate.parse("2025-03-07");

        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o salário de %.2f, na data %s", nome, endereco, salario, data);
    }
}
