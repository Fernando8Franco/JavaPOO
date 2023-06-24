package javapoo14.Service;

import javapoo14.Entity.Mobile;

import java.util.Scanner;
import java.util.stream.Stream;

public class MobileService {
    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Mobile updateMobile() {

        System.out.println("Ingrese la marca del celular: ");
        String brand = sc.next();

        System.out.println("Ingrese el precio del celular: ");
        double price = sc.nextDouble();

        System.out.println("Ingrese el modelo del celular: ");
        String model = sc.next();

        System.out.println("Ingrese el tamaño de memoria ram (GB): ");
        short memRam = sc.nextShort();

        System.out.println("Ingrese el tamaño de almacenamiento (GB): ");
        short storage = sc.nextShort();

        return new Mobile(brand, price, model, memRam, storage, enterCode());
    }

    private static int[] enterCode() {
        String numCode;

        while (true) {
            System.out.println("Ingrese el codigo del celuar (" + Mobile.MAX_NUMBER_SIZE + " dígitos): ");
            numCode = sc.next();

            if (numCode.length() == Mobile.MAX_NUMBER_SIZE)
                break;
            else
                System.out.println("El codigo que ingreso no tiene 7 dígitos.");
        }

        return Stream.of(numCode.split("")).mapToInt(Integer::parseInt).toArray();
    }
}
