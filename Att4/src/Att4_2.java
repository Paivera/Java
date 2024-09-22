import java.util.Scanner;

public class Att4_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        final int valor_saida = 0;
        int valor;

        do{
            System.out.println("Digite um valor (ou " + valor_saida + " para sair): ");
            valor = scanner.nextInt();
        }
        while (valor != valor_saida);
        
        System.out.println("programa encerrado.");
        scanner.close();
    }
}