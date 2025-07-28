package Basico;

public class Exercicio5Break {
    public static void main(String[] args) {
//        imprimir os números de 0 à 50, e parar no 25

        for(int i = 0; i < 50; i++){
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
