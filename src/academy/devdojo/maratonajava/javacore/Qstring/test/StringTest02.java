package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Mia Khalifa   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Retorna um char de acordo com o índice
        System.out.println(nome.length()); // Tamanho da String
        System.out.println(nome.replace("Mia", "Leonardo"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println("--------------------");
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2)); // o segundo parâmetro é exclusivo (valor - 1)
        System.out.println(numeros.substring(0, numeros.length()));
        System.out.println(nome.trim()); // Remove os valores em branco no começo e no fim da String
    }
}
