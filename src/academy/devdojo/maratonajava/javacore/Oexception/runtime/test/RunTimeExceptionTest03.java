package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso do sistema operacional");
        }
        return null;
    }
}
