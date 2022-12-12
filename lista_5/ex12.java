/*Construa uma função que receba uma string como parâmetro e devolva outra string com os carateres embaralhados.
Por exemplo: se função receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra combinação possível,
de forma aleatória. Padronize em sua função que todos os caracteres serão devolvidos em caixa alta ou caixa baixa,
independentemente de como foram digitados.*/
package lista_5;
import java.util.Arrays;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        System.out.println(embaralha(palavra));
    }
    public static String embaralha(String palavra){
        char[] arr = palavra.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
