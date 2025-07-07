package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String userNameDB = "Goku";
        String userSenhaDB = "SSJ";
        System.out.println("Usuário: ");
        String userNameDigt = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaNameDigt = scanner.nextLine();

        if (!userNameDB.equals(userNameDigt) || !userSenhaDB.equals(senhaNameDigt)) {
            throw new LoginInvalidoException("Usuário ou senha incorretos!");
        }

        System.out.println("Login efetuado!!");
    }
}
