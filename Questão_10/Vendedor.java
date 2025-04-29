package Questão_10;

public class Vendedor extends Usuario {
    @Override
    public void exibirMenu() {
        System.out.println("Menu Vendedor:");
        System.out.println("1. Vender");
        System.out.println("2. Imprimir comprovante");
    }

    @Override
    public void executarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> System.out.println("Venda realizada com sucesso!");
            case 2 -> System.out.println("Comprovante impresso!");
            default -> System.out.println("Opção inválida.");
        }
    }
}