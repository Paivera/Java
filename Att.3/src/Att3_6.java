import java.util.Scanner;

public class Att3_6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        scanner.close();
    }
}
