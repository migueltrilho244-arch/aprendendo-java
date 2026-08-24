package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Execicio29 {
    public class Main {
    public static void main(String[] args) {

        double imc = 22.5;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
}
