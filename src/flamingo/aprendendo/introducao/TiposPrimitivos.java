package flamingo.aprendendo.introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // byte : -128 a 127
        // short : -32.768 a 32.767
        // int : -2 bilhoes a 2 bilhoes
        // long : Para número inteiros muito grandes (usa um l no final do número)
        // float : Prencisão simplas (usa um f no final, ex: 5.5f).
        //double : Precisão dupla, sendo o padrão para decimais no java
        //char : Guarda uma unica letra ou simbolo em formato unicode (ex: 'A')
        //boolean :Guarda apenas dois valores: true(verdadeiro) ou false (falso)
        short idade = 20;
        int municipio = 200000000;
        long contaBancaria = 99999999999999l;
        float salario = 15000.66f;
        double salarioExtra = 2500.50;
        char primeiraLetradoNome = 'R';
        boolean vaiEstudarNasFeiras = false;
        System.out.println(vaiEstudarNasFeiras);
        System.out.println("primeira letra do meu nome é " + primeiraLetradoNome);
        System.out.println("Pl caiu = " + salarioExtra);
        System.out.println("Meu salario depois de estudar com bigas é" + salario);
        System.out.println("Minha idade é" +idade);
        System.out.println("São Paulo (sp): Mais de" + municipio + "milhoes de moradores.");
        System.out.println("Minha conta bancaria daqui a 5 anos" + contaBancaria);
    }
}
