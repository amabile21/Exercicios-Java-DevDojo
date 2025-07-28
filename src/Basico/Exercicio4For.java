package Basico;

public class Exercicio4For {
    public static void main(String[] args) {
//        Imprimir todos os números pares de 0 até 1 milhão

        for(int i = 0; i <= 1_000_000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
