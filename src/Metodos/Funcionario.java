package Metodos;

public class Funcionario {

// Classe funcionário com os atributos: nome, idade, salário (3 salários devem ser armazenados)
//    A classe deve ter 2 métodos: 1 - imprimir os dados. 2 - tirar a média dos salários e imprimir o resultado

    String nomeFuncionario;
    int idadeFuncionario;
    double[] salario;

    public void mostrarDadosDoFuncionario (){

        System.out.println("-- Informações do funcionário --");
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Idade: " + idadeFuncionario);
        System.out.printf("Últimos salários do %s, foram: ", nomeFuncionario);
        for (int i = 0; i < salario.length; i++) {
            System.out.print(salario[i] + " ");
        }
    }


    public double calcularMediaSalario() {
        double soma = salario[0] + salario[1] + salario[2];
        double media = soma / 3;
        System.out.printf("\nA média dos últimos salários do " + nomeFuncionario + " é: %.2f", media);
        return media;
    }
}
