package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // Aprendendo a utilizar o for each em arrays multidimensionais
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 32;

        dias[1][0] = 20;
        dias[1][1] = 26;
        dias[1][2] = 11;

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
