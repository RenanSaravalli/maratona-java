package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

// vamos implementar o Runnable para rodar nossas threads
public class ThreadAccountTest01 implements Runnable {

    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "thread: Hestia");
        Thread t2 = new Thread(threadAccountTest01, "thread: Bell Cranel");
        t1.start();
        t2.start();
        // O maior problema da concorrência. Ter 2 Threads ou mais
        // acessando o mesmo objeto
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEU");
            }
        }
    }

    // Para resvolver o problema temos que fazer basicamente
    // a thread que começar o métod tem que executa-lo
    // completamente, terminar de executar
    // ai sim ouutra thread pode executar esse métod
    private void withdrawal(int amount) {
        System.out.println(getThreadName() + " ###### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " ***** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " Está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
