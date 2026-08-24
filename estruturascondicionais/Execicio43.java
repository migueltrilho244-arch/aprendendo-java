package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio43 {
    public class Main {
        public static void main(String[] args) {

            int idade = 20;
            boolean temCarteirinhaEstudante = true;

            if (idade < 12) {
                System.out.println("Paga meia-entrada.");
            } else if (temCarteirinhaEstudante) {
                System.out.println("Paga meia-entrada.");
            } else {
                System.out.println("Paga entrada inteira.");
            }
        }
    }
}
