package Questão_9;

public class Conta {
    private double saldo;
    private String nomeTitular;

    public Conta(double saldo, String nomeTitular) {
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de saque inválido ou limite excedido.");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de transferência inválido ou limite excedido.");
        }
    }
    
}
