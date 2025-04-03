package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salario = new double[]{1211.12, 921.12, 1931};
        funcionario.imprime();


    }
}
