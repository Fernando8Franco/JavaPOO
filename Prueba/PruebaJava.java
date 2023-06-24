package Prueba;

import java.util.Scanner;

public class PruebaJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Edad: ");
        int edad = sc.nextInt();

        System.out.println("Nombre: ");
        String nombre = sc.next();

        System.out.println(nombre + " " + edad);
    }
}
