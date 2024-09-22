import java.util.Scanner;

public class Att5_1 {
    public static void main(String[] args) throws Exception {
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
        System.out.println("Digite o nome:" + (i + 1) + ": ");
        nomes[i] = scanner.nextLine();
        }

        System.out.println("Os nomes armazenados são:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        scanner.close();
    }
}