import java.util.Scanner;

public class Att4_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int contador = 0;

        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }
        scanner.close();
    }
}
