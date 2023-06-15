package javapoo08;

import java.util.Scanner;

public class ChainService {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static Chain make_phrase() {
        System.out.println("Ingresa una frase: ");
        return new Chain(sc.next());
    }

    public static String invert_phrase(Chain phrase) {
        StringBuilder sb = new StringBuilder(phrase.getPhrase());
        return sb.reverse().toString();
    }

    public static int repeated_letter(Chain phrase, char letter) {
        return (int) phrase.getPhrase().toLowerCase().chars()
                .filter(ch -> ch == letter)
                .count();
    }

    public static boolean compare_lenght(Chain phrase, String phraseComp) {
        if (phrase.getLen() == phraseComp.length())
            return true;
        else
            return false;
    }

    public static String concat_phrases(Chain phrase, String phraseConc) {
        return phrase.getPhrase().concat(phraseConc);
    }

    public static String change_letters(Chain phrase, char letter) {
        return phrase.getPhrase().replace('a', letter);
    }

    public static boolean contains_letter(Chain phrase, char letter) {
        if (phrase.getPhrase().contains(String.valueOf(letter)))
            return true;
        else
            return false;
    }
}
