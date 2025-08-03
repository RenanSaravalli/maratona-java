package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

// Outra forma que temos de trabalhar com threads é implementando a interface Runnable
class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
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
        Thread.yield();
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
       // Podemos criar uma thread diretamente como uma inner classe
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        // vai esperar a thread t1 terminar.
        // para iniciar a thread t2
        t2.start();
    }
}
