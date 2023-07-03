package javapooext04.Entity;

public class NIF {
    private long dni;
    private char character;

    public NIF(long dni, char character) {
        this.dni = dni;
        this.character = character;
    }

    public long getDNI() {
        return dni;
    }

    public void setDNI(long dni) {
        this.dni = dni;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }
}
