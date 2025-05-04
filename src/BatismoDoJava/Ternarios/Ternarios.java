package BatismoDoJava.Ternarios;

public class Ternarios {
    public static void main(String[] args) {
        /*
        *
        * Maneiras de reduzir o código
        *
        * */

        short numeroDePessoas = 9;

        String nivel = (numeroDePessoas >= 10) ? "10 ou mais pessoas " : "Menos de 10 pessoas";

        System.out.println(nivel);
    }
}
