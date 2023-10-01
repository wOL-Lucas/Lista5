/*
Um dado é lançado 50 vezes, e o valor correspondente é armazenado em um vetor. Faça um
programa que determine o percentual de ocorrências de face 6 do dado dentre esses 50
lançamentos.
*/

import java.util.Random;
import java.util.stream.IntStream;

public class Exercicio9 {

    public static int[] throwDiceFiftyTimes(){
        Random random = new Random();
        int[] gottenSides = new int[50];

        for(int i = 0;i < 50; i++){
            System.out.println("Throwin' the dice...");
            gottenSides[i] = random.nextInt(6) + 1;
        }

        return gottenSides;
    }

    public static double getPercentage(int[] gottenSides){
        return ((double) gottenSides.length / 100) * (int) IntStream.range(0,gottenSides.length).filter(i -> gottenSides[i] == 6).count();
    }

    public static void main(String [] args){
        System.out.printf("The percentage of times we got a 6 value face of the fifty times we have thrown the dice is: %.10f %n",getPercentage(throwDiceFiftyTimes()));
    }

}
