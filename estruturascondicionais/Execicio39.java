package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio39 {
    public class Main {
        public static void main(String[] args) {

            double valorCompra = 180;

            double frete = (valorCompra >= 150)
                    ? 0
                    : 20;

            System.out.println("Valor do frete: R$ " + frete);
        }
    }
}
