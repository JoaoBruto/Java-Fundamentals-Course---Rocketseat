import java.util.ArrayList;

public class classes {

    String nome;
    static String nome2;
    public static void main(String[] args) {
        System.out.println(nome2);
    }

    public static void teste() {

    }

    void declaraNome(){
        System.out.println(nome2);
        classes.teste();
        nome = "João";
    }
    String GetNome() {
        return nome;
    }
}