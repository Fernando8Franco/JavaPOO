package javapooext06.Service;

import javapooext06.Entity.Hangman;
import java.util.Scanner;

public class HangmanService {
    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static String charsEntered;
    private static int cont;


    public static Hangman createGame() {
        charsEntered = "";
        cont = 0;

        System.out.println("Ingrese una palabra: ");
        String word = sc.next();

        System.out.println("Ingrese los intentos: ");
        int attemps = sc.nextInt();

        char[] searchWord = word.toLowerCase().toCharArray();

        return new Hangman(searchWord, word.length(), attemps);
    }

    public static void wordLenght(Hangman hm) {
        System.out.println("Longitud de la palabra: " + hm.getWordLength());
    }

    public static void belongsWord(Hangman hm, char character) {
        boolean flag = true;
        for (char ch:hm.getSearchWord()) {
            if (ch == character) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Mensaje: La letra no pertenece a la palabra");
    }

    public static void charactersFound(Hangman hm, char character) {
        boolean flag = true;

        for (int j = 0; j < charsEntered.length(); j++) {
            if (character == charsEntered.charAt(j)) {
                flag = false;
                System.out.println("Mensaje: La letra ya se ingreso.");
                break;
            }
        }

        if (flag) {
            for (int i = 0; i < hm.getSearchWord().length; i++) {
                if (hm.getSearchWord()[i] == character) {
                    charsEntered = charsEntered.concat(Character.toString(character));
                    cont++;
                }
            }
        }


        System.out.println("El número de letras (encontradas, faltantes): (" + cont + "," + (hm.getSearchWord().length - cont ) + ")");
    }

    public static void showAttempts(Hangman hm) {
        hm.setAttempts(hm.getAttempts() - 1);
        if(hm.getAttempts() != 0)
            System.out.println("Número de oportunidades restantes: " + hm.getAttempts());
        else
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
    }

    public static void playGame(Hangman hangman) {
        while (hangman.getAttempts() != 0) {
            System.out.println("Ingrese una letra: ");
            char character = sc.next().charAt(0);
            wordLenght(hangman);
            belongsWord(hangman, character);
            charactersFound(hangman, character);
            showAttempts(hangman);
        }
    }
}
