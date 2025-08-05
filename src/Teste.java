import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random num = new Random();

        int numero = num.nextInt(5, 10);
        System.out.println();
        System.out.println("Número: "+ numero);
    }
}
