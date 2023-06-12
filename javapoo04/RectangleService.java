package javapoo04;

import java.util.Scanner;

public class RectangleService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Rectangle make_rectanble() {
        System.out.println("Ingresa la base del rectángulo: ");
        int base = sc.nextInt();

        System.out.println("Ingresa la altura del rectángulo: ");
        int height = sc.nextInt();

        return new Rectangle(base, height);
    }

    public float area(Rectangle rectangle) {
        return rectangle.getBase() * rectangle.getHeight();
    }

    public float perimeter(Rectangle rectangle) {
        return (2 * rectangle.getBase()) + (2 * rectangle.getHeight());
    }

    public void draw_rectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangle.getHeight(); i++) {
            for (int j = 0; j < rectangle.getBase(); j++) {
                if (i == 0 || i == rectangle.getHeight() - 1 || j == 0 || j == rectangle.getBase() - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
