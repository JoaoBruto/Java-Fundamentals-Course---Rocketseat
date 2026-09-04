class Ser {
    String nome;
    int idade;

    public Ser(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    void SetNome(String nome) {
        this.nome = nome;
    }

    void SetIdade(int idade) {
        this.idade = idade;
    }
}



public class Pessoa extends Ser{
    String sobrenome;
    String endereco;
    public Pessoa(String nome, int idade, String sobrenome, String endereco) {
        super(nome, idade);
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }

    void criaMain() {
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.salary);
        this.idade = 22;
    }
}
