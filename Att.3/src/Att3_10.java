import java.util.Scanner;

public class Att3_10 {

    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números primos:");
        int n = scanner.nextInt();

        int contador = 0;
        int numero = 2;

        while (contador < n) {
            if (primo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
        scanner.close();
    }
}
