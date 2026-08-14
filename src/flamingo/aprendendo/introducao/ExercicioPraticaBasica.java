package flamingo.aprendendo.introducao;

public class ExercicioPraticaBasica {
    /*Eu <nome> morendo no endereço <enderço>, confinrmo o salario de <salario> na data <data>*
     * */
    static void main(String[] args) {
        //definiçoes
        String nome = "Miguel";
        String endereço = "São Paulo, SP";
        float salario = 5700.00f;
        short dia = 06;
        String mês = "Agosto";
        //Respostas
        System.out.println("Eu " +nome + ", morando no endereço: " + endereço + " confirmo " + salario);
        System.out.println(new StringBuilder().append("o dia do vale ").append(dia).append("o mês do salario").append(mês).toString());
    }
}
