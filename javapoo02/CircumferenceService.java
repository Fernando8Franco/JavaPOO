package javapoo02;

import java.util.Scanner;

public class CircumferenceService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Circumference make_circumference() {
        System.out.println("Ingrese el radio de la circunferencia: ");
        float r = sc.nextFloat();

        return new Circumference(r);
    }

    public float area(Circumference circumference) {
        return (float) (Math.PI * Math.pow(circumference.getRadius(), 2));
    }

    public float perimeter(Circumference circumference) {
        return (float) (2 * Math.PI * circumference.getRadius());
    }
}
