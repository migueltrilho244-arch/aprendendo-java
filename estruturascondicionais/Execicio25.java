package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio25 {
    static void main(String[] args) {

        int xp = 7500;

        if (xp < 1000) {
            System.out.println("Iniciciante");
        } else if (xp < 5000) {
            System.out.println("Intermediário");
        } else if (xp < 10000) {
            System.out.println("Avançado");
        } else {
            System.out.println("Lendário");
        }
    }
}
