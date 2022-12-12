//Construa uma função que receba uma data no formato DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso
// de AAAA. Opcionalmente, valide a data e retorne NULL caso a data seja inválida
package lista_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma data (DD/MM/AAAA): ");
        String data = scanner.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        LocalDate abc = dataFormatada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(abc.getDayOfMonth() + " de " + abc.getMonth() + " de " + abc.getYear());

    }
}
