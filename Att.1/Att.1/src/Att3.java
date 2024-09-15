import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Calculadora Java\n");

            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = 0;

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
                    return;
            }

            System.out.println("O resultado da operação é: " + resultado);
        }
    }
}