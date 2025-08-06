package LeituraDeDados;
import java.util.Scanner;
import java.util.Random;

public class PrevisaoDoFuturo {
//    Criar um mini sistema que lê uma pergunta e "adivinha" o futuro, com respostas de "sim" e "não"

    public static void main(String[] args) {
        Scanner leituraDoTeclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Faça uma pergunta e vou adivinhar seu futuro!");
        leituraDoTeclado.next();

        int numeros = random.nextInt(1, 2);

        if (numeros == 1) {
            System.out.print("Sim!");
        } else {
            System.out.print("Não!");
        }
    }
}