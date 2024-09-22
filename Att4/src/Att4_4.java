import java.util.Scanner;

public class Att4_4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       int subtracao = 0;
       int valor;

        while (subtracao > -1000) {
            System.out.println("Digite um valor para subtrair: ");
            valor = scanner.nextInt();
            subtracao -= valor;
            System.out.println("Subtração atual: " + subtracao);
        }
        System.out.println("A subtração ultrapassou -1000. Subtração final: " + subtracao);
        scanner.close();
    }
}