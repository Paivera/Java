import java.util.Scanner;

public class tt1_5 {

    public static void main(String[] args) {

       try (Scanner userIn = new Scanner(System.in)){

            System.out.println("Informe as notas do aluno:");

            double nota1 = userIn.nextDouble();
            double nota2 = userIn.nextDouble();

            double media = (nota1 + nota2) / 2;

            if (media >= 5) {
            System.out.println("Aprovado");
            } else {
                System.out.println("Informe a terceira nota do aluno:");
                double nota3 = userIn.nextDouble();

                if (nota1 < nota2) {
                    nota1 = nota3;
                } else {
                    nota2 = nota3;
                }

                media = (nota1 + nota2) / 2;

                if (media >= 5) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
            }    
        }
    }
}
