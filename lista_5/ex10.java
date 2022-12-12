/*Faça um programa de implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor
entre 2 e 12. Se, na primeira jogada, você tirar 7 ou 11, você é um "natural" e ganhou. Se você tirar 2, 3 ou 12
na primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez um 4, 5, 6, 8, 9
ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os dados até tirar este número novamente.
Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.*/
package lista_5;

import java.util.concurrent.ThreadLocalRandom;

public class ex10 {
    public static void main(String[] args) {
        int sumDiceValues = ThreadLocalRandom.current().nextInt(1, 7) + ThreadLocalRandom.current().nextInt(1, 7);
        if (sumDiceValues == 7 || sumDiceValues == 11) {
            System.out.println("You won");
        } else if (sumDiceValues == 2 || sumDiceValues == 3 || sumDiceValues == 12) {
            System.out.println("you lost");
        }
        int pontos = sumDiceValues;
        System.out.println("Seus pontos são " + pontos);
        while (true) {
            int newSum = ThreadLocalRandom.current().nextInt(1, 7) + ThreadLocalRandom.current().nextInt(1, 7);
            if (newSum == pontos) {
                System.out.println("Ganhou, tirou os seus pontos");
                break;
            } else if (newSum == 7) {
                System.out.println("Perdeu voce tirou 7");
                break;
            }
        }
    }
}
