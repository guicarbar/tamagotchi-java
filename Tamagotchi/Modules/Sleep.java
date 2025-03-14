package Tamagotchi.Modules;

public class Sleep extends Status {
    // add poins of sleep
    public static void addSleep(int sleepPoints) {
        sleep += sleepPoints;
    }

    // remove poins sleep
    public static void removeSleep(int sleepPoints) {
        sleep -= sleepPoints;
    }

    // analyser sleep points
    public static void analyserSleep(String name) {
        if (sleep > 100) {
            sleep = 100;
            System.out.println("\n " + name + " náo precisa mais dormir!\n");
        } else if (sleep <= 0) {
            System.out.println(name + " morreude sono!");
        }
    }
}
