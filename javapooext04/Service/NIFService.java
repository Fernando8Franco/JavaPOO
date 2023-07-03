package javapooext04.Service;

import javapooext04.Entity.NIF;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class NIFService {
    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static final int[][] charTable= {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17},
                                                {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V'}};

    public static NIF createNIF() {
        String input;

        while (true) {
            System.out.println("Ingrese el numero de DNI: ");
            input = sc.next();

            if(input.length() != 8 || !input.matches("[0-9]*"))
                System.out.println("Solo se aceptan números de 8 de longitud.");
            else
                break;
        }
        long dni = Long.parseLong(input);

        return new NIF(dni, calculateCharacter(dni));
    }

    public static void showNIF(NIF nif) {
        System.out.printf("%08d - %c\n", nif.getDNI(), nif.getCharacter());
    }

    private static char calculateCharacter(long dni) {
        long numChar = dni % 23;

        Optional<Object> character = Arrays.stream(charTable[0])
                .boxed()
                .filter(i -> i == numChar)
                .findFirst()
                .map(i -> (char) charTable[1][i]);

        return (char)character.orElse('\0');
    }
}
