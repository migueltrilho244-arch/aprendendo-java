package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio44 {
    public class Main {
        public static void main(String[] args) {

            boolean emailCorreto = true;
            boolean senhaCorreta = true;
            boolean contaAtiva = true;

            if (emailCorreto && senhaCorreta && contaAtiva) {
                System.out.println("Login realizado");
            } else if (!contaAtiva) {
                System.out.println("Conta bloqueada");
            } else {
                System.out.println("Dados inválidos");
            }
        }
    }
}
