package Metodos;

public class Funcionario {

// Classe funcionário com os atributos: nome, idade, salário (3 salários devem ser armazenados)
//    A classe deve ter 2 métodos: 1 - imprimir os dados. 2 - tirar a média dos salários e imprimir o resultado

    String nomeFuncionario;
    int idadeFuncionario;
    int salario1, salario2, salario3; // correção: deveria usar array para armazenar os salários: double[] salario;

    public void mostrarDadosDoFuncionario (){

        System.out.println("-- Informações do funcionário --");
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Idade: " + idadeFuncionario);
        System.out.printf("Últimos 3 salários do %s, foram:  %d %d %d \n", nomeFuncionario, salario1, salario2, salario3);
    }

    public double calcularMediaSalario() {
        System.out.println("\nA média dos últimos salários do " + nomeFuncionario + " é: ");
        return (double) salario1 + salario2 + salario3 / 3;
    }
}
