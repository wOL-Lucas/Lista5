/*
Faça um programa para ler a nota da prova de 4 alunos e armazene em um vetor, calcule e imprima
a média geral.
*/

import java.util.*;

public class Exercicio7 {

    public static double getNote(Scanner scanner, int studentIndex){
        double note;
        System.out.printf("Insert the note for student number %d %n",studentIndex);
        try{
            note = scanner.nextDouble();
            if(note < 0){
                throw new InputMismatchException();
            }
        }
        catch(Exception e){
            if(e instanceof InputMismatchException){
                System.out.println("The grade must be a double number. Try again!");
                scanner.next();
                note = getNote(scanner,studentIndex);
            }
            else{
                throw e;
            }
        }
        return note;
    }

    public static double[] getAllGrades(){
        Scanner scanner = new Scanner(System.in);
        List<Double> grades = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            grades.add(getNote(scanner,i + 1));
        }

        return grades.stream().mapToDouble(Double::doubleValue).toArray();

    }

    public static double getAverage(double[] grades){
        return Arrays.stream(grades).sum() / grades.length;

    }

    public static void main(String[]args){
        System.out.printf("The average of the grades of your students is %.2f",getAverage(getAllGrades()));
    }


}
