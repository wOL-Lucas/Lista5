/*
Faça um programa que preencha por leitura um vetor de 5 posições, e conta quantos valores
diferentes existem no vetor.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[]args){
        System.out.printf("The count of different numbers in the vector is: %d%n",(int) Arrays.stream(Exercicio5.getNumberList(new Scanner(System.in))).distinct().count());
    }

}
