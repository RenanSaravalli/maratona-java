package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Messi");
        Time time = new Time("Brasil");
        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(new Jogador[]{jogador, jogador2});

        System.out.println("----- jogador -----");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("----- Time -----");
        time.imprime();

    }
}
