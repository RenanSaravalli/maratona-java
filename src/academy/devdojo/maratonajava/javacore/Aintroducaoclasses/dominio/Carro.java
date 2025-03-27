package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    public void imprimeValores() {
        System.out.println("Nome do carro: " + this.nome + " Modelo: " + this.modelo + " Ano: " + this.ano);
    }
}
