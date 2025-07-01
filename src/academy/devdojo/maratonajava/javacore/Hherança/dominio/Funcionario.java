package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        System.out.println("Eu sou um funcionário");
        super.imprime();
        System.out.println("EU ganho R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
