package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio45 {
    public class Main {
        public static void main(String[] args) {

            double valorCompra = 400;
            double porcentagemDesconto;
            double valorDesconto;
            double valorFinal;

            if (valorCompra <= 100) {
                porcentagemDesconto = 0;
            } else if (valorCompra <= 300) {
                porcentagemDesconto = 0.05;
            } else if (valorCompra <= 500) {
                porcentagemDesconto = 0.10;
            } else {
                porcentagemDesconto = 0.15;
            }

            valorDesconto = valorCompra * porcentagemDesconto;
            valorFinal = valorCompra - valorDesconto;

            System.out.println("Valor original: R$ " + valorCompra);
            System.out.println("Desconto: " + (porcentagemDesconto * 100) + "%");
            System.out.println("Valor do desconto: R$ " + valorDesconto);
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }
}
