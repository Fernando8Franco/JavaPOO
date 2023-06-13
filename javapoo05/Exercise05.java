package javapoo05;

import javapoo03.OperationService;

public class Exercise05 {
    public static void main(String[] args) {
        AccountService as = new AccountService();
        Account acc = as.make_account();

        as.show_data(acc);
        as.add_balance(acc);
        as.draw_balance(acc);
        as.fast_draw_balance(acc);
        as.show_balance(acc);
        as.show_data(acc);
    }
}
