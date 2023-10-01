/*
    Faça um programa que receba do usuário um vetor com 5 posições. Em seguida deverá ser impresso
a soma do maior com o menor elemento do vetor.
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio6 {

    public static int sumMinMax(int[] numbersList){
        return Arrays.stream(numbersList).min().getAsInt() + Arrays.stream(numbersList).max().getAsInt();
    }
    public static void main(String[]args){
        System.out.printf("The sum of the Min and Max numbers of your list is: %d",sumMinMax(Exercicio5.getNumberList(new Scanner(System.in))));
    }

}
