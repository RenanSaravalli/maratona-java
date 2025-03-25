package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Trabalhando com arrays multidimensionais
        // 1, 2, 3, 4, 5 Meses
        // 31, 28, 31, 30 dias
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 32;

        dias[1][0] = 20;
        dias[1][1] = 26;
        dias[1][2] = 11;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }

        }
    }
}
