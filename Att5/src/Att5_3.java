import java.util.Scanner;

public class Att5_3 {
    public static void main(String[] args) throws Exception {
        double[] notas = new double[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
        System.out.println("Informe as notas" + (i + 1) + ": ");
        notas[i] = scanner.nextDouble();
        }

        double maiorNota = notas[0];
        double menorNota = notas[0];
        double somaNotas = 0;

        for (double nota : notas){
            if (nota > maiorNota) {
                maiorNota = nota;    
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            somaNotas += nota;
        }
        double media = somaNotas / notas.length;

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média é: " + media);
        
        scanner.close();
    }
}