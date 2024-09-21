import java.util.Scanner;

public class Att3 {
    
    public static void main(String[] args) {

        try (Scanner userIn = new Scanner(System.in)){

            System.out.println("Informe o salário:");
            double salarioBruto = userIn.nextDouble();

            System.out.println("Informe uma nota de 1 a 5:");
            double nota = userIn.nextDouble();

            double valorAumento = 0;
            double salarioEntrada = salarioBruto;
    
            if(nota > 1 && nota <= 2){
                valorAumento = (salarioBruto * 5) / 100;
            } else if(nota > 2 && nota <= 3){
                valorAumento = (salarioBruto * 10) / 100;
            } else if(nota > 3 && nota <= 4){
                valorAumento = (salarioBruto * 15) / 100;
            } else if(nota > 4 && nota <= 5){
                valorAumento = (salarioBruto * 20) / 100;
            }
            
            double salarioFinal = salarioBruto + valorAumento;
            
            System.out.println("O valor de entrada: " + salarioEntrada);
            System.out.println("O aumento será: " + valorAumento);
            System.out.println("O salário final é: " + salarioFinal);
        }
    }
}
