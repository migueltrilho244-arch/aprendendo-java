package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio36 {
    public class Main {
        public static void main(String[] args) {

            boolean usuarioLogado = true;

            String resultado = usuarioLogado
                    ? "Usuário logado"
                    : "Usuário desconectado";

            System.out.println(resultado);
        }
    }
}
