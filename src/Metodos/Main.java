package Metodos;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nomeFuncionario = "José";
        funcionario1.idadeFuncionario = 24;
        funcionario1.salario = new double[] {1300, 1634, 3500};

        funcionario1.mostrarDadosDoFuncionario();
        funcionario1.calcularMediaSalario();
    }
}
