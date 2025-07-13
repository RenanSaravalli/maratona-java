package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        // ai passamos uma string para Scanner, essa classe possui um delimitador por padrão sendo o espaço em branco
        // para alteramos esse limitador fazemos a seguinte etapa
        scanner.useDelimiter(",");
        /*Agora para pegar os valores é como ele tivesse dois ponteiros o primiero verifica se existe um próximo valor
        * caso exista um segundo poteiro vai realmente pegar esse valor (um verifica e outro anda)*/
        // para isso utilizamos um while
        // while (scanner.hasNext()) {
           //  System.out.println(scanner.next());
            // Caso exista um próximo imprima o próximo
        //}
        System.out.println(" ");
        // para pegar esse valores de acordo com seu tipo
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int: " + i);
            } else if (scanner.hasNextBoolean()) {
                Boolean b = scanner.nextBoolean();
                System.out.println("Bool: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}