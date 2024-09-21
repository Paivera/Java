import java.util.Scanner;

public class Att4 {
    
    public static void main(String[] args) {

        try (Scanner userIn = new Scanner(System.in)) {

            System.out.print("Insira 4 números: ");
            int num1 = userIn.nextInt();
            int num2 = userIn.nextInt();
            int num3 = userIn.nextInt();
            int num4 = userIn.nextInt();

            int menorNum = num1;
            int maiorNum = num1;

            if (num2 < menorNum) menorNum = num2;
            if (num3 < menorNum) menorNum = num3;
            if (num4 < menorNum) menorNum = num4;

            if (num2 > maiorNum) maiorNum = num2;
            if (num3 > maiorNum) maiorNum = num3;
            if (num4 > maiorNum) maiorNum = num4;

            System.out.println("O maior número é: " + maiorNum);
            System.out.println("O menor número é: " + menorNum);
        }    
    }
}
