package Basico;

public class Exercicio6Break {
    public static void main(String[] args) {
//        Dado o valor de um carro, descobrir em quantas vezes ele pode ser parcelado
//        O valor da parcela deve ser >= 1_000
//        Esse exercício foi difícil, então copiei o código das aulas, para tentar entender, e fiz alguns ajustes

        double valorTotalDoCarro = 50_000;

        for (int parcelas = 1; parcelas <= valorTotalDoCarro; parcelas++) {
            double valorParcela = valorTotalDoCarro / parcelas;
            if(valorParcela < 1_000) {
                break; // quando a última parcela for menor do que 1000, o código para
            }
            System.out.println("Quantidade de parcelas: " + parcelas);
        }
    }
}
