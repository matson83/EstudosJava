package BatismoDoJava.Iniciante.Scanner;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        *
        * O BatismoDoJava.Iniciante.Scanner traz o usuario para dentro da aplicacao
        *
        * */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeNinja = entrada.nextLine();
        System.out.println(nomeNinja);



        //fechar sempre o scanner
        entrada.close();


    }
}
