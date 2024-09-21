import java.util.Scanner;

public class Att6 {
    
    public static void main(String[] args) {

        try (Scanner userIn = new Scanner(System.in)){

            System.out.println("Informe o salário:");

            double salarioBruto = userIn.nextDouble();
            double valorDescontado = 0;
            double salarioLiquido = salarioBruto;
    
            if(salarioBruto >= 1000 && salarioBruto < 2000){
                valorDescontado = (salarioBruto * 7) / 100;
            } else if(salarioBruto >= 2000 && salarioBruto < 3000){
                valorDescontado = (salarioBruto * 15) / 100;
            } else if(salarioBruto >= 3000 && salarioBruto < 4000){
                valorDescontado = (salarioBruto * 22) / 100;
            } else if(salarioBruto >= 4000){
                valorDescontado = (salarioBruto * 29) / 100;
            }
            
            salarioLiquido = salarioBruto - valorDescontado;
            
            System.out.println("O valor do imposto é: " + valorDescontado);
            System.out.println("O valor descontado é: " + valorDescontado);
            System.out.println("O salário líquido é: " + salarioLiquido);
        }
    }
}
