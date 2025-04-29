package Questão_10;

import java.util.Scanner;

public class Diretor extends Usuario {
    @Override
    public void exibirMenu() {
        System.out.println("Menu Diretor:");
        System.out.println("1. Vender");
        System.out.println("2. Imprimir comprovante");
        System.out.println("3. Cadastrar vendedor");
        System.out.println("4. Cadastrar produto");
        System.out.println("5. Gerenciar financeiro");
        System.out.println("6. Emitir relatório");
    }

    @Override
    public void executarOpcao(int opcao) {
    Scanner scanner = new Scanner(System.in);

    switch (opcao) {
        case 1 -> System.out.println("Venda realizada com sucesso!");
        case 2 -> System.out.println("Comprovante impresso!");
        case 3 -> System.out.println("Vendedor cadastrado!");
        case 4 -> System.out.println("Produto cadastrado!");
        case 5 -> System.out.println("Financeiro gerenciado!");
        case 6 -> {
            System.out.println("Tipos de relatório:");
            System.out.println("1. Genérico");
            System.out.println("2. Por produto");
            System.out.println("3. Por produto e cliente");
            System.out.println("4. Por produto, cliente e vendedor");
            System.out.print("Escolha o tipo de relatório: ");
            int tipoRelatorio = scanner.nextInt();
            scanner.nextLine(); 

            switch (tipoRelatorio) {
                case 1 -> emitirRelatorio();
                case 2 -> {
                    System.out.print("Informe o produto: ");
                    String produto = scanner.nextLine();
                    emitirRelatorio(produto);
                }
                case 3 -> {
                    System.out.print("Informe o produto: ");
                    String produto = scanner.nextLine();
                    System.out.print("Informe o cliente: ");
                    String cliente = scanner.nextLine();
                    emitirRelatorio(produto, cliente);
                }
                case 4 -> {
                    System.out.print("Informe o produto: ");
                    String produto = scanner.nextLine();
                    System.out.print("Informe o cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Informe o vendedor: ");
                    String vendedor = scanner.nextLine();
                    emitirRelatorio(produto, cliente, vendedor);
                }
                default -> System.out.println("Tipo de relatório inválido.");
            }
        }
        default -> System.out.println("Opção inválida.");
    }
}

    // Sobrecarga de métodos
    public void emitirRelatorio() {
        System.out.println("Relatório genérico emitido!");
    }

    public void emitirRelatorio(String produto) {
        System.out.println("Relatório do produto '" + produto + "' emitido!");
    }

    public void emitirRelatorio(String produto, String cliente) {
        System.out.println("Relatório do produto '" + produto + "', cliente '" + cliente + "' emitido!");
    }

    public void emitirRelatorio(String produto, String cliente, String vendedor) {
        System.out.println("Relatório do produto '" + produto + "', cliente '" + cliente + "', vendedor '" + vendedor + "' emitido!");
    }
}