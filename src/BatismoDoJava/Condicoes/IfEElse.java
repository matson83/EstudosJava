package BatismoDoJava.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * Passar o ninja de nivel de acordo com o número de missoões
        * */

        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false ;
        int numeroDeMissoes = 14;
        String rank;

        if(numeroDeMissoes ==10 && idade > 15){
            System.out.println("Rank : Chunnin");
        }else if(numeroDeMissoes>=20){
            System.out.println("Rank : Jounin");
        }else {
            System.out.println("Rank : Gennin");
        }
    }
}
