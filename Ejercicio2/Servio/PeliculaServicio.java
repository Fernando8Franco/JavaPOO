package Ejercicio2.Servio;

import Ejercicio2.Entidad.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {
    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula no " + Pelicula.noPelicula + ": ");
        String titulo = sc.next();

        System.out.println("Ingrese el genero: ");
        String genero = sc.next();

        System.out.println("Ingrese el año: ");
        int anio = sc.nextInt();

        System.out.println("Ingrese la duración: ");
        int duracion = sc.nextInt();

        return new Pelicula(titulo, genero, anio, duracion);
    }

    public static Pelicula crearPelicula(String titulo, String genero, int anio, int duracion) {
        return new Pelicula(titulo, genero, anio, duracion);
    }


    public static void mostarPeliculas(Pelicula[] pelicula) {
        for (Pelicula pel:pelicula) {
            System.out.println(pel);
        }
    }

    public static String buscarPeliculaTitulo(String titulo, Pelicula[] pelicula) {
        for (Pelicula pel:pelicula) {
            if (pel.getTitulo().equalsIgnoreCase(titulo)) {
                return ("Si existe");
            }
        }
        return ("No existe");
    }

    public static String buscarPeliculaGenero(String genero, Pelicula[] pelicula) {
        for (Pelicula pel:pelicula) {
            if (pel.getGenero().equalsIgnoreCase(genero)) {
                return ("Si existe");
            }
        }
        return ("No existe");
    }
}
