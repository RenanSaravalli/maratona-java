package academy.devdojo.maratonajava.javacore.Hherança.teste;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;

public class HerancaTeste02 {
    /* Ordem da classe
     *  0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
     *  1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
     *  2 - Alocado espaço em memória pro objeto da superclasse
     *  3 - Cada atributo da super classe é criado e inicializado com valores default ou o que for passado
     *  4 - Bloco de inicialização da superclasse é inicializado na ordem que aparece
     *  5 - Construtor é executado da superclasse
     *  6 - Alocado espaço em memória pro objeto da subclasse
     *  7 - Cada atributo de subclasse é criado e inicializado com valores default ou oque for passado
     *  8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
     *  9 - Construtor é executado da subclasse */

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("REnan");
    }
}
