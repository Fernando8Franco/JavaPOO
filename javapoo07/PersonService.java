package javapoo07;

import java.util.Scanner;

public class PersonService {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Person make_person() {
        System.out.printf("Ingrese el nombre de la persona no. %d: \n", Person.getNumPerson());
        String name = sc.next();

        System.out.println("Ingrese la edad: ");
        short age = sc.nextShort();

        char sex;
        while (true) {
            System.out.println("Selecciona el sexo: \n" +
                    "H - Hombre\n" +
                    "M - Mujer\n" +
                    "O - Otro");
            sex = sc.next().charAt(0);
            if (sex == 'H' || sex == 'M' || sex == 'O' || sex == 'h' || sex == 'm' || sex == 'o')
                break;
            else
                System.out.println("Opción no valida");
        }

        System.out.println("Ingrese el peso: ");
        float weight = sc.nextFloat();

        System.out.println("Ingrese la altura: ");
        float height = sc.nextFloat();

        return new Person(name, age, sex, weight, height);
    }

    public static short calculate_IMC(Person person) {
        double imc = person.getWeight() / Math.pow(person.getHeight(), 2);

        if (imc < 20)
            //Devuelve -1 cuando el peso de la persona está por debajo de su peso ideal
            return -1;
        else if (imc < 25)
            //Devuelve 0 cuando el peso de la persona está en su peso ideal
            return 0;
        else
            //Devuelve 1 cuando el peso de la persona está en sobrepeso
            return 1;
    }

    public static boolean is_adult(Person person) {
        if (person.getAge() >= 18)
            //Return true if a person is an adult
            return true;
        else
            //Return false if a person is not an adult
            return false;
    }
}
