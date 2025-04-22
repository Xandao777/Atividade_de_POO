package Questão_3;

public class Assalariado extends Empregado {
    private double salario;

    public Assalariado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    public double getSalarioFixo() {
        return salario;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salario = salarioFixo;
    }

    @Override
    public double vencimento() {
        return salario;
    }
    
}
