package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV",431, "Ação");
//        anime.init("Naruto", "Tv", 321, "Ação");
        anime.imprime();

        System.out.println("----------");

        Anime anime2 = new Anime();
        anime2.imprime();
    }
}
