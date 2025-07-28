package Metodos;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nomeFuncionario = "João";
        funcionario1.idadeFuncionario = 22;
        funcionario1.salario1 = 1563;
        funcionario1.salario2 = 1589;
        funcionario1.salario3 = 1600;

        funcionario1.mostrarDadosDoFuncionario();
        System.out.println(funcionario1.calcularMediaSalario());
    }
}
