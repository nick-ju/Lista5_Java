//Faça uma função que retorne o reverso de um número inteiro informado. Por exemplo: 127 -> 721
package lista_5;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();
        String c = "";
        System.out.println(inverte(numStr,c));
    }

    public static String inverte(String numStr, String c) {
        for (int i = numStr.length(); i > 0; i--) {
            c += numStr.substring(i - 1, i);
        }
        return c;
    }
}
