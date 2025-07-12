package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // Como você já sabe as expressões regulares foram criadas para encontrar determinados, padrões no texto
        // e as vezes os padrões não são tão simples quanto encontrar uma palavra
        String regex = "\\W";
        String texto = "_h12hi$ #@ &ka9";
        // Digamos que no texto acima queremos encontrar apenas os números
        // meta caracteres são ser tipo um atalho pegar determinados caracteres e tem uma cacetada de meta caracter
        /* \d -> todos os dígitos
        *  \D -> Tudo oq não for dígito
        *  \s -> Espaços em branco \t \n \f \r
        *  \S -> Todos os caracteres excluindo os brancos
        *  \w -> a-zA-Z, dígitos, _
        *  \W ->  Tudo que não for incluido no \w*/
        // Tem mais meta caracteres mas o rapaz acreditra que esses de cima são os principais

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + "->" + matcher.group() + "\n");
        }

    }
}
