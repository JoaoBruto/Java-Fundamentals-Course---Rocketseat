import java.util.ArrayList;

public class CastingExplicitoExample {
    public static  void main(String[] args) {
        int idade = 12;
        char letra = 'A';
        String nome = String.valueOf(letra);
        idade = Integer.parseInt(nome);

    }
}