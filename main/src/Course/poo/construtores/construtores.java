import java.util.ArrayList;

public class construtores {
    String nome;
    int idade;
    static String nome2;

    public static void main(String[] args) {
        nome2 = "João";
        System.out.println(nome2);
    }

    public construtores(String nome) {
        this.nome = nome;
    }

    public construtores(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
};

class pessoa {
    void CriaConstrutores() {
        construtores MeuMain = new construtores("João Rodrigo", 17);
    }
}