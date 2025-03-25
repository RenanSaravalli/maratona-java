package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais03 {
    public static void main(String[] args) {
        // Vendo outras formas de inicializar arrays multidimensionais
        int[][] arrayInt = new int[3][];
        int[] arrayComSix = {6,5, 4, 3, 2, 1};

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = arrayComSix;

        // Iniciando um array multidimensional já com valores
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {6, 5, 4, 3, 2, 1}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
