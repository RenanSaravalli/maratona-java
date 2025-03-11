package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        // (condição) ? verdadeiro : false ;

        System.out.println(resultado);

        /* O valor do operador ternário tem que ser retornado para algo
        seja uma variável ou System.out.println()  */

        // Operador ternário com mais condições
        int idade = 15;
        String categoria;
        // Não é recomendável fazer isso
        categoria = (idade < 15) ? "Categoria Infantil" : idade > 15 && idade <= 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
