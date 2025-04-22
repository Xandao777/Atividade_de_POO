package Questão_2;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, int idade, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
        super(nome, idade, cpf, salario);
        this.senha = 0;
        this.numeroDeFuncionariosGerenciados = 0;
    }

    public int getBonus() {
        return senha;
    }

    public void setBonus(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
    
}