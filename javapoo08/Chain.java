package javapoo08;

public class Chain {
    public String phrase;
    public int len;

    public Chain(String phrase) {
        this.phrase = phrase;
        this.len = phrase.length();
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getLen() {
        return len;
    }
}
