package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Ninja {
    private String nome;
    private int idade;
    private String cpf;
    private String aldeia;

    public Ninja(String nome, int idade, String cpf, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.aldeia = aldeia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Ninja ninja = (Ninja) obj;
        return cpf !=null && cpf.equals(ninja.getCpf());
    }

    @Override
    public int hashCode() {
        return cpf == null ? 0 : this.cpf.hashCode();
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", aldeia='" + aldeia + '\'' +
                '}';
    }
}
