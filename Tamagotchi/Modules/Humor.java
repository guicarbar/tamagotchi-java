package Tamagotchi.Modules;

public class Humor extends Status {
    public static void addHumor(int humorPoints) {
        humor += humorPoints;
    }

    public static void removeSleep(int humorPoints) {
        humor -= humorPoints;
    }

    public static void analyserHumor(String name) {
        if (humor > 100) {
            humor = 100;
            System.out.println("\n Náo tem mais como " + name + ", ser mais feliz que isso!\n");
        } else if (humor <= 0) {
            System.out.println(name + " morreu de tristeza!");
        }
    }
}
