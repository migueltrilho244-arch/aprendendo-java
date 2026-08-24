package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio33 {
    public class Main {
        public static void main(String[] args) {

            double saldo = 500;
            double valorProduto = 300;

            String resultado = (saldo >= valorProduto)
                    ? "Compra aprovada"
                    : "Saldo insuficiente";

            System.out.println(resultado);
        }
    }
}
