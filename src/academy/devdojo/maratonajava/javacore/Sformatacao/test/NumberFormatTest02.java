package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        // Agora vamos fazer a formatação de moédas

        NumberFormat.getInstance();

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        Locale localeUs = Locale.US;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJp);
        nfa[2] = NumberFormat.getCurrencyInstance(localeItaly);
        nfa[3] = NumberFormat.getCurrencyInstance(localeUs);

        double valor = 10_000.2130;

        // Aqui a quantidade de casas decimais é menor

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.getCurrency() + numberFormat.format(valor));

        }

        // Então praticamente a formatação de moedas segue o mesmo formato da formatação de números
        // Mas vamos ver alguns métodos úteis

        // Aqui para realizarmos o parse de um String temos que realizar o parse da moeda exatamente

        String valorString = "$10,000.21";

        try {
            System.out.println(nfa[3].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
