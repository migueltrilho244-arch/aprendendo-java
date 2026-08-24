package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio31 {
    public class Main {
        public static void main(String[] args) {

            int idade = 20;

            String resultado = (idade >= 18)
                    ? "Maior de idade"
                    : "Menor de idade";

            System.out.println(resultado);
        }
    }
}
