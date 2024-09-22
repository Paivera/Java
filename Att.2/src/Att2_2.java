import java.util.Scanner;

public class Att2_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 10: ");
            int numero = scanner.nextInt();
            
            String numeroExtenso = NumeroPorExtenso(numero);
            System.out.println("O número por extenso é: " + numeroExtenso);
            
            if (numero > 5) {
                System.out.println("Números posteriores:");
                for (int i = numero + 1; i <= 10; i++) {
                    System.out.println(NumeroPorExtenso(i));
                }
            }
        }
    }

    public static String NumeroPorExtenso(int numero) {
        switch (numero) {
            case 1:
                return "um";
            case 2:
                return "dois";
            case 3:
                return "três";
            case 4:
                return "quatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "sete";
            case 8:
                return "oito";
            case 9:
                return "nove";
            case 10:
                return "dez";
            default:
                return "Número fora do intervalo";
        }
    }
}

