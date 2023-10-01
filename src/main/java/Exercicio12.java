/*
Crie um programa que combine dois vetores de números inteiros em um terceiro vetor, alternando
os elementos dos vetores originais.
*/


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio12 {

    public static int[] getNumberList(Scanner scanner){
        System.out.println("Insert numbers separated by commas");
        String[] numbers = scanner.next().split(",");
        try{
            return Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
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
    public static int[] combineVectors(){
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = getNumberList(scanner);
        int[] secondArray = getNumberList(scanner);
        int[] vector = new int[firstArray.length + secondArray.length];
        int i = 0;

        do{
            if(i == firstArray.length){
                if(i < secondArray.length){
                    for(int x = i*2;i < secondArray.length;x++){
                        vector[x] = secondArray[i];
                        i++;
                    }
                }
                break;
            }
            else if(i == secondArray.length){
                for(int x = i*2;i < firstArray.length;x++){
                    vector[x] = firstArray[i];
                    i++;
                }
                break;
            }
            else if(i == 0){
                vector[i] = firstArray[i];
                vector[i + 1] = secondArray[i];

            }
            else{
                vector[i + i] = firstArray[i];
                vector[i * 2 + 1] = secondArray[i];

            }

            i++;

        }while(true);

        return vector;
    }

    public static void main(String[]args){

        int[] array = combineVectors();
        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }

    }

}
