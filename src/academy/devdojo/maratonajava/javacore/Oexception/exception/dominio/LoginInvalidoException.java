package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        System.out.println("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
