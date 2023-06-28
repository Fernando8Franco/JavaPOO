package Ejercicio2.Entidad;

import java.time.LocalDate;

public class Alquiler {
    private String pelicula;
    private LocalDate fechaIncio;
    private LocalDate fechaFin;
    private double precio;

    public Alquiler(String pelicula, LocalDate fechaIncio, LocalDate fechaFin, double precio) {
        this.pelicula = pelicula;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(LocalDate fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "pelicula='" + pelicula + '\'' +
                ", fechaIncio=" + fechaIncio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                '}';
    }
}
