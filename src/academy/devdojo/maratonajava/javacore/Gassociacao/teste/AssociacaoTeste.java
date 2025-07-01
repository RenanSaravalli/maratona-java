package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Bananas");
        Aluno aluno = new Aluno("Renan", 19);
        Professor professor = new Professor("Jiraya", "Safadeza");
        Seminario seminario = new Seminario("Diário de uma safado", local, new Aluno[]{aluno});
        professor.setSeminarios(new Seminario[]{seminario});
        professor.imprime();
    }
}
