//Faça um programa para imprimir. para um n informado pelo usuário. Use uma função que receba um valor n inteiro e
//imprima até a n-ésima linha
package lista_5;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
