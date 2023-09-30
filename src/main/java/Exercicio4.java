/*
    Crie um programa de calculadora simples que ofereça opções para adição, subtração, multiplicação
    e divisão. Use um loop do-while para exibir um menu ao usuário e realizar cálculos com base na
    escolha do usuário.

*/


import java.util.*;
import java.util.function.BinaryOperator;

public class Exercicio4 {

    public static double getNumber(Scanner scanner){
        System.out.println("Insert a number");
        double number;
        try{
            number = scanner.nextDouble();
        }
        catch(Exception e){
            if(e instanceof InputMismatchException){
                System.out.println("The number must be A NUMBER!!!!!!!!");
                scanner.next();
                number = getNumber(scanner);
            }
            else{
                throw e;
            }
        }
        return number;
    }

    public static void doOperation(Scanner scanner,Map<String,BinaryOperator<Double>> operations, double number1, double number2){
        String operation = scanner.next();
        if(operations.containsKey(operation)){
            System.out.printf("Result: %.2f %s %.2f = %.2f%n",number1,operation,number2,operations.get(operation).apply(number1, number2));
        }
        else{
            if(!operation.equals("'")){
                System.out.println("Invalid operation, please enter a valid one");
                displayMenu();
                doOperation(scanner,operations,number1,number2);
            }
            else{
                System.out.println("Exiting...\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.exit(0);
            }

        }
    }

    public static void displayMenu(){
        System.out.println("""
                Type "+" for addiction;
                Type "-" for subtraction;
                Type "/" for division;
                Type "*" for multiplication;
                ------
                OR type ' for exit;
                """);
    }



    public static void basicCalculator(Map<String, BinaryOperator<Double>> operations){
        Scanner scanner = new Scanner(System.in);

        double number1 = getNumber(scanner);
        double number2 = getNumber(scanner);

        displayMenu();
        doOperation(scanner,operations,number1,number2);
    }

    public static void main(String [] args){
        Map<String, BinaryOperator<Double>> operations = new HashMap<>();
        operations.put("+", Double::sum);
        operations.put("-",(a,b) -> a - b);
        operations.put("*",(a,b) -> a * b);
        operations.put("/",(a,b) -> a / b);

        do{
            basicCalculator(operations);
        }while(true);
    }


}
