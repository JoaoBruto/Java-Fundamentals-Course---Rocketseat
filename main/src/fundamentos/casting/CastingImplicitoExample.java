import java.util.ArrayList;

public class CastingImplicitoExample {
    public static  void main(String[] args) {
        int idade1 = 22;
        double idade2 = idade1;
        idade1 = (int) idade2;
        System.out.println(idade1);
    }
}