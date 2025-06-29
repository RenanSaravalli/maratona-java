package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Fernando");
        Professor professor2 = new Professor("Jiraya Sensei");

        Escola escola = new Escola("Konoha", new Professor[]{professor1,professor2});

        escola.imprime();
    }
}
