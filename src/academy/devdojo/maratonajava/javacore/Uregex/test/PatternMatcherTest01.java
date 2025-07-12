package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // Agora vamos começar a ver expressões regulares
        // Expressões Regulares -> Linguagem desenvolvida que utiliza caracteres, símbolos para encontrar padrões no texto
        // então através de metacaracteres vai devolver o valor que estamos procurando
        // Também é utilizado para validações, por exemplo verificar se um email está escrito sintáticamente correto

        // Vamos começar com uma expressão regular simples
        // Utilizamos duas classes para trabalhar com expressões regulares a Pattern -> sendo o padrão
        // e a Maatcher que é usada para encontrar aquele padrão

        // no Exemplo a baixo ele vai procurar todos os ab que temos no texto
        String regex = "ab";
        String texto = "abaab";
        Pattern pattern = Pattern.compile(regex);
        // Compilamos o padrão, agora temos que dar o Match
        // "Esse padrão tem que casar com o meu texto"
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("indice 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        // Então como funciona o java procurando as expressões regulares
        // o matcher vai ficar procurando durante o texto ou seja enquanto ele econtrar a expressão, para isso vamos
        // utilizar um while
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");

        }

        // Por que? start quando estamos pesquisando, no exemplo acima ab ele vai encontrar ab
        // sendo a primeira posição que encontrou o elemento da expressão no caso 0 e 3 que foi onde começou
        // então ele encontrou as posições, mas calma ai
        // imagine o seguinte caso
        System.out.println(" ");
        String texto2 = "abababa";
        // O que vai acontecer se procurarmos pela expressão abaixo
        regex = "aba";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto2);

        System.out.println("Texto: " + texto2);
        System.out.println("indice 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");

        }
        // No caso ele apenas mostrou 0 e 4. Mas e a posição 2 no segundo aba. Pelo fato dele já ter contado essa posição no ou matcher
        // ela é ignorada e não retorna,


    }
}
