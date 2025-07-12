package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Nessa aula vamos ver como os quantificadores funcionam
        // Basicamente quantificadores são caracteres que vão te dar poder em pegar determinada expressão baseado na quantidade
        // que aquele meta caractere representa

        /* \d -> todos os dígitos
         *  \D -> Tudo oq não for dígito
         *  \s -> Espaços em branco \t \n \f \r
         *  \S -> Todos os caracteres excluindo os brancos
         *  \w -> a-zA-Z, dígitos, _
         *  \W ->  Tudo que não for incluído no \w
         *  [] -> o que você tem ai dentro é representado como se fosse um range de caracteres
         * Quantificadores a baixo
         *  ?     -> Zero ou uma ocorrência
         *  *     -> Zero ou mais
         *  +     -> Uma ou mais
         *  {n,m} -> de n até m
         * Mais meta caracteres que vai nos ajudar
         * () -> meta caractere de agrupamento
         * |  -> ou
         * Exemplo: o(v|c)o = ovo ou oco
         *  $ -> Representa o fim da linha */

        // Exercício. Encontrar os valores Hexadecimais válidos dentro de um Texto

        String regexHex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regexHex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + "->" + matcher.group() + "\n");
        }

        // Perceba que no resultado ele não retornou todos os valores de um número hexadecimal
        // exemplo: retornou 0x1 e os outros valores que complementam o número não retornou.
        // Vamos aprender a resolver esse problema na próxima aula.


    }
}
