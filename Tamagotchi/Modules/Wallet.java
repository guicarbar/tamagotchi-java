package Tamagotchi.Modules;

public class Wallet extends Status {
    public static void addCash(int cash) {
        wallet += cash;
    }

    public static void removeCash(int cash) {
        wallet -= cash;
    }
}
