public class Pessoa extends Ser{
    String sobrenome;
    String endereco;
    public Pessoa(String nome, int idade, String sobrenome, String endereco) {
        super(nome, idade);
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }
}
