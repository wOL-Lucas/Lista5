import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
    Leia uma vetor de 5 posições. Contar e escrever quantos valores pares ele possui.
*/
public class Exercicio5 {

    public static int getPairCount(int[]numbersList){
       return (int) IntStream.range(0, numbersList.length).filter(i -> numbersList[i] % 2 == 0).count();
    }

    public static int[] getNumberList(Scanner scanner){
        System.out.println("Insert five numbers separated by comma");
        String[] numbers = scanner.next().split(",");
        try{
            if(numbers.length != 5){
                throw new InputMismatchException();
            }
            else{
                return Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
            }
        }
        catch(Exception e){
            if(e instanceof NumberFormatException || e instanceof InputMismatchException){
                System.out.println("Please, enter a list with 5 integer numbers separated by commas");
                return getNumberList(scanner);
            }
            else{
                throw e;
            }
        }
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Your list has %d pair numbers",getPairCount(getNumberList(scanner)));

    }



}
