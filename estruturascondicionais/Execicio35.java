package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio35 {
    public class Main {
        public static void main(String[] args) {

            double valorCompra = 150;

            String resultado = (valorCompra >= 100)
                    ? "Tem desconto"
                    : "Não tem desconto";

            System.out.println(resultado);
        }
    }
}
