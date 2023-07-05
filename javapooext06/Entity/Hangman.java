package javapooext06.Entity;

import java.util.Arrays;

public class Hangman {
    private char[] searchWord;
    private int wordLength;
    private int attempts;

    public Hangman(char[] searchWord, int wordLength, int attempts) {
        this.searchWord = Arrays.copyOf(searchWord, searchWord.length);
        this.wordLength = wordLength;
        this.attempts = attempts;
    }

    public char[] getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(char[] searchWord) {
        this.searchWord = searchWord;
    }

    public int getWordLength() {
        return wordLength;
    }

    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
}
