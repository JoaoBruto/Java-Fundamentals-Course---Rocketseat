import java.util.ArrayList;

public class classes {
    String nome;
    static String nome2;
    public static void main(String[] args) {
        System.out.println(nome2);
    }

    void declaraNome(){
        nome2 = "Pedro";
        nome = "João";
    }
    String GetNome() {
        return nome2;
    }
}