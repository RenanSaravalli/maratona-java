package academy.devdojo.maratonajava.javacore.Pwrapper.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
       byte byteP = 1;
       short shortP = 1;
       int intP = 1;
       long longP = 10L;
       float floatP = 1.0f;
       double doubleP = 1.1d;
       char charP = 'W';
       boolean booleanP = true;

       Byte byteW = 1; // autoboxing
       Short shortW = 1;
       Integer intW = 1;
       Long longW = 10L;
       Float floatW = 1.0f;
       Double doubleW = 1.1d;
       Character charW = 'W';
       Boolean booleanW = true;

       int i = intW; // unboxing

        Integer intW2 = Integer.parseInt("69");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
