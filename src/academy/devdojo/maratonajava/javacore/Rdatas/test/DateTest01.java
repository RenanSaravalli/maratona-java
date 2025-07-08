package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(10000000000L); // long
        /*Praticamente está totalmente obsoleta*/
        // trabalha com a representação em milissegundos utilizando um long
        System.out.println(date); //Sun Apr 26 14:46:40 BRT 1970

        // Caso queira pegar os milissegundos que representa a data utilize
        System.out.println(date.getTime()); // 10000000000

        // Para pegar o milissegundos do dia de hoje não passamos nada
        Date dataAtual = new Date();
        System.out.println(dataAtual); // Tue Jul 08 17:14:03 BRT 2025
        System.out.println(dataAtual.getTime()); // 1752005624097 -> Long de Tue Jul 08 17:14:03 BRT 2025
    }
}
