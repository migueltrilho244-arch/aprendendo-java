package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio38 {
    public class Main {
        public static void main(String[] args) {

            double temperatura = 30;

            String resultado = (temperatura > 25)
                    ? "Calor"
                    : "Frio";

            System.out.println(resultado);
        }
    }
}
