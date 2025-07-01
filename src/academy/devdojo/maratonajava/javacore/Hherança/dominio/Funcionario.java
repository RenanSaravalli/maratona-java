package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }



    public void imprime(){
        System.out.println("Eu sou um funcionário");
        super.imprime();
        System.out.println("EU ganho R$"+this.salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
