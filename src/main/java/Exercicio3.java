/*
    Implemente um jogo de dados simples em que dois dados são lançados repetidamente até que a
    soma dos valores dos dados seja igual a 7. Use um loop do-while para executar o jogo.
*/

import org.apache.commons.lang3.tuple.Pair;

import java.util.Random;

public class Exercicio3 {
    public static Pair<Integer,Integer> throwDices(){
        return Pair.of(new Random().nextInt(6) + 1, new Random().nextInt(6) + 1);
    }

    public static void doGambling(){
        Pair<Integer,Integer> dices;
        System.out.println("Jogando os dados...");
        do{
            dices = throwDices();
            System.out.printf("%nDados jogados:%nDado 1: %d + Dado 2: %d => total: %d%n",dices.getLeft(),dices.getRight(),dices.getLeft() + dices.getRight());
        }while(!(dices.getLeft() + dices.getRight() == 7));
    }

    public static void main(String[]args){
        doGambling();
    }

}
