package BatismoDoJava.LacosDeRepeticao;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        *
        * Vão repetir um bloco de codigo qunatas vezes o parametro pedir
        * while
        * for
        * */

        // while

        int contador = 0;
        int maximo = 10;

        while (contador <= maximo) {
            System.out.println("Contador: " + contador);
            contador++;

        }

        // for

        for (int i = 0 ; i <= maximo; i++){
            System.out.println("Contador: " + i);
        }



    }
}
