import java.util.ArrayList;

public class estruturas { // Só essa classe pode ser pública

    public String name;
    private int salario;
    protected String sobrenome;
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
        MeuMain.sobrenome = "Ferreira"; // protected
        //MeuMain.salario = 4000 // private
    }
}