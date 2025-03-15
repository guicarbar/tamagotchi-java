// packaged - modules
package Tamagotchi.Modules;

// import resources
import Tamagotchi.Resorces.CatchName;

public class Status {
    // declarando os niveis do tamagotchi
    protected static int humor;
    protected static int hunger;
    protected static int sleep;
    protected static double wallet;


    // setters
    public static void setHumor(int humor) {Status.humor = humor;}
    public static void setHunger(int hunger) {Status.hunger = hunger;}
    public static void setSleep(int sleep) {Status.sleep = sleep;}
    public static void setWallet(double wallet) {Status.wallet = wallet;}


    // getters
    public static int getHumor() {return humor;}
    public static int getHunger() {return hunger;}
    public static int getSleep() {return sleep;}
    public static double getWallet() {return wallet;}


    // functiosns of status
    // Conversor de humor
    public static String convertHumor(String name) {
        if (getHumor() > 80) {
            return "Humor: Muito feliz!";
        } else if (getHumor() > 50 && getHumor() <= 80) {
            return "Humor: Feliz";
        } else if (getHumor() > 20 && getHumor() <= 50) {
            return "Humor: Triste";
        } else if (getHumor() > 0 && getHumor() <= 20) {
            return "Humor: Muito triste!";
        } else if (getHumor() < 0) {
            return name + " morreu de tristeza!";
        } else {
            return "Tem algum erro no humor";
        }
    }


    // Conversor de fome
    public static String convertHunger(String name) {
        if (getHunger() > 80) {
            return "Fome: Muito satisfeito!";
        } else if (getHunger() > 50 && getHunger() <= 80) {
            return "Fome: Satisfeito";
        } else if (getHunger() > 20 && getHunger() <= 50) {
            return "Fome: Com fome";
        } else if (getHunger() > 0 && getHunger() <= 20) {
            return "Fome: Faminto!";
        } else if (getHunger() < 0) {
            return name + " morreu de fome!";
        } else {
            return "Tem algo de errado na fome";
        }
    }


    // Conversor de sono
    public static String convertSleep(String name) {
        if (getSleep() > 80) {
            return "Sono: Muito disposto!";
        } else if (getSleep() > 50 && getSleep() <= 80) {
            return "Sono: Disposto";
        } else if (getSleep() > 20 && getSleep() <= 50) {
            return "Sono: Com sono";
        } else if (getSleep() > 0 && getSleep() <= 20) {
            return "Sono: Exausto!";
        } else if (getSleep() <= 0) {
            return name + " morreu de sono!";
        } else {
            return "Tem algo de errado no sono";
        }
    }


    // show wallet
    public static String showCashWallet() {
        return "Carteira: R$" + getWallet();
    }

    // show status
    public static void showStatus(String name) {
        System.out.println(name +  " se encontra:\n\n" + convertHumor(name) + "\n" + convertHunger(name) + "\n" + convertSleep(name) + "\n" + showCashWallet() + "\n");
    }

    // redux points
    public static void modGameAllPoints(int incHumor, int redxHunger, int redxSleep) {
        humor += incHumor;
        hunger -= redxHunger;
        sleep -= redxSleep;

        // show status after redux by game
        showStatus(CatchName.getName());
    }
}
