import java.util.ArrayList;

public class CastingExplicitoExample {
    public static  void main(String[] args) {
        int idade1 = 22;
        double idade2 = idade1;
        char letra = 'A';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0);
    }
}