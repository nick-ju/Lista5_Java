/*Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o
programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. Deve haver pelo menos duas
funções: uma para fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’
para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal para registrar
se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada
todas as vezes que desejar.*/
package lista_5;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            int hora = scanner.nextInt();
            String minuto = scanner.next();
            System.out.println(saida(hora, minuto));
        } while (true);

    }
    public static String converte(int hora) {
        if(hora>=12){
            return "P";
        }else{
            return "A";
        }
    }
    public static String saida(int hora, String minuto) {
        if (hora > 12) {
            return (hora - 12) + ":" + minuto + " P.M.";
        } else if (hora == 12) {
            return hora + ":" + minuto + " P.M.";
        }else {
            return hora + ":" + minuto + " A.M.";
        }
    }

}
