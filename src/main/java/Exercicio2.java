/*
Crie um programa que solicite ao usuário que insira um número inteiro positivo e, em seguida, use
um loop do-while para fazer uma contagem regressiva a partir desse número até 1. Exiba cada
número no processo.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

    public static int getNumber(Scanner scanner){
        int number;
        System.out.println("Insira um número inteiro positivo:");
        try{
            number = scanner.nextInt();
            if(number < 0) {
                System.out.println("Número inválido.");
                throw new InputMismatchException();
            }
        }
        catch(Exception e){
            if(e instanceof InputMismatchException){
                scanner.nextLine();
                number = getNumber(scanner);
            }
            else {
                throw e;
            }
        }
        return number;
    }

    public static void decreaseNumber(int number){
        do{
            System.out.println(number);
            number--;
        }while(number > 0);
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        decreaseNumber(getNumber(scanner));

    }

}
