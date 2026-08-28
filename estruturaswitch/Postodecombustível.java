package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Postodecombustível {
    static void main() {

        byte tiposCombustivel;
        double litros, preco;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Qual o tipo do combustivel?
                
                1) Gasolina 
                2) Etanol
                3) Disel
                """);

        tiposCombustivel = scanner.nextByte();

        switch (tiposCombustivel){
            case 1:
                System.out.println("Quantos litros de Gasolina você desaja? ");
                litros = scanner.nextDouble();
                preco = litros * 5.89;

                System.out.printf("Preço total do combustivel é R$%f " ,preco);
                break;
            case 2:
                System.out.println("Quantos litros de Etanol você desaja? ");
                litros = scanner.nextDouble();
                preco = litros * 3.99;

                System.out.printf("Preço total do combustivel é R$%f " ,preco);
                break;
            case 3:
                System.out.println("Quantos litros de Disel você desaja? ");
                litros = scanner.nextDouble();
                preco = litros * 6.19;

                System.out.printf("Preço total do combustivel é R$%f " ,preco);
                break;
            default:
                System.out.println("Não existe essa opção!");
        }

        scanner.close();
    }
}
