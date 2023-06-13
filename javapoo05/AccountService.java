package javapoo05;

import java.util.Scanner;

public class AccountService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Account make_account() {
        System.out.println("Ingrese el número de cuenta: ");
        int numAccout = sc.nextInt();

        System.out.println("Ingrese el DNI del cliente: ");
        long dni = sc.nextLong();

        System.out.println("Ingrese el saldo: ");
        int balance = sc.nextInt();

        System.out.println("Ingrese el interes: ");
        String interest = sc.next();

        return new Account(numAccout, dni, balance, interest);
    }

    public void add_balance(Account account) {
        System.out.println("Saldo a ingresar: ");
        double income = sc.nextDouble();

        account.setBalance((int)(account.getBalance() + income));
    }

    public void draw_balance(Account account) {
        System.out.println("Saldo a retirar: ");
        double withdrawal = sc.nextDouble();

        if (withdrawal <= account.getBalance())
            account.setBalance((int)(account.getBalance() - withdrawal));
        else
            System.out.println("No tiene los fondos suficientes");
    }

    public void fast_draw_balance(Account account) {
        System.out.println("Saldo a retirar: ");
        double withdrawal = sc.nextDouble();

        if (withdrawal <= (account.getBalance() * .2))
            account.setBalance((int)(account.getBalance() - withdrawal));
        else
            System.out.println("El saldo a retirar es mayor al 20% de su balance");
    }

    public void show_balance (Account account) {
        System.out.println("Su saldo es: " + account.getBalance());
    }

    public void show_data (Account account) {
        System.out.println(account);
    }
}
