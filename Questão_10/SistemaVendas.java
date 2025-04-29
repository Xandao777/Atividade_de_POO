package Questão_10;
import java.util.Scanner;
public class SistemaVendas {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;

        System.out.println("Selecione o tipo de usuário:");
        System.out.println("1. Vendedor");
        System.out.println("2. Gerente");
        System.out.println("3. Diretor");
        System.out.print("Digite o número correspondente: ");
        int tipo = scanner.nextInt();

        switch (tipo) {
            case 1 -> usuario = new Vendedor();
            case 2 -> usuario = new Gerente();
            case 3 -> usuario = new Diretor();
            default -> {
                System.out.println("Tipo inválido.");
                System.exit(0);
            }
        }

        usuario.exibirMenu();
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        usuario.executarOpcao(opcao);
        }
        
    }
}