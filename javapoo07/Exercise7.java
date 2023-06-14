package javapoo07;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        short[] weights = new short[3];
        Arrays.fill(weights, (short) 0);
        short[] contAge = new short[2];
        Arrays.fill(contAge, (short) 0);

        Arrays.setAll(people, index -> PersonService.make_person());

        for (Person person : people) {
            if (PersonService.calculate_IMC(person) == -1)
                weights[0]++;
            else if (PersonService.calculate_IMC(person) == 0)
                weights[1]++;
            else
                weights[2]++;

            if (PersonService.is_adult(person))
                contAge[0]++;
            else
                contAge[1]++;
        }

        System.out.println(weights[0] + " " + weights[1] + " " + weights[2]);

        System.out.println(((weights[0] / (float)people.length) * 100) + "% de las personas están por debajo de su peso.");
        System.out.println(((weights[1] / (float)people.length) * 100) + "% de las personas están en su peso ideal.");
        System.out.println(((weights[2] / (float)people.length) * 100) + "% de las personas están por encima de su peso.");
        System.out.println();

        System.out.println(contAge[0] + " son mayores de edad");
        System.out.println(contAge[1] + " son menores de edad");
    }
}
