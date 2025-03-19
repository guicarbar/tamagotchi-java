package Tamagotchi.Modules;

public class Wallet extends Status {
    // add money
    public static void addCash(double cash) {
        wallet += cash;
        System.out.println("\nFoi adcionado a sua carteira: RS" + cash + "\n");
    }

    // remove money
    public static void removeCash(double cash) {
        wallet -= cash;
        System.out.println("\nFoi retirado da sua carteira: RS" + cash + "\n");
    }

    // verifica wallet
    public static boolean haveMoney(double value) {
      if (getWallet() < value) {
          return false;
      } else {
          return true;
      }
    }
}
