package javapoo04;

public class Exercise4 {
    public static void main(String[] args) {
        RectangleService rs = new RectangleService();
        Rectangle rec = rs.make_rectanble();

        System.out.println("El área del rectángulo es: " + rs.area(rec));
        System.out.println("El perimetro del rectángulo es: " + rs.perimeter(rec));

        rs.draw_rectangle(rec);
    }
}
