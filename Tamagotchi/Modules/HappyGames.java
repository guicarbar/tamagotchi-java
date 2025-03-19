package Tamagotchi.Modules;

public class HappyGames{
    // console
    public static void console() {
        // redux status
        Status.modGameAllPoints(35,20,10);
    }

    // computador
    public static void computador() {
        // redux status
        Status.modGameAllPoints(25,15,20);
    }
}
