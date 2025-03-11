package Tamagotchi.Modules;

public class Hunger extends Status {
    public static void addHunger(int hungerPoints) {
        hunger += hungerPoints;
    }

    public static void removeHunger(int hungerPoints) {
        hunger -= hungerPoints;
    }

    public static void analyserHunger() {
        if (hunger > 100) {
            hunger = 100;
            System.out.println("\n ... náo precisa mais comer!\n");
        } else if (hunger <= 0) {
            System.out.println(".. morreude fome!");
        }
    }
}
