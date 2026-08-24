package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio34 {
    public class Main {
        public static void main(String[] args) {

            int numero = 10;

            String resultado = (numero % 2 == 0)
                    ? "Número par"
                    : "Número ímpar";

            System.out.println(resultado);
        }
    }
}
