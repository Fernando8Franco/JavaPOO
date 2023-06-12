package javapoo03;

import java.util.Scanner;

public class OperationService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Operation make_operation() {
        System.out.println("Ingrese un número: ");
        float num1 = sc.nextFloat();

        System.out.println("Ingrese un número: ");
        float num2 = sc.nextFloat();

        return new Operation(num1, num2);
    }

    public float sum(Operation operation) {
        return (operation.getNum1() + operation.getNum2());
    }

    public float res(Operation operation) {
        return (operation.getNum1() - operation.getNum2());
    }

    public float mult(Operation operation) {
        if (operation.getNum1() != 0 && operation.getNum2() != 0)
            return (operation.getNum1() * operation.getNum2());
        else
            System.out.println("No se puede multiplicar ceros");
            return 0;
    }

    public float div(Operation operation) {
        if (operation.getNum2() != 0)
            return (operation.getNum1() / operation.getNum2());
        else
            System.out.println("No se puede dividir entre 0");
            return 0;
    }
}
