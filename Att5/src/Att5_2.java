import java.util.Scanner;

public class Att5_2 {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
        System.out.println("Informe as notas" + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
        }

        System.out.println("As notas armazenados são:");
        for (int num: numeros) {
            System.out.println(num);
        }
        scanner.close();
    }
}