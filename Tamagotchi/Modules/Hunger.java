package Tamagotchi.Modules;

// import resources
import Tamagotchi.Resorces.TextResources;
import Tamagotchi.Resorces.MetodsResources;
import Tamagotchi.Modules.Wallet;

// import bibbliotecas
import java.util.Scanner;

public class Hunger extends Status {
    public static void addHunger(int hungerPoints) {
        hunger += hungerPoints;
    }

    public static void removeHunger(int hungerPoints) {
        hunger -= hungerPoints;
    }

    public static void analyserHunger(String name) {
        if (hunger > 100) {
            hunger = 100;
            System.out.println("\n " + name + " náo precisa mais comer!\n");
        } else if (hunger <= 0) {
            System.out.println(name + " morreude fome!");
        }
    }

    // switch da comida
    public static void switchFood(int optionSelected) {
        // string do pobre
        String poorGuy = "Vocé não tem dinheiro o suficiete! vá trabalhar!";

        // set value
        double price = 0.0;

        // switch da escolha
        switch (optionSelected) {
            case 1:
                price = 12.00;
                break;
            case 2:
                price = 8.00;
                break;
            case 3:
                price = 15.00;
                break;
            case 4:
                price = 25.00;
                break;
            case 5:
                price = 5.00;
                break;
            case 6:
                price = 7.00;
                break;
            default:
                System.out.println("Digite apenas uma das opções disponiveis!");
        }

        if (!Wallet.haveMoney(price)) {
            // comer comida
        } else {
            System.out.println(poorGuy);
        }
    };

    // seleciona a comida
    public static void menuSelect() {
        // start scanner
        Scanner sc = new Scanner(System.in);

        // start cardapio
        System.out.println(TextResources.quests[1]);
        String optionFood1 = sc.nextLine();

        // verificador
        if (MetodsResources.isConvertibleToInt(optionFood1) == 1) {
            System.out.println("É necessario escolher uma opção");
        } else if (MetodsResources.isConvertibleToInt(optionFood1) == 2) {
            //pega a escolha de comida
            int optionFood2 = Integer.parseInt(optionFood1);

            // verifica se o player nn quer voltar
            if (optionFood2 == 7) {
                // voltar pro menu
            } else {
                switchFood(optionFood2);
            }
        } else if (MetodsResources.isConvertibleToInt(optionFood1) == 3) {
            System.out.println("Digite apenas numeros");
        } else {
            System.out.println("Opção invalida!");
        }
    }
}
