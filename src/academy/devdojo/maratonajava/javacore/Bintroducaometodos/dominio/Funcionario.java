package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome = null;
    public int idade = 0;
    public double[] salario = null;

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

        double mediaSalarios = 0;

        for (double value : this.salario) {
            mediaSalarios += value;
        }

        mediaSalarios /= this.salario.length;

        System.out.println("\nA média de salários é: " + mediaSalarios);
    }
}
