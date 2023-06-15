package javapoo08;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Chain phrase = ChainService.make_phrase();

        System.out.println(ChainService.invert_phrase(phrase));

        System.out.println("Ingresa una letra: ");
        System.out.println("Veces repetida: " + ChainService.repeated_letter(phrase, sc.next().charAt(0)));

        System.out.println("Ingresa otra frase: ");
        if (ChainService.compare_lenght(phrase, sc.next()))
            System.out.println("Las frases tienen la misma longitud");
        else
            System.out.println("Las frases NO tienen la misma longitud");

        System.out.println("Ingresa otra frase: ");
        System.out.println("Frases unidas: " + ChainService.concat_phrases(phrase, sc.next()));

        System.out.println("Ingresa una letra: ");
        System.out.println("Frase cambiada: " + ChainService.change_letters(phrase, sc.next().charAt(0)));

        System.out.println("Ingresa una letra: ");
        if (ChainService.contains_letter(phrase, sc.next().charAt(0)))
            System.out.println("La frase contiene la letra");
        else
            System.out.println("La frase no contiene la letra");
    }
}
