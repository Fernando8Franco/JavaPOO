package javapoo09;

public class Exercise9 {
    public static void main(String[] args) {
        Mathematics math = MathService.make_maths();

        System.out.println("El número mayor es: " + MathService.return_bigger(math));
        System.out.println("La potencia es: " + MathService.cal_power(math));
        System.out.println("La raíz cuadrada es: " + MathService.cal_sqrt(math));
    }
}
