package javapoo06;

import java.util.Scanner;

public class CoffeMakerService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public CoffeMaker make_coffe_maker() {
        System.out.println("Ingrese la cantidad maxima de la cafetera: ");
        int maxCapacity = sc.nextInt();

        System.out.println("Ingrese la cantidad actual de la cafetera: ");
        int currentQuantity = sc.nextInt();

        return new CoffeMaker(maxCapacity, currentQuantity);
    }

    public void fill_coffe_maker(CoffeMaker coffeMaker) {
        coffeMaker.setCurrentQuantity(coffeMaker.getMaxCapacity());
        System.out.println("Cafetera llenada");
    }

    public void serve_cup(CoffeMaker coffeMaker) {
        System.out.println("Tamaño de la taza en milililtros: ");
        int size = sc.nextInt();

        if (coffeMaker.getCurrentQuantity() >= size) {
            coffeMaker.setCurrentQuantity(coffeMaker.getCurrentQuantity() - size);
            System.out.println("La taza se lleno");
        } else if (coffeMaker.getCurrentQuantity() == 0) {
            System.out.println("La cafetera ya no tiene café");
        } else {
            System.out.println("La taza se quedo a: " + coffeMaker.getCurrentQuantity() + " ml");
            coffeMaker.setCurrentQuantity(0);
        }
    }

    public void empty_coffe_maker(CoffeMaker coffeMaker) {
        coffeMaker.setCurrentQuantity(0);
        System.out.println("Se vació la cafetera");
    }

    public void add_coffe(CoffeMaker coffeMaker) {
        System.out.println("Ingrese la cantidad de cafe a añadir: ");
        int quantity = sc.nextInt();
        int maxCapacity = coffeMaker.getMaxCapacity();

        if (coffeMaker.getCurrentQuantity() != maxCapacity) {
            int newQuantity = coffeMaker.getCurrentQuantity() + quantity;

            if (newQuantity <= maxCapacity)
                coffeMaker.setCurrentQuantity(newQuantity);
            else {
                coffeMaker.setCurrentQuantity(maxCapacity);
                newQuantity -= maxCapacity;
                newQuantity = Math.abs(newQuantity);
                System.out.println("Cafetera llena, sobro " + newQuantity + " gr. de café");
            }
        } else {
            System.out.println("La cafetera ya está llena");
        }
    }

    public void show(CoffeMaker coffeMaker) {
        System.out.println(coffeMaker.getCurrentQuantity());
        System.out.println(coffeMaker.getMaxCapacity());
    }
}