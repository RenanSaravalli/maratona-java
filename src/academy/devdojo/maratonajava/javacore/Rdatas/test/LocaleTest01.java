package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // Tem a possibilidade de trabalhar com diversos tipos de formatação
        // Para seu parâmetro de criação vamos utilizar a norma ISO
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCh = new Locale("it", "CH");
        Locale localIndia = new Locale("hi", "IN");
        Locale localJp = new Locale("ja", "JP");
        Locale localHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        // Agora podemos atribuir para diversos tipos de classe

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCh);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJp);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localHolanda);

        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));

        System.out.println(localIndia.getDisplayCountry());
        System.out.println(localJp.getDisplayCountry(localIndia));
        System.out.println(localeItaly.getDisplayCountry(localJp));
        System.out.println(localeItaly.getDisplayLanguage(localJp));

        // Muitas das vezes o navegador vai trazer para nós o idioma do usuário
        // ou então podemos colocar uma preferência de idioma no sistema.

    }
}
