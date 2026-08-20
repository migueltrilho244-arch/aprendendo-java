package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    public static void main (String[] args){
        /*
        * && AND -> E
        public static void main (String[] args){
        * ! NOT -> Não
         * */

        byte idade = 20;
        boolean isCNH = true;

        boolean isEstaNALeiParaDirigir = idade >= 18 && isCNH == true;
        System.out.println(isEstaNALeiParaDirigir);
    }
}
