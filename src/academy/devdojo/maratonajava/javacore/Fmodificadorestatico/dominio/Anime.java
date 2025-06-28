package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    /* Ordem da classe
    *  0 - Bloco de inicialização é executado quando a JVM carregar a classe
    *  1 - Alocado espaço em memória pro objeto
    *  2 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado
    *  3 - Bloco de inicialização é executado
    *  4 - Construtor é executado*/
    static {
        System.out.println("Dentro do bloco de inicialização static");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Bloco de inicialização static 2");
    }

    static {
        System.out.println("Bloco de inicialização static 3");
    }

    {
        System.out.println("Bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int[] episodios) {
        Anime  .episodios = episodios;
    }
}
