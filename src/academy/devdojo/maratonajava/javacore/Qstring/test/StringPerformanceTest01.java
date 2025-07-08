package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
//        Long inicio = System.currentTimeMillis();
//        concatString(30000);
//        Long fim = System.currentTimeMillis();
//        System.out.println("Tempo gasto para String " + (fim - inicio) + " ms");

//        Long inicio2 = System.currentTimeMillis();
//        concatStringBuilder(30000);
//        Long fim2 = System.currentTimeMillis();
//        System.out.println("Tempo gasto para String Builder " + (fim2 - inicio2) + " ms");

        Long inicio3 = System.currentTimeMillis();
        concatStringBuffer(30000);
        Long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Buffer " + (fim3 - inicio3) + " ms");
    }
    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
