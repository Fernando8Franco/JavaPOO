package javapooext02.Service;

import javapooext02.Entity.Points;
import java.util.Scanner;

public class PointService {
    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Points createPoints() {
        System.out.println("Ingrese el valor de x1: ");
        int x1 = sc.nextInt();

        System.out.println("Ingrese el valor de y1: ");
        int y1 = sc.nextInt();

        System.out.println("Ingrese el valor de x2: ");
        int x2 = sc.nextInt();

        System.out.println("Ingrese el valor de y2: ");
        int y2 = sc.nextInt();

        return new Points(x1, y1, x2, y2);
    }

    public static void distance(Points points) {
        double dist = Math.sqrt(Math.pow((points.getX2() - points.getX1()), 2) + Math.pow((points.getY2() - points.getY1()), 2));
        System.out.println("La distancia entre los dos puntos es: "  + dist);
    }
}
