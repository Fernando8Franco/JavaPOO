package javapooext04;

import javapooext04.Entity.NIF;
import javapooext04.Service.NIFService;

public class exercise04 {
    public static void main(String[] args) {
        NIF nif = NIFService.createNIF();
        NIFService.showNIF(nif);
    }
}
