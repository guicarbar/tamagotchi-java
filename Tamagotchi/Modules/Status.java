// packaged - modules
package Tamagotchi.Modules;

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
    // apresentando o statuis ao usuario
    public String[] convertStatus() {
        if (getHumor())
    }
}
