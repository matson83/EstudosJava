package BatismoDoJava.Desafios.Desafio2;

import java.util.Arrays;
import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        int NumeroMax = 10;
        String[] ninjas = new String[NumeroMax];
        int ninjasCadastrados = 0;
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NumeroMax){
                        System.out.println("Digite o nome do ninja:");
                        String nomeNinja = entrada.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else {
                        System.out.println("Número máximo de ninjas cadastrados atingido.");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja cadastrado.");
                    }else {
                        System.out.println("Lista de Ninjas:");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case  3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
        entrada.close();

    }
}
