package Tamagotchi.Modules;

public class Humor extends Status {
    public static void addHumor(int humorPoints) {
        humor += humorPoints;
    }

    public static void removeSleep(int humorPoints) {
        humor -= humorPoints;
    }

    public static void analyserHumor() {
        if (humor > 100) {
            humor = 100;
            System.out.println("\n Náo tem mais como ...,ser mais feliz que isso!\n");
        } else if (humor <= 0) {
            System.out.println(".. morreu de tristeza!");
        }
    }
}
