/* Construa uma função que desenhe um retângulo usando os caracteres ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois
parâmetros, linhas e colunas, sendo que o valor por omissão é o valor mínimo igual a 1 e o valor máximo é 20. Se
valores fora da faixa forem informados, eles devem ser modificados para valores dentro da faixa de forma elegante.*/
package lista_5;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de linhas entre 1 e 20: ");
        int linhas = scanner.nextInt();
        System.out.println("Numero de colunas entre 1 e 20: ");
        int colunas = scanner.nextInt();

        moldura(valorPorOmissao(linhas), valorPorOmissao(colunas));
    }

    public static int valorPorOmissao(int valor) {
        if (valor < 1) {
            return 1;
        } else if (valor > 20) {
            return 20;
        } else {
            return valor;
        }
    }
    public static void criaLinha(int linha){
        StringBuilder l = new StringBuilder("+");
        for (int i = 0; i<linha; i++) {
            l.append("-");
        }
        l.append("+");
        System.out.println(l);
    }

    public static void criaColuna(int linha, int coluna) {
        StringBuilder c = null;
        for (int i = 0; i < coluna; i++) {
            c = new StringBuilder("|");
            for (int j = 0; j < linha; j++) {
                c.append(" ");
            }
            c.append("|");
        }
        System.out.println(c);
    }

    public static void moldura(int linha, int coluna) {
        criaLinha(linha);
        criaColuna(linha, coluna);
        criaLinha(linha);
    }
}
