package academy.devdojo.maratonajava.javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));           // Hello
        System.out.println(bundle.getString("good.morning"));   // Good Morning

        // Digamos que você quer intercionalizar todas as mensagens do seu sistema para português
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));           // Olá
        System.out.println(bundle.getString("good.morning"));   // Bom dia
        // A ordem a qual o java procura pelo arquivo é a seguinte
        // Locale("fr", "CA")
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_pt_BR.properties procura por um arquivo da línguagem do seu sistema
        // messages_pt.properties
        // messages.properties
        // Caso não achar ele dispara uma exceção
        System.out.println(bundle.getString("hi"));
        // hi -> messages.properties
    }
}
