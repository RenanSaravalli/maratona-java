package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Array não é um tipo primitivo e sim do reference
        // Como é uma variável do tipo reference podemos inicializar como null
        // Mas as do tipo primitivo não podemos

        int[] idades = new int[3];

        System.out.println(idades);
        // [I@65ab7765

        System.out.println(idades[0]);
        // 0

        // Atribuindo valores

        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[0] + " " + idades[1] + " " + idades[2]);
        // 21 15 11
    }
}
