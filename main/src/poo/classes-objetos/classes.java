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

        classes MeuMain = new classes();
        System.out.println(MeuMain.nome);
        MeuMain.declaraNome();
    }
    String GetNome() {
        return nome;
    }
}