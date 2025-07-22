package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        // Característica de primeiro a entrar primeiro a sair FIFO (Fila)
        Queue<String> fila = new PriorityQueue<>();
        // Criada para trabalhar com prioridades customizadas
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()) {
            System.out.println(fila.peek());
            fila.poll();
        }


    }
}
