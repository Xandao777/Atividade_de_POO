package Questão_9;

public class ContaCorrente extends Conta {
    private double taxaSaque;

    public ContaCorrente(double saldo, String nomeTitular, double taxaSaque) {
        super(saldo, nomeTitular);
        this.taxaSaque = 0.1;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() - valor - taxaSaque);
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Valor de saque inválido ou limite excedido.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor );
            System.out.println("Depósito de " + valor + " realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void transferirParaPoupanca(ContaPoupanca contaPoupanca, double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            this.sacar(valor);
            contaPoupanca.depositar(valor);
            System.out.println("Transferência de " + valor + " para a conta poupança realizada com sucesso.");
        } else {
            System.out.println("Transferência inválida. Verifique o saldo ou o valor.");
        }
    }
    
    
}
