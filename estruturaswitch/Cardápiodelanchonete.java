package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Cardápiodelanchonete {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int opcaoLanche;

        byte quantidade;

        double total;

        System.out.println("Escolha um lanche:");
        System.out.println("1 - Hambúrguer");
        System.out.println("2 - Pizza");
        System.out.println("3 - Batata frita");
        System.out.println("4 - Refrigerante");
        System.out.println("5 - Suco");
        System.out.print("Digite a opção: ");

        opcaoLanche = scanner.nextInt();
        System.out.print("Digite a quantidade: ");

        quantidade = scanner.nextByte();

        if (opcaoLanche == 1) {
            total = quantidade * 25.00;
            System.out.println("Item escolhido: Hambúrguer");

        } else if (opcaoLanche == 2) {
            total = quantidade * 40.00;
            System.out.println("Item escolhido: Pizza");

        } else if (opcaoLanche == 3) {
            total = quantidade * 18.00;
            System.out.println("Item escolhido: Batata frita");

        } else if (opcaoLanche == 4) {
            total = quantidade * 8.00;
            System.out.println("Item escolhido: Refrigerante");

        } else if (opcaoLanche == 5) {
            total = quantidade * 10.00;
            System.out.println("Item escolhido: Suco");

        } else {
            System.out.println("Opção inválida");
            return;
        }

        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total do pedido: R$ " + total);

        scanner.close();
    }
}