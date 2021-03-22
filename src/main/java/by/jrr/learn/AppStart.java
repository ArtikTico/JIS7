package by.jrr.learn;


import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class AppStart {
    Integer count = 10;
    long n1 = 200L;
    public static void throwCoin(){
        int x = 2;
        var y = new Random().nextInt(x);
        if (y == 1) {
            System.out.println("ОРЕЛ!");
        }
        else {
            System.out.println("РЕШКА!");
        }
    }
    public static String throwCoins(){
        int x = 2;
        String orel = "ОРЕЛ!";
        String reshka = "РЕШКА!";

        var y = new Random().nextInt(x);
        return y == 1 ? orel: reshka;
    }

    private AppStart getThis() {
        if (this.count.equals(10)) {
            System.out.println("YES");
        }
        return this;
    }
    public static void main(String[] args) {
        AppStart.throwCoin();
        System.out.println(AppStart.throwCoins());
        AppStart appStart = new AppStart();
        appStart.getThis().getThis().getThis().getThis();
    }
}
