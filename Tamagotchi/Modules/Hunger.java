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

        // switch da escolha
        switch (optionSelected) {
            case 1:
                if (!Wallet.haveMoney(12.00)) {
                    // comer comida
                } else {
                    System.out.println(poorGuy);
                }
                break;
            case 2:
                if (!Wallet.haveMoney(8.00)) {
                    // comer comida
                } else {
                    System.out.println(poorGuy);
                }
                break;
            case 3:
                if (!Wallet.haveMoney(15.00)) {
                    // comer comida
                } else {
                    System.out.println(poorGuy);
                }
                break;
            case 4:
                if (!Wallet.haveMoney(25.00)) {
                    // comer comida
                } else {
                    System.out.println(poorGuy);
                }
                break;
            case 5:
                if (!Wallet.haveMoney(5.00)) {
                    // comer comida
                } else {
                    System.out.println(poorGuy);
                }
                break;
            case 6:
                if (!Wallet.haveMoney(7.00)) {
                    // comer comida
                } else {
                    System.out.println(poorGuy);
                }
                break;
            default:
                System.out.println("Digite apenas uma das opções disponiveis!");
        }
    };

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
