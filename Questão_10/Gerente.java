package Questão_10;

public class Gerente extends Usuario {
    @Override
    public void exibirMenu() {
        System.out.println("Menu Gerente:");
        System.out.println("1. Vender");
        System.out.println("2. Imprimir comprovante");
        System.out.println("3. Cadastrar vendedor");
        System.out.println("4. Cadastrar produto");
    }

    @Override
    public void executarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> System.out.println("Venda realizada com sucesso!");
            case 2 -> System.out.println("Comprovante impresso!");
            case 3 -> System.out.println("Vendedor cadastrado!");
            case 4 -> System.out.println("Produto cadastrado!");
            default -> System.out.println("Opção inválida.");
        }
    }
}
