package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
         *  $ -> Representa o fim da linha
         *  . -> Caractere coringa, exemplo: 1.3 = 123, 133, 1@3, 1A3*/

        // Vamos fazer um exercício: encontrando os emails validos

        String regexHex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.edu.br, sakura@mail ";

        Pattern pattern = Pattern.compile(regexHex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + "->" + matcher.group() + "\n");
        }

        // podemos verificar se uma String bate com a expressão regular
        System.out.println("-----\nemail:#@!zoro@mail.br");
        System.out.println("Email válido: " + "#@!zoro@mail.br".matches(regexHex));


    }
}
