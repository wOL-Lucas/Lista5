/*
Escreva um programa que solicite ao usuário que insira uma senha e use um loop do-while para
continuar pedindo a senha até que ela corresponda a uma senha predefinida. Em seguida, exiba uma
mensagem de boas-vindas.

*/

import java.util.Scanner;

public class Exercicio1 {

    public static void getLogin(Scanner scanner){
        String password = "Tiburcio";
        String input;
        do{
            System.out.println("Digite a senha:");
        }while(!password.equals(input = scanner.nextLine()));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getLogin(scanner);
        System.out.println("Bem vindo!");
    }

}
