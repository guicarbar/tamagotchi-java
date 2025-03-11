package Tamagotchi.Modules;

public class Sleep extends Status {
    public static void addSleep(int sleepPoints) {
        sleep += sleepPoints;
    }

    public static void removeSleep(int sleepPoints) {
        sleep -= sleepPoints;
    }
    
    public static void analyserSleep() {
        if (sleep > 100) {
            sleep = 100;
            System.out.println("\n ... náo precisa mais dormir!\n");
        } else if (sleep <= 0) {
            System.out.println(".. morreude sono!");
        }
    }
}
