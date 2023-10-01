/*

Desenvolva um programa que conte quantas vezes um elemento específico aparece em um vetor de
números inteiros.

*/

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] vector = Exercicio12.getNumberList(scanner);
        int number = Exercicio2.getNumber(scanner);

        System.out.printf("The number: %d appears %d time(s) in the array.%n",number,(int) IntStream.range(0,vector.length).filter(i -> vector[i] == number).count());
    }
}
