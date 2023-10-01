/*
    Faça um programa que preencha por leitura um vetor de 5 posições, e informe a posição em que um
    valor x (lido do teclado) está no vetor. Caso o valor x não seja encontrado, o programa deve imprimir
    o valor -1.
*/

import java.util.Scanner;
import java.util.function.Supplier;

public class Exercicio11 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Supplier<Integer> lambda;

        lambda = ()->{
            int[] numbers = Exercicio5.getNumberList(scanner);
            System.out.println("Enter a number and I will try to find it in our array :D");
            int number = Exercicio2.getNumber(scanner);
            for(int position = 0; position < numbers.length;position ++){
                if(numbers[position] == number){
                    return position;
                }
            }
            return -1;
        };

        System.out.printf("Your number is at the position: %d",lambda.get());
    }

}
