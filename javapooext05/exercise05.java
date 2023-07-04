package javapooext05;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String[] months = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        final String SECRETMONTH = months[9];

        while (true) {
            System.out.println("Introduzca el nombre del mes: ");

            if (sc.next().equalsIgnoreCase(SECRETMONTH)) {
                System.out.println("¡¡Has acertado.!!");
                break;
            } else
                System.out.println("No ha acertado.");
        }
    }
}
