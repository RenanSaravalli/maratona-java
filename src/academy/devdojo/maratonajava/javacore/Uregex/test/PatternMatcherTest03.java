package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // Como você já sabe as expressões regulares foram criadas para encontrar determinados, padrões no texto
        // e as vezes os padrões não são tão simples quanto encontrar uma palavra
        String regex = "[abcABC]";
        // Com o range estamos falando, olhe quero que você procure ou por a ou b ou c ou A ou B ou C
        // podemos utilizar o - para representer de um elemento até outro elemento
        regex = "[a-zA-C]";
        String texto = "cafeBABE";
        // Digamos que no texto acima queremos encontrar apenas os números
        // meta caracteres são ser tipo um atalho pegar determinados caracteres e tem uma cacetada de meta caracter
        /* \d -> todos os dígitos
        *  \D -> Tudo oq não for dígito
        *  \s -> Espaços em branco \t \n \f \r
        *  \S -> Todos os caracteres excluindo os brancos
        *  \w -> a-zA-Z, dígitos, _
        *  \W ->  Tudo que não for incluido no \w
        *  [] -> o que você tem ai dentro é representado como se fosse um range de caracteres*/
        // Tem mais meta caracteres mas o rapaz acreditra que esses de cima são os principais

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + "->" + matcher.group() + "\n");
        }

        // Para utilizar números hexadecimais no java temos que começar o número com 0x
        //int numeroHex = 0x59F86A;
        //System.out.println(numeroHex); // Retornar o valor em decimal

        // Exercício. ENcontrar os valores Hexadecimais válidos dentro de um Texto
        String regexHex = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";

        pattern = Pattern.compile(regexHex);
        Matcher matcher2 = pattern.matcher(texto2);

        while (matcher2.find()) {
            System.out.print(matcher2.start() + "->" + matcher2.group() + "\n");
        }

        // Perceba que no resultado ele não retornou todos os valores de um número hexadecimal
        // exemplo: retornou 0x1 e os outros valores que complementam o número não retornou.
        // Vamos aprender a resolver esse problema na próxima aula.


    }
}
