package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio40 {
    public class Main {
        public static void main(String[] args) {

            double salario = 2500;

            double bonus = (salario < 3000)
                    ? 500
                    : 200;

            System.out.println("Valor do bônus: R$ " + bonus);
        }
    }
}
