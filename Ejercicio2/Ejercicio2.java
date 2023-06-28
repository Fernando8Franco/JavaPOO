package Ejercicio2;

import Ejercicio2.Entidad.Alquiler;
import Ejercicio2.Entidad.Pelicula;
import Ejercicio2.Servio.AlquilerServicio;
import Ejercicio2.Servio.PeliculaServicio;

public class Ejercicio2 {
    public static void main(String[] args) {
        Pelicula[] peliculas = new Pelicula[5];
        Alquiler[] alquilers = new Alquiler[3];

        /*for (int i = 0; i < peliculas.length; i++) {
            peliculas[i] = PeliculaServicio.crearPelicula();
        }*/

        peliculas[0] = PeliculaServicio.crearPelicula("Hola", "Accion", 2001, 103);
        peliculas[1] = PeliculaServicio.crearPelicula("Flash", "Ciencia ficcion", 2010, 99);
        peliculas[2] = PeliculaServicio.crearPelicula("Red film", "Animacion", 2011, 104);
        peliculas[3] = PeliculaServicio.crearPelicula("Juan", "Aventura", 2008, 109);
        peliculas[4] = PeliculaServicio.crearPelicula("Titanic", "Romance", 2005, 80);

        for (int i = 0; i < alquilers.length; i++) {
            PeliculaServicio.mostarPeliculas(peliculas);
            alquilers[i] = AlquilerServicio.crearAlquiler(peliculas);
        }

        PeliculaServicio.mostarPeliculas(peliculas);
        AlquilerServicio.mostrarAlquiter(alquilers);
    }
}
