import java.util.Scanner;

public class tt1_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero:");
        Scanner scanner = new Scanner (System.in);

        double numero = scanner.nextDouble();
        
        if (numero%2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        scanner.close();
    }
}