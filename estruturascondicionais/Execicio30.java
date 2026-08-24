package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio30 {
    public class Main {
        public static void main(String[] args) {

            int tipoCliente = 3;
            double valorCompra = 500;
            double desconto;
            double valorFinal;

            if (tipoCliente == 1) {
                desconto = 0;
            } else if (tipoCliente == 2) {
                desconto = 0.05;
            } else if (tipoCliente == 3) {
                desconto = 0.10;
            } else if (tipoCliente == 4) {
                desconto = 0.15;
            } else {
                System.out.println("Tipo de cliente inválido.");
                return;
            }

            valorFinal = valorCompra - (valorCompra * desconto);

            System.out.println("Valor da compra: R$ " + valorCompra);
            System.out.println("Desconto: " + (desconto * 100) + "%");
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }
}
