package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salario = null;
    private double mediaSalarios;

    public void imprime() {
        System.out.println("---Funcionário---");
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        if (this.salario == null) {
            return;
        }

        System.out.print("Salario: ");

        for (double value : this.salario) {
            System.out.print(value + " ");
        }

        imprimeMediaSalario();

    }

    public void imprimeMediaSalario() {
        if (this.salario == null) {
            return;
        }

        for (double value : this.salario) {
            mediaSalarios += value;
        }

        mediaSalarios /= this.salario.length;

        System.out.println("\nA média de salários é: " + mediaSalarios);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMediaSalarios() {
        return mediaSalarios;
    }
}
