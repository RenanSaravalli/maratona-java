package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }

}

// Outra forma que temos de trabalhar com threads é implementando a interface Runnable
class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        // Oque é uma thread?
        // possui 2 definições
        // pode ser um objeto
        // e nós temos um processo, uma linha de execução
        // a jvm vai cuidar da parte do escalonamento
        // da thread (quando iniciada, parada, terminada)
        // temos dois tipos de Thread as de tipo
        // Daemon x User
        // o java encerra o programa quando todas as threads
        // de tipo User são terminadas. Threads do tipo Daemon
        // não tem tanta prioridade, por exemplo a thread que toma
        // conta do carbage collector que limpa os objetos em memória
        // é do tipo Daemon
        // e se você tem múltiplas threads, você consegue executa-las em paralelo
        //toda thread tem um nome, para pegar
        System.out.println(Thread.currentThread().getName());
        // main ->thread que inicia o programa no java
        // vamos ver como podemos criar uma thread
        //ThreadExample t1 = new ThreadExample('A');
        //ThreadExample t2 = new ThreadExample('B');
        //ThreadExample t3 = new ThreadExample('C');
        //ThreadExample t4 = new ThreadExample('D');
        //t1.run();
        //t2.run();
        //t3.run();
        //t4.run();
        // Ele não pega threads diferentes
        // Utilizamos apenas uma thread pq não demos um start
        // Com start estamos dizendo para JVM iniciar uma nova thread
        //t1.start();
        //t2.start();
        //t3.start();
        //t4.start();
        // A ordem sempre vai ser diferente
        // não temos garantia que o resultado vai ser o mesmo
        Thread t1 = new Thread(new ThreadExampleRunnable('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable('C'));
        Thread t4 = new Thread(new ThreadExampleRunnable('D'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
