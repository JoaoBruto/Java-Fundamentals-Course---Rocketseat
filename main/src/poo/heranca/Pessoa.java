package poo.heranca;

class Ser { // Super classe
    String nome;
    int idade;

    void setNome(String nome) {
        this.nome = nome;
    };

    void SetIdade(int idade) {
        this.idade = idade;
    }
}

// Sub classe
public class Pessoa extends Ser { // Aqui "Pessoa" se tornou um "Ser"
    void criaMain() {
        this.idade = 22; // Eu tenho idade, mesmo não tendo declarado nessa classe
    }
}
