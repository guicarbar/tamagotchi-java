package Tamagotchi.Modules;

// import resources
import Tamagotchi.Resorces.MetodsResources;

// import status
import Tamagotchi.Modules.Status;

public class HappyGames{
    // console
    public static void console() {
        // iniciando console
        MetodsResources.timer(5, 1);

        // redux status
        Status.modGameAllPoints(35,20,10);
    }

    // computador
    public static void computador() {
        // iniciando console
        MetodsResources.timer(5, 2);

        // redux status
        Status.modGameAllPoints(25,15,20);
    }
}
