public class estruturas {

    public String name;
    private int salario;
    public static void main(String[] args) {

    }

    public void AtualizaSalario() {
        this.salario = 4000;
    }
}

class Pessoa {
    void criaMain() {
        estruturas MeuMain = new estruturas();
        MeuMain.name = "João"; // public
        MeuMain.AtualizaSalario(); // public

        //MeuMain.salario = 4000 // private
    }
}