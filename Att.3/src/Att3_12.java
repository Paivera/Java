import java.util.Scanner;

public class Att3_12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do losango: ");
        int altura = scanner.nextInt();

        int largura = altura * 2 - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (j >= altura - 1 - i && j <= altura - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = altura - 2; i >= 0; i--) {
            for (int j = 0; j < largura; j++) {
                if (j >= altura - 1 - i && j <= altura - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}