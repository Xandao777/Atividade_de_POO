package Questão_2;

public class Cliente extends Pessoa {
    private double saldo;
    private double limite;
    private double ChequeEspecial;

    public Cliente(String nome, int idade, String cpf, double saldao, double limite, double chequeEspecial) {
        super(nome, idade, cpf);
        this.saldo = 0.0;
        this.limite = 0.0;
        this.ChequeEspecial = 0.0;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getChequeEspecial() {
        return ChequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        ChequeEspecial = chequeEspecial;
    }

    public void sacar(double valor) {
        if (valor <= saldo + ChequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}
