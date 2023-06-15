package javapoo10;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el año: ");
        int year = sc.nextInt();

        System.out.println("Ingrese el mes: ");
        int month = sc.nextInt();

        System.out.println("Ingrese el día: ");
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate actual_day = LocalDate.now();

        System.out.println(date);
        System.out.println(actual_day);
        System.out.println("La cantidad de años de diferencia son: " + (actual_day.getYear() - date.getYear()));
    }
}
