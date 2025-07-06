package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e ) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalAccessError e ) {
            System.out.println("Dentro do IllegalAccessError");
        }catch (ArithmeticException e ) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro da Exceção mais genérica RunTimeException");
        }

        try {
            talvezExecute();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }


        return null;
    }

    public static void talvezExecute() throws SQLException, FileNotFoundException {

    }
}
