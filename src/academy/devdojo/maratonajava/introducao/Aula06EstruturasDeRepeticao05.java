package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.printf("Parcela: %d R$ %.2f\n", parcela, valorParcela);
            System.out.println("TESTE GIT CLONE");
        }
    }
}
