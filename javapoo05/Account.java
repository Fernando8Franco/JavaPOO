package javapoo05;

public class Account {
    private int numAccount;
    private long dni;
    private int balance;
    private String interest;

    public Account() {
    }

    public Account(int numAccount, long dni, int balance, String interest) {
        this.numAccount = numAccount;
        this.dni = dni;
        this.balance = balance;
        this.interest = interest;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Cuenta" + "\n" +
                "Número de cuenta: " + numAccount + "\n" +
                "DNI: " + dni + "\n" +
                "Balance: " + balance + "\n" +
                "Interes: " + interest ;
    }
}
