//Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais:
// taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo
// de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas.
package lista_5;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxaImposto = scanner.nextDouble();
        double custo = scanner.nextDouble();
        System.out.println(somaImposto(taxaImposto, custo));
    }
    public static double somaImposto(double taxaImposto, double custo){
        return (custo * (taxaImposto/100)) + custo;
    }
}

