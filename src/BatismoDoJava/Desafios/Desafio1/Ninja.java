package BatismoDoJava.Desafios.Desafio1;

import java.util.Scanner;

public class Ninja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeNinja = scanner.nextLine();

        System.out.println("Digite a idade do ninja: ");
        Integer idadeNinja = scanner.nextInt();

        Missao missao1 = new Missao("Treinamento de clone", "facil",true);
        Missao missao2 = new Missao("Torneio na Aldeia", "medio",false);
        Missao missao3 = new Missao("Ataque ao hokage", "dificil",true);



        if(idadeNinja <15){
            System.out.println("Ninja "+nomeNinja+" pode participar da missão "+missao1.getNome()+" de nível "+missao1.getNivel()+" com o status de : "+missao1.isStatus()+" pois possui a idade de : "+idadeNinja);
        } else if (idadeNinja>=15 && idadeNinja<18) {
            System.out.println("Ninja "+nomeNinja+" pode participar da missão "+missao2.getNome()+" de nível "+missao2.getNivel()+" com o status de : "+missao2.isStatus()+" pois possui a idade de : "+idadeNinja);
        }else {
            System.out.println("Ninja "+nomeNinja+" pode participar da missão "+missao3.getNome()+" de nível "+missao3.getNivel()+" com o status de : "+missao3.isStatus()+" pois possui a idade de : "+idadeNinja);
        }


    }
}
