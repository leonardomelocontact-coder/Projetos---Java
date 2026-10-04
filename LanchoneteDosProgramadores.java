import java.util.Scanner;

public class LanchoneteDosProgramadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int opcao;

        while (true) {
            System.out.println("\n===== LANCHONETE DOS PROGRAMADORES =====");
            System.out.println("1 - Hambúrguer ........ R$ 20,00");
            System.out.println("2 - Batata frita ...... R$ 12,00");
            System.out.println("3 - Refrigerante ...... R$ 6,00");
            System.out.println("4 - Exibir total do pedido");
            System.out.println("0 - Finalizar pedido");

            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    total += 20.00;
                    System.out.println("Hambúrguer adicionado ao pedido!");
                    break;

                case 2:
                    total += 12.00;
                    System.out.println("Batata frita adicionada ao pedido!");
                    break;

                case 3:
                    total += 6.00;
                    System.out.println("Refrigerante adicionado ao pedido!");
                    break;

                case 4:
                    System.out.printf("Total atual: R$ %.2f%n", total);
                    break;

                case 0:
                    System.out.println("Pedido finalizado!");
                    System.out.printf("Valor total: R$ %.2f%n", total);
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
