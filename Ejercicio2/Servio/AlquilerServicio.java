package Ejercicio2.Servio;

import Ejercicio2.Entidad.Alquiler;
import Ejercicio2.Entidad.Pelicula;
import java.time.Period;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class AlquilerServicio {

    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Alquiler crearAlquiler(Pelicula[] peliculas) {

        String input;

        while (true) {
            System.out.println("Ingrese el nombre de la pelicula: ");
            input = sc.next();

            if (PeliculaServicio.buscarPeliculaTitulo(input, peliculas).equals("Si existe"))
                break;
            else
                System.out.println("El titulo no existe");
        }

        String pelicula = input;
        int[] fecha;


        while (true) {
            System.out.println("Ingrese la fecha de inicio de la forma DD/MM/AAAA: ");
            input = sc.next();

            if (input.matches("\\d{2}/\\d{2}/\\d{4}"))
                break;
            else
                System.out.println("Formato no valido");
        }

        fecha = Arrays.stream(input.split("/"))
                .mapToInt(Integer::parseInt)
                .toArray();

        LocalDate fechaIncio = LocalDate.of(fecha[2], fecha[1], fecha[0]);

        while (true) {
            System.out.println("Ingrese la fecha de fin de la forma DD/MM/AAAA: ");
            input = sc.next();

            if (input.matches("\\d{2}/\\d{2}/\\d{4}"))
                break;
            else
                System.out.println("Formato no valido");
        }

        fecha = Arrays.stream(input.split("/"))
                .mapToInt(Integer::parseInt)
                .toArray();

        LocalDate fechaFin = LocalDate.of(fecha[2], fecha[1], fecha[0]);

        Period duracion = Period.between(fechaIncio, fechaFin);
        double precio = calcularIngreso(duracion.getDays());

        return new Alquiler(pelicula, fechaIncio, fechaFin, precio);
    }

    public static double calcularIngreso(int duracion) {
        return duracion <= 3 ? 10 : 10 + (duracion - 3) * 0.1;
    }

    public static void mostrarAlquiter(Alquiler[] alquiler) {
        for (Alquiler al:alquiler) {
            System.out.println(al);
        }
    }

    public static void buscarAlquiler(LocalDate fecha, Alquiler[] alquiler) {
        boolean flag = true;

        for (Alquiler al:alquiler) {
            if (fecha.equals(al.getFechaIncio())) {
                System.out.println("Si existe");
                System.out.println(al);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("No existe");
        }
    }
}
