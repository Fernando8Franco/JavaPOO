package javapoo12;

import java.util.Scanner;

public class PersonService {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Person make_person() {
        System.out.println("Ingrese el nombre: ");
        String name = sc.next();

        String input;
        while (true) {
            System.out.println("Ingrese la fecha de nacimiento [DD/MM/AAAA] :");
            input = sc.next();

            if (input.matches("\\d{2}/\\d{2}/\\d{4}"))
                break;
            else
                System.out.println("Formato de fecha invalido");
        }


        String[] date = input.split("/");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        return new Person(name, year, month, day);
    }

    public static int calculate_age(Person person) {
        int age = Person.getActualYear() - person.getBirthYear();
        return age;
    }

    public static boolean underage (Person person) {
        if (calculate_age(person) < 18)
            return true;
        else
            return false;
    }

    public static void showPerson(Person person) {
        System.out.println("Nombre: " + person.getName() + "\n" + "Fecha nacimiento: " + person.getBirth_day());
    }
}
