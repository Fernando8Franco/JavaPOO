package javapoo02;

public class Excercise2 {
    public static void main(String[] args) {
        CircumferenceService cs = new CircumferenceService();
        Circumference cir = cs.make_circumference();

        System.out.println("El área de la circunferencia es: " + cs.area(cir));
        System.out.println("El perimetro de la circunferencia es: " + cs.perimeter(cir));
    }
}
