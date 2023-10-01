/*
Fazer um programa para ler 5 valores(vetor) e, em seguida, mostrar a posição onde se encontram o
maior e o menor valor.
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio8 {

    public static void getPositions(int[]numberList){
        boolean lowest = false;
        boolean biggest = false;
        
        int min = Arrays.stream(numberList).min().getAsInt();
        int max = Arrays.stream(numberList).max().getAsInt();

        for(int i = 0;i < numberList.length; i++){
            if(numberList[i] == min && !lowest){
                System.out.printf("The lowest value at the vector is at the position %d and it is the number %d%n",i,numberList[i]);
                lowest = true;
            }
            else if(numberList[i] == max && !biggest){
                System.out.printf("The biggest value at the vector is at the position %d and it is the number %d%n",i,numberList[i]);
                biggest = true;
            }

        }

    }

    public static void main(String[]args){
        getPositions(Exercicio5.getNumberList(new Scanner(System.in)));

    }


}
