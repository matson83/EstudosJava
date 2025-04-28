package Projeto;

import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Calculadora java - Menu");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >=1 && opcao <= 4){

                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true ;

                switch (opcao){
                    case 1:
                        resultado = adicionar(num1,num2);
                        break;
                    case 2:
                        resultado = subtrair(num1,num2);
                        break;
                    case 3 :
                        resultado = multiplicar(num1,num2);
                        break;
                    case 4 :
                        if(num2==0){
                            operacaoValida = false;
                        }
                        resultado = dividir(num1,num2);
                        break;
                    default:
                        operacaoValida = false;
                        break;
                }

                if (operacaoValida) {
                    System.out.println("Resultado: " + resultado);
                }

            }else if(opcao != 0 ){
                System.out.println("Opção inválida! Tente novamente.");
            }

        }while (opcao != 0);

        System.out.println("Saindo...");
        scanner.close();
    }

    public static double adicionar(double num1, double num2){
        return num1 + num2;
    }
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2){
        return num1 / num2;
    }
}
