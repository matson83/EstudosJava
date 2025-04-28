package Sintaxe_Basica;

public class ExemploControle {
    public static void main(String [] args){

        // Operadores Condicionais
        int idade = 18;

        if(idade >= 18){
            System.out.println("Permitido maior de idade ");
        }else {
            System.out.println("Não permitido , menor de idade ");
        }

        double nota = 6.3;

        if (nota >= 7.0) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        int hora = 14;

        if (hora < 12 ){
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        int x = 10;
        int y = 20;

        System.out.println("X == Y : " + (x==y));
        System.out.println("X == Y : " + (x!=y));
        System.out.println("X == Y : " + (x>y));
        System.out.println("X == Y : " + (x<y));
        System.out.println("X == Y : " + (x>=y));
        System.out.println("X == Y : " + (x<=y));

        // Operadores Lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 == true && condicao2 == true){
            System.out.println("As duas condições são verdadeiras");
        }else if(condicao1 == true || condicao2 == true){
            System.out.println("Uma das condições é verdadeira");

        }else {
            System.out.println("Nenhuma condição é verdadeira");
        }

        // Loop

        int contador = 1;

        while(contador <= 5){
            System.out.println(contador);
            contador++;
        }
/*
        for(int contador = 0 ; contador <= 5 ; contador++){
            System.out.println("valor de i é : " + contador);

        }*/

        int [] numeros = {1,2,3,4,5,6,7,8,9};

        int somapar = 0;
        int somaimpar = 0;

        for (int num : numeros){
            if (num%2 == 0){
                somapar += num;

            }else {
                somaimpar += num;
            }

            System.out.println("Par: "+somapar);
            System.out.println("Impar; "+somaimpar);
        }



    }
}
