package javapoo14.Service;

import javapoo14.Entity.Mobile;
import java.util.Scanner;

public class MobileService {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

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
        int codeLength = Mobile.getCodeLenght();
        int[] code = new int[codeLength];
        int numCode;
        String numCodeString;

        while (true) {
            System.out.println("Ingrese el codigo del celuar (" + codeLength + " dígitos): ");
            numCode = sc.nextInt();
            numCodeString = String.valueOf(numCode);

            if (numCodeString.length() == codeLength)
                break;
            else
                System.out.println("El codigo que ingreso no tiene 7 dígitos.");
        }

        for (int i = 0; i < codeLength; i++) {
            code[i] = Character.getNumericValue(numCodeString.charAt(i));
        }

        return code;
    }

    private static void showMobile(Mobile mobile) {
        System.out.println(mobile);
    }
}
