import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] idades = {18, 25, 32, 41};
        String[] nomes = {"Ana", "Bruno", "Carla"};

        System.out.println("Idades: " + Arrays.toString(idades));
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Quantidade de nomes: " + nomes.length);
    }
}
