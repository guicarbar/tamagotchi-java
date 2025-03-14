package Tamagotchi.Modules;

public class Wallet extends Status {
    // add money
    public static void addCash(double cash) {
        wallet += cash;
    }

    // remove money
    public static void removeCash(double cash) {
        wallet -= cash;
        System.out.println("Foi retirado da sua carteira: RS" + cash);
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
