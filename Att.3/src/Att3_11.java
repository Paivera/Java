import java.util.Scanner;

public class Att3_11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja ver da sequência de fibonacci:");
        int n = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
        scanner.close();
    }
}