//Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.
package lista_5;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        soma();
    }
    public static void soma(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(n + m + y);
    }

}
