package Basico;

public class Exercicio3Switch {
    public static void main(String[] args) {
//        Imprimir se o dia da semana é dia útil ou final de semana
//        Considerando o número 1 sendo Domingo

        int diaDaSemana = 6;

        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
                System.out.println("Terça - Dia útil");
                break;
            case 4:
                System.out.println("Quarta - Dia útil");
                break;
            case 5:
                System.out.println("Quinta - Dia útil");
                break;
            case 6:
                System.out.println("Sexta - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Final de semana");
            default:
                System.out.println("Opção Inválida");
        }
    }
}

class correcaoDoExercicioDevDojo {

    public static void main(String[] args) {
//        poderia colocar os dias em um só
        byte diaDaSemana = 6;

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
        }
    }
}

// outra resolução seria:
// A partir do Java 14, com o switch expression
//
//        switch (dia) {
//        case 1, 7 -> System.out.println("Fim de semana");
//	      case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
//        default -> throw new IllegalArgumentException("Unexpected value: " + dia);
//        }

