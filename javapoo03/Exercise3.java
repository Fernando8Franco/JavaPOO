package javapoo03;

public class Exercise3 {
    public static void main(String[] args) {
        OperationService os = new OperationService();
        Operation op = os.make_operation();

        System.out.println("La suma es: " + os.sum(op));
        System.out.println("La resta es: " + os.res(op));
        System.out.println("La multiplicación es: " + os.mult(op));
        System.out.println("La división es: " + os.div(op));

    }
}
