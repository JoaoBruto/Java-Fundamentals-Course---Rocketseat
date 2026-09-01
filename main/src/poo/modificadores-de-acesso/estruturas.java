public class estruturas {

    public String name;
    private int salario;
    public static void main(String[] args) {

    }

    void AtualizaSalario() {
        this.salario = 4000;
    }
}

class Pessoa {
    void criaMain() {
        estruturas MeuMain = new estruturas();
        System.out.println(MeuMain.name);
        System.out.println(MeuMain.salario);
    }
}