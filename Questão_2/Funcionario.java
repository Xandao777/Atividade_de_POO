package Questão_2;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = 0.0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    
}
