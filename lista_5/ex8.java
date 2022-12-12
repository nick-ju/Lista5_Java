//Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado
package lista_5;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        String numStr = String.valueOf(numero);
        System.out.println(digitos(numStr));
    }
    public static int digitos(String numero){
        return numero.length();

    }
}
