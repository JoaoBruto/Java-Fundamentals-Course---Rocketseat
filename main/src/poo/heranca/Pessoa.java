package poo.heranca;

class Ser {
    String nome;
    int idade;

    void setNome(String nome) {
        this.nome = nome;
    };

    void SetIdade(int idade) {
        this.idade = idade;
    }
}

public class Pessoa extends Ser { // Aqui "Pessoa" se tornou um "Ser"
    void criaMain() {
        Pessoa MeuMain = new Pessoa();
        System.out.println();
    }
}
