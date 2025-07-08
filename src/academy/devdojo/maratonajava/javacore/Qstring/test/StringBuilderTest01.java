package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Renan Sampaio Saravalli";

        StringBuilder stringBuilder = new StringBuilder(16);
        stringBuilder.append("Gostoso");
        System.out.println(nome);
        System.out.println(stringBuilder);
        // o append vai adicionando
        stringBuilder.append(" demais");
        System.out.println(stringBuilder); //Gostoso demais
        stringBuilder.reverse();
        stringBuilder.delete(0, 3);
        System.out.println(stringBuilder);
    }
}
