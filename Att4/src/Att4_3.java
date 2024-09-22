import java.util.Scanner;

public class Att4_3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       int soma = 0;
       int valor;

        while (soma <= 1000) {
            System.out.println("Digite um valor para somar: ");
            valor = scanner.nextInt();
            soma += valor;
            System.out.println("Soma atual: " + soma);
        }
        System.out.println("A soma ultrapassou 1000. Soma final: " + soma);
        scanner.close();
    }
}