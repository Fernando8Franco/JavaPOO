package javapoo09;

import java.util.Scanner;

public class MathService {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Mathematics make_maths() {
        System.out.println("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        return new Mathematics(num1, num2);
    }

    public static double return_bigger(Mathematics numbers) {
        if (numbers.getNum1() > numbers.getNum2())
            return numbers.getNum1();
        else
            return numbers.getNum2();
    }

    public static double cal_power(Mathematics numbers) {
        double num1 = numbers.getNum1();
        double num2 = numbers.getNum2();
        if (num1 == return_bigger(numbers))
            return Math.pow(Math.round(num1), Math.round(num2));
        else
            return Math.pow(Math.round(num2), Math.round(num1));
    }

    public static double cal_sqrt(Mathematics numbers) {
        double num1 = numbers.getNum1();
        double num2 = numbers.getNum2();
        if (num1 == return_bigger(numbers))
            return Math.sqrt(Math.abs(num2));
        else
            return Math.sqrt(Math.abs(num1));
    }
}
