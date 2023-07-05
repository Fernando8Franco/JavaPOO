package javapooext06;

import javapooext06.Entity.Hangman;
import javapooext06.Service.HangmanService;

public class exercise6 {
    public static void main(String[] args) {
        Hangman hangman = HangmanService.createGame();
        HangmanService.playGame(hangman);
    }
}
