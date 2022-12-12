//Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de
// caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou nega
package lista_5;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(pOuN(n));
    }
    public static String pOuN(int n){
        if(n>0){
            return "P";
        } else{
            return  "N";
        }
    }
}