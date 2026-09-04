public class Main {
    public String name;
    protected int salary;

    public static void main(String[] args) {
        Ser meuSerHumano = new Pessoa("João", 17, "Ferreira", "rua87");
        meuSerHumano.SetNome("João");
        meuSerHumano.saudacao();

    }
}