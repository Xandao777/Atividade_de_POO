package Questão_9;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(double saldo, String nomeTitular, double taxaJuros) {
        super(saldo, nomeTitular);
        this.taxaJuros = 0.1;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + (valor + (valor * taxaJuros)));
            System.out.println("Deposito de " + valor + " realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Valor de depósito invalido.");
        }
    }
    @Override
    public void sacar(double valor){
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - (valor + (valor * 0.05)));
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Valor de saque invalido");
        }
    }

    public void transferirParaCorrente(ContaCorrente contaCorrente, double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            this.sacar(valor);
            contaCorrente.depositar(valor);
            System.out.println("Transferencia de " + valor + " para a conta corrente realizada com sucesso.");
        } else {
            System.out.println("Transferencia invalida. Verifique o saldo ou o valor.");
        }
    }
    
}
