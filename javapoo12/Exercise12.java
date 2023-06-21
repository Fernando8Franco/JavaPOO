package javapoo12;

public class Exercise12 {
    public static void main(String[] args) {
        Person person1 = PersonService.make_person();

        System.out.println("La persona tiene: " + PersonService.calculate_age(person1) + " años");

        if (PersonService.underage(person1))
            System.out.println("La persona es menor de edad");
        else
            System.out.println("La persona es mayor de edad");

        PersonService.showPerson(person1);
    }
}
