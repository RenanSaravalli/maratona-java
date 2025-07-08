package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "renan"; // String constant pool
        String nome2 = "renan";
        System.out.println(nome == nome2); // true
        /*Isso significa que as duas variáveis de referência estão fazendo referência para um mesmo objeto
        * em memória sendo renan que está em pool de constantes do java */
        String nomezin = nome.concat(" Pirocudo");
        System.out.println(nome); // ainda continua sendo renan
        System.out.println(nomezin); // Nova associação
        String objetoPirocudo = new String("Pedrinho"); // 1 variávevl de referência, 2 Obj tipo String, 3 uma String no pool de String


    }
}
