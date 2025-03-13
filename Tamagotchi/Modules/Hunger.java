package Tamagotchi.Modules;

// import resources
import Tamagotchi.Resorces.TextResources;
import Tamagotchi.Resorces.MetodsResources;

// import bibbliotecas
import java.sql.SQLOutput;
import java.util.Scanner;

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

    // seleciona a comida
    public static void menuSelect() {
        // start scanner
        Scanner sc = new Scanner(System.in);

        // start cardapio
        System.out.println(TextResources.quests[1]);
        String optionFood1 = sc.nextLine();

        if (MetodsResources.isConvertibleToInt(optionFood1) == 1) {
            System.out.println("É necessario escolher uma opção");
        } else if (MetodsResources.isConvertibleToInt(optionFood1) == 2) {
            //pega a escolha de comida
            int optionFood2 = Integer.parseInt(optionFood1);

        } else if (MetodsResources.isConvertibleToInt(optionFood1) == 3) {
            System.out.println("Digite apenas numeros");
        } else {
            System.out.println("Opção invalida!");
        }
    }
}
