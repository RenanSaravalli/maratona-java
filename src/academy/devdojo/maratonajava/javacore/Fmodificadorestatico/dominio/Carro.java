package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxina;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxina) {
        this.nome = nome;
        this.velocidadeMaxina = velocidadeMaxina;
    }

    public void imprime() {
        System.out.println("-----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxina);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxina() {
        return velocidadeMaxina;
    }

    public void setVelocidadeMaxina(double velocidadeMaxina) {
        this.velocidadeMaxina = velocidadeMaxina;
    }
}
