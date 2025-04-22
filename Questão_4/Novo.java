package Questão_4;

public class Novo extends imovel {
    private double valorAdicional;

    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public double getPrecoFinal() {
        return getPreco() + valorAdicional;
    }
}
