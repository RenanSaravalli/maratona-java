package academy.devdojo.maratonajava.javacore.Hherança.teste;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua da Banana");
        endereco.setCep("123-12");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Naruto");
        pessoa.setCpf("213141.1231.31");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Clebinho");
        funcionario.setCpf("999.999.999-12");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(0.999999);
        funcionario.imprime();
    }
}
