import java.util.Scanner;

public class Att1_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite sua nota:");
        Scanner scanner = new Scanner (System.in);

        double nota = scanner.nextDouble();
        
        if (nota >= 5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
