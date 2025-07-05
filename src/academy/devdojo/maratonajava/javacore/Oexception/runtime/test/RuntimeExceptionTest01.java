package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked

        // Exemplos de Unchecked -> RuntimeException
        Object object = null;
        System.out.println(object.toString());
        int[] array = {1,2};
        System.out.println(array[2]);

    }
}
