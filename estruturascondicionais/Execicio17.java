package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio17 {
    static void main(String[] args) {

        int idade = 20;
        boolean temCNH = true;

        if (idade >= 18 && temCNH) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

    }
}
