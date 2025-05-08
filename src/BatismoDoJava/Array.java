package BatismoDoJava;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[4];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o primeiro ninja?");
        ninjas[0] = entrada.nextLine();
        System.out.println("Qual o segundo ninja?");
        ninjas[1] = entrada.nextLine();
        System.out.println("Qual o terceiro ninja?");
        ninjas[2] = entrada.nextLine();
        System.out.println("Qual o quarto ninja?");
        ninjas[3] = entrada.nextLine();
        entrada.close();


        System.out.println("Os ninjas escolhidos foram: "+ninjas[0] + "," + ninjas[1] + "," + ninjas[2] + "," + ninjas[3]);

        System.out.println("Todos os ninjas são : "+ Arrays.toString(ninjas));


    }
}
