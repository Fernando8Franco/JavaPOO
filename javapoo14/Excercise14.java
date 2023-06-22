package javapoo14;

import javapoo14.Entity.Mobile;
import javapoo14.Service.MobileService;

public class Excercise14 {
    public static void main(String[] args) {
        Mobile mobile = MobileService.updateMobile();
        System.out.println(mobile);
    }
}
