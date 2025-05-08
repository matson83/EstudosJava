package BatismoDoJava.Iniciante.Switch;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        *
        * Serve para gerar casos específicos
        *
        * */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um personagem :");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int escolhaDoUsuario = entrada.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu o Naruto");
                break;

            case 2:
                System.out.println("Você escolheu o Sasuke");
                break;

            case 3 :
                System.out.println("Você escolheu a Sakura");
                break;

            default:
                System.out.println("Você não escolheu nada");
                break;


        }




        entrada.close();


    }
}
