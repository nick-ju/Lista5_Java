/*Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma
prestação de uma conta. O programa deverá solicitar ao usuário o valor da prestação e o número de dias
em atraso e passar estes valores para a função valorPagamento, que calculará o valor a ser pago e devolverá
este valor ao programa que a chamou. O programa deverá então exibir o valor a ser pago na tela. Após a execução
o programa deverá voltar a pedir outro valor de prestação e assim continuar até que seja informado um valor igual
a zero para a prestação. Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá
a quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito da seguinte
forma. Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver atraso, cobrar 3% de multa,
mais 0,1% de juros por dia de atraso.*/
package lista_5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int quantidade = 0;
        double valorTotal = 0.0;
        Scanner scanner = new Scanner(System.in);
        double valorPrestacao = scanner.nextDouble();
        while (valorPrestacao != 0) {
            int diasAtraso = scanner.nextInt();
            double somaPagtos = valorPagamento(valorPrestacao, diasAtraso);
            valorTotal += somaPagtos;
            System.out.println(somaPagtos);
            quantidade++;
            valorPrestacao = scanner.nextDouble();
        }
        System.out.println("Valor total prestações: " + valorTotal);
        System.out.println("Quantidade de prestações: " + quantidade);

    }
    public static double valorPagamento(double valorPrestacao, int diasAtraso){
       if(diasAtraso == 0){
           return valorPrestacao;
       }else{
           return (valorPrestacao*0.03)+valorPrestacao+(diasAtraso*0.001);
        }
    }
}
