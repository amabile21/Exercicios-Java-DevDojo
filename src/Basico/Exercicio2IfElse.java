package Basico;

public class Exercicio2IfElse {
    public static void main(String[] args) {
//        Exercicio: calcular o imposto anual com base no salario anual (da Holanda)

        double salarioAnual = 10000.00;
//      primeira tentativa com o salario na variável (não deu certo)
//      double primeiraFaixa = 34712.00; //imposto anual 9.70
//      double segundaFaixa = 68507.00; // imposto anual 37.35
//      double terceiraFaixa = 68508.00; // imposto anual 49.50

//      segunda tentativa:
        double impostoPrimeiraFaixa = 9.70 / 100;
        double impostoSegundaFaixa = 37.35 / 100;
        double impostoTerceiraFaixa = 49.50 / 100;

        System.out.println("Seu salário é: " + salarioAnual + ", e o imposto que você deve pagar é:");

        if(salarioAnual < 34713.00){
            double totalImpostoPrimeiraFaixa = salarioAnual * impostoPrimeiraFaixa;
            System.out.println(totalImpostoPrimeiraFaixa);
        } else if (salarioAnual > 34714.00 && salarioAnual < 68507.00) {
            double totalImpostoSegundaFaixa = salarioAnual * impostoSegundaFaixa;
            System.out.println(totalImpostoSegundaFaixa);
        } else {
            double totalImpostoTerceiraFaixa = salarioAnual * impostoTerceiraFaixa;
            System.out.println(totalImpostoTerceiraFaixa);
        }


    }
}
