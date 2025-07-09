package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        // Agora vamos fazer a formatação de números

        NumberFormat.getInstance();

        // NumberFormat é uma classe abstrata
        // para pegar um objeto da classe utilizamos getInstance ou qualquer um dos get

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        Locale localeUs = Locale.US;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localeBR);
        nfa[1] = NumberFormat.getInstance(localeJp);
        nfa[2] = NumberFormat.getInstance(localeItaly);
        nfa[3] = NumberFormat.getInstance(localeUs);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2); // alterando a quantidade de casas decimais
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.getCurrency() + numberFormat.format(valor));

        }

        // Podemos realizar o parse de uma String para NumberFormat
        String valor1 = "1000.2134";
        try {
            System.out.println(nfa[0].parse(valor1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
