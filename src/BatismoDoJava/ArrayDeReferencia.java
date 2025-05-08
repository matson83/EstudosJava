package BatismoDoJava;

public class ArrayDeReferencia {
    public static void main(String[] args) {
        String [][] ninjaseAldeias = new String[3][3];
        ninjaseAldeias [0][0] = "Naruto";
        ninjaseAldeias [0][1] = "Sakura";
        ninjaseAldeias [0][2] = "Sasuke";

        ninjaseAldeias [1][0] = "Konoha";
        ninjaseAldeias [1][1] = "Suna";
        ninjaseAldeias [1][2] = "Kiri";

        ninjaseAldeias [2][0] = "Naruto";
        ninjaseAldeias [2][1] = "Sakura";
        ninjaseAldeias [2][2] = "Sasuke";

        System.out.println(ninjaseAldeias[0][0] + "," + ninjaseAldeias[0][1] + "," + ninjaseAldeias[0][2]);
        System.out.println(ninjaseAldeias[1][0] + "," + ninjaseAldeias[1][1] + "," + ninjaseAldeias[1][2]);
        System.out.println(ninjaseAldeias[2][0] + "," + ninjaseAldeias[2][1] + "," + ninjaseAldeias[2][2]);
    }

}
