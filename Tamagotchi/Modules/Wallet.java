package Tamagotchi.Modules;

public class Wallet extends Status {
    // add money
    public static void addCash(int cash) {
        wallet += cash;
    }

    // remove money
    public static void removeCash(int cash) {
        wallet -= cash;
    }

    // verifica wallet
    public static boolean haveMoney(double value) {
      if (getWallet() < value) {
          return false;
      } else {
          return true;
      }
    };
}
